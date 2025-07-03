package reversenumberpack;

import java.util.Scanner;

public class ReverseNumberClass {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number to be reversed:");
      int number = sc.nextInt();

      int reverse = 0;
      while(number!=0){
          int lastdigit = number % 10;                //get the last digit
          reverse = reverse * 10 + lastdigit;         //Append last digit
          number = number / 10;                      // gives number without last digit
      }

      System.out.println("Reversed number is: " + reverse);

    }

}