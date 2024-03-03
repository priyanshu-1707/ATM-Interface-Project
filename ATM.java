import java.util.Scanner;
class ATM {
    private User currentUser;

    // Method for user authentication
    public boolean authenticateUser(String userID, String userPIN) {
        // For demonstration purposes, let's assume userID and userPIN are hardcoded
        // In a real application, these credentials would be validated against stored user data
        if ("User1".equals(userID) && "pass1".equals(userPIN)) {
            currentUser = new User(userID, userPIN, 1000.0); // Initialize with some balance
            return true;
        } else {
            return false;
        }
    }

    // Method to check account balance
    public double checkBalance() {
        return currentUser.getAccountBalance();
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= currentUser.getAccountBalance()) {
            currentUser.updateAccountBalance(-amount);
            System.out.println("Withdrawal successful. Remaining balance: " + currentUser.getAccountBalance());
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        currentUser.updateAccountBalance(amount);
        System.out.println("Deposit successful. Current balance: " + currentUser.getAccountBalance());
    }
}