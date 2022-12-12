// Reference: javatpoint dot com slash atm-program-java
import java.util.Scanner;
import java.util.Random;

public class ATM {
    public static void main(String[] args) {
        // create instance of Random class
        Random rand = new Random();

        // random balance is generated
        int balance = rand.nextInt(1000000);
        int withdraw;
        int deposit;
        //or declare and initialize all
        // int balance = rand.nextInt(1000000), withdraw, balance;

        // create Scanner class object to get user input
        Scanner sc = new Scanner(System.in);

        // keep loop active while user is using ATM
        while (true) {
            System.out.println("Hello and welcome to the ATM");
            System.out.println("1 - Withdraw");
            System.out.println("2 - Deposit");
            System.out.println("3 - Check Balance");
            System.out.println("4 - Exit");
            System.out.print("Choose the operation you want to perform: ");

            // get user's input 
            int user_input = sc.nextInt();
            switch (user_input) {
                case 1:
                System.out.println("Enter amount to be withdrawn: ");
                // get the withdraw amount from user
                withdraw = sc.nextInt();
                // now check if the balance is greater than the request withdraw amount 
                if (balance >= withdraw) {
                    balance = balance - withdraw;
                    System.out.println("Please collect your money: " + withdraw + ". Your new balance is: " + balance);
                } else {
                    System.out.println("Insufficient funds available");
                }
                System.out.println("");
                break;

                case 2:
                System.out.println("Please enter amount to be deposited: ");
                // get deposit amount
                deposit = sc.nextInt();
                // add deposit amount to balance 
                balance = balance + deposit;
                System.out.println("Your deposit has been successful. Your new balance is: " + balance);
                System.out.println("");
                break;

                case 3:
                System.out.println("Balance: " + balance);
                System.out.println("");
                break;

                case 4:
                // close Scanner (resource leak)
                sc.close();
                // exit program
                System.exit(0);

                default:
                System.out.println("Unsupported option selected. Please try again.");
            }
        }
    }
}
