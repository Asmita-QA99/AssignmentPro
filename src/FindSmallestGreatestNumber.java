import java.util.Scanner;

public class FindSmallestGreatestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       //Take number input
        System.out.println("Enter a number");
        int number = scan.nextInt();

        int smallest = 9;
        int largest = 0;

        //Extract digits using while loop
        while(number > 0){
            int digit = number % 10;

            if(digit < smallest){
                smallest = digit;
            }
            if(digit > largest){
                largest = digit;
            }

         number = number / 10;

        }

        System.out.println("smallest digit:"  +smallest);
        System.out.println(("largest digit:"  +largest));
    }
}
