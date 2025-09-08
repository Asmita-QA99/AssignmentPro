package atmjourney;

import java.util.Scanner;

public class ATMJourneyClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Ask user to enter account balance
        System.out.println("Enter your account balance:");
        double balance = scan.nextDouble();

        //extract integer part to validate 5 digit number
        int integerPart = (int) balance;

        //check if balance is valid 5 digit integer part
        if (integerPart >= 10000 && integerPart <= 99999) {
            System.out.println("valid balance:" + balance);

            //Ask user to withdraw amount
            System.out.println("Enter withdraw amount:");
            double withdrawAmount = scan.nextDouble();

            if (withdrawAmount <= balance) {
                balance = balance - withdrawAmount;
                System.out.println("please collect your cash:" + withdrawAmount);
                System.out.println("Transcation Successful!!");
                System.out.println("Available Balance:" + balance);
            } else {
                System.out.println("Insufficient balance!!");
            }
            } else {
            System.out.println("Invalid Balance:");
           }
        System.out.println("Thank you for using HDFC Bank ATM!!!");

    }

}






















