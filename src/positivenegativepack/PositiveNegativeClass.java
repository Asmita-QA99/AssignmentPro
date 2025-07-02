package positivenegativepack;

import javax.swing.*;
import java.util.Scanner;

public class PositiveNegativeClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Number is positive");
        }
        else{
            System.out.println("Number is negative");
        }

    }
}