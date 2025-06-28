CREATE OR REPLACE PROCEDURE TransferFunds(
    sourceAccount IN NUMBER,
    targetAccount IN NUMBER,
    amount IN NUMBER
) AS
    insufficient_balance EXCEPTION;
BEGIN
    -- Check balance
    DECLARE
        src_balance NUMBER;
    BEGIN
        SELECT Balance INTO src_balance FROM Accounts WHERE AccountID = sourceAccount;
        
        IF src_balance < amount THEN
            RAISE insufficient_balance;
        END IF;

        -- Deduct from source account
        UPDATE Accounts
        SET Balance = Balance - amount
        WHERE AccountID = sourceAccount;

        -- Add to target account
        UPDATE Accounts
        SET Balance = Balance + amount
        WHERE AccountID = targetAccount;

        DBMS_OUTPUT.PUT_LINE('Transfer of ' || amount || ' completed from Account ' || sourceAccount || ' to Account ' || targetAccount);
    END;
EXCEPTION
    WHEN insufficient_balance THEN
        DBMS_OUTPUT.PUT_LINE('Transfer failed: Insufficient balance in Account ' || sourceAccount);
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('An unexpected error occurred during transfer.');
END;

