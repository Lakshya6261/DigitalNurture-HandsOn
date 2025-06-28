# Cognizant Hands-on Exercise: Stored Procedures

This project contains stored procedures for common banking operations.

## Scenarios Covered

###1️ Process Monthly Interest
- Applies 1% interest to all savings account balances.

###2️ Employee Bonus Scheme
- Adds a bonus percentage to salaries for employees in a specific department.

###3️ Fund Transfers
- Transfers funds between two accounts after checking sufficient balance.

## Assumed Tables

- **Accounts**
  - `AccountID`, `AccountType`, `Balance`

- **Employees**
  - `EmployeeID`, `DepartmentID`, `Salary`

```sql
EXEC ProcessMonthlyInterest;

EXEC UpdateEmployeeBonus(101, 5);

EXEC TransferFunds(2001, 2002, 500);
