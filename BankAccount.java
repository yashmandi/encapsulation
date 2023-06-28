/* Q- Write a Java program to create a class called BankAccount with private instance variables accountNumber and balance.
Provide public getter and setter methods to access and modify these variables.*/

public class BankAccount {
    private String accountNo;
    private int balance;

    // Setting getters and setters to the variables
    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
