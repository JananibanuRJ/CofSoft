package CofSoft;
import java.util.Scanner;
public class ATMmachine implements ATM {
		    private int balance;

		    public ATMmachine(int initialBalance) {
		        this.balance = initialBalance;
		    }

		    public void deposit(int amount) {
		        balance += amount;
		        System.out.println("Your money has been successfully deposited.");
		    }

		    public void withdraw(int amount) {
		        if (balance >= amount) {
		            balance -= amount;
		            System.out.println("Please collect your money.");
		        } else {
		            System.out.println("Insufficient Balance.");
		        }
		    }

		    public void checkBalance() {
		        System.out.println("Balance: " + balance);
		    }

		    public static void main(String[] args) {
		        ATMmachine atm = new ATMmachine(50000);
		        Scanner sc = new Scanner(System.in);

		        while (true) {
		            System.out.println("Automated Teller Machine");
		            System.out.println("Choose 1 for Deposit");
		            System.out.println("Choose 2 for Withdraw");
		            System.out.println("Choose 3 for Check Balance");
		            System.out.println("Choose 4 for EXIT");
		            System.out.print("Choose the operation you want to perform:");

		            int choice = sc.nextInt();
		            switch (choice) {
		                case 1:
		                    System.out.print("Enter money to be deposited:");
		                    int depositAmount = sc.nextInt();
		                    atm.deposit(depositAmount);
		                    System.out.println("");
		                    break;

		                case 2:
		                    System.out.print("Enter money to be withdrawn:");
		                    int withdrawAmount = sc.nextInt();
		                    atm.withdraw(withdrawAmount);
		                    System.out.println("");
		                    break;

		                case 3:
		                    atm.checkBalance();
		                    System.out.println("");
		                    break;

		                case 4:
		                    System.exit(0);
		            }
		        }
		    }
	

}
