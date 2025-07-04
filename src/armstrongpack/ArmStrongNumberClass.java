package armstrongpack;

import java.util.Scanner;

public class ArmStrongNumberClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check whether the number is Armstrong or not: ");
        int number = input.nextInt();

        int count = 0;
        int result = 0;
        int original = number;
        int temp = number;

        //this block will count the digit
        while (temp > 0) {

            count++;
            temp = temp / 10;
        }

        //calculate the sum of digit of power

        temp = number;
        while (temp > 0) {
            int lastdigit = temp % 10;    //this will give last digit of number

            int power = 1;
            for (int i = 1; i <= count; i++) {
                power = power * lastdigit;
            }

            result = result + power;
            temp = temp / 10;
        }

        if (result == original) {
            System.out.println("The number is Armstrong");
        } else {
            System.out.println("The number is not Armstrong");
        }
    }
}