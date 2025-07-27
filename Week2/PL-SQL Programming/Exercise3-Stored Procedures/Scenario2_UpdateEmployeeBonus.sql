CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    deptId IN NUMBER,
    bonusPercent IN NUMBER
) AS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * bonusPercent / 100)
    WHERE DepartmentID = deptId;

    DBMS_OUTPUT.PUT_LINE('Bonus applied to Department ID: ' || deptId);
END;
