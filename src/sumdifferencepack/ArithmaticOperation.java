package sumdifferencepack;
import java.util.Scanner;

public class ArithmaticOperation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First number:");
        int number1 = sc.nextInt();

        System.out.println("Enter the Second number:");
        int number2 = sc.nextInt();

        int Sum = number1 + number2;
        System.out.println("Sum: " + Sum);

        int Difference = number1 - number2;
        System.out.println("Difference: " + Difference);

        int Product = number1 * number2;
        System.out.println("Product: " + Product);

        int Average = (number1 + number2)/2;
        System.out.println("Average: " + Average);

        int Distance = number1 - number2;
        System.out.println("Distance: " + Distance);

        int Maximum = Math.max(number1,number2);
        System.out.println("Maximum: " + Maximum);

        int Minimum = Math.min(number1,number2);
        System.out.println("Minimum: " + Minimum);

    }
}