BEGIN
    FOR rec IN (SELECT CustomerID, InterestRate FROM Loans WHERE CustomerID IN (SELECT CustomerID FROM Customers WHERE Age > 60)) 
    LOOP
        UPDATE Loans
        SET InterestRate = InterestRate - (InterestRate * 0.01)
        WHERE CustomerID = rec.CustomerID;

        DBMS_OUTPUT.PUT_LINE('1% Discount applied for Customer ID: ' || rec.CustomerID);
    END LOOP;
END;

