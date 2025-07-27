# Cognizant Hands-on Exercise: PL/SQL Control Structures

This project contains PL/SQL scripts for common banking scenarios using control structures.

## Scenarios Covered

###1️ Apply Interest Discount for Senior Customers
- Customers above 60 years old receive a 1% discount on loan interest rates.

###2 ️Promote Customers to VIP Status
- Customers with account balances over $10,000 are flagged as VIP.

###3 Send Loan Due Reminders
- Prints reminders for loans due within the next 30 days.

## Assumed Tables

- **Customers**
  - `CustomerID`, `Age`, `Balance`, `IsVIP`
  
- **Loans**
  - `LoanID`, `CustomerID`, `InterestRate`, `DueDate`

