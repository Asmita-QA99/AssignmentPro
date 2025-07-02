package greatestnumberpack;

import java.util.Scanner;

public class GreaterNumberClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the three numbers:");

        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();

        if(number1 > number2 && number1 > number3){
            System.out.println("greater number:"  + number1);
        }
       else if(number2 > number1 && number2 > number3){
           System.out.println("greater number:" + number2);
        }

        }


    }

