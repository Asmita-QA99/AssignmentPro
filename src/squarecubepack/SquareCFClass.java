package squarecubepack;

import java.util.Scanner;

public class SquareCFClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = sc.nextInt();

        int square = num * num;
        System.out.println("The square of " + num + " is " + square);

        int cube = square * num;
        System.out.println("The cube of " + num + " is " + cube);

        int fourth = cube * num;
        System.out.println("The fourth of " + num + " is " + fourth);

    }
}