import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the agency number: ");
        String agency = scanner.nextLine();

        System.out.print("Please enter the account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Please enter your name: ");
        String clientName = scanner.nextLine();

        System.out.print("Please enter your initial balance: ");
        double balance = scanner.nextDouble();

        System.out.println("\nHello " + clientName + ", thank you for creating an account with our bank.");
        System.out.println("Your agency number is: " + agency + ", your account number is: " + accountNumber +
                ", and your balance of $" + balance + " is now available for withdrawal.");

        scanner.close();
    }
}