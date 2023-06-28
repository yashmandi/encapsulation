public class BankAccountCaller {
    public static void main(String[] args) {
        
        // Creating object of "BankAccount"
        BankAccount ba1 = new BankAccount();
        BankAccount ba2 = new BankAccount();

        // Setting values using setter
        ba1.setAccountNo("BA-100");
        ba1.setBalance(10000);

        ba2.setAccountNo("BA-200");
        ba2.setBalance(5000);

        // Getting values using getter
        String account1 = ba1.getAccountNo();
        int balance1 = ba1.getBalance();

        String account2 = ba2.getAccountNo();
        int balance2 = ba2.getBalance();

        // Printing the result 
        System.out.println("For Account 1: ");
        System.out.println("Account Number: " + account1);
        System.out.println("Balance: " + balance1);

        System.out.println("For Account 2: ");
        System.out.println("Account Number: " + account2);
        System.out.println("Balance: " + balance2);
    }
}
