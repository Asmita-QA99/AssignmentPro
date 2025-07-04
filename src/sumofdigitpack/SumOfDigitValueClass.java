package sumofdigitpack;

import java.util.Scanner;

public class SumOfDigitValueClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number for sum of digits:");
        int number = sc.nextInt();
        int sum = 0;
        while(number!=0){
            int lastdigit = number % 10;      //get lastdigit of number
            sum = sum + lastdigit;            //sum=0
            number = number / 10;
        }
        System.out.println("The sum is: " + sum);

    }
}
