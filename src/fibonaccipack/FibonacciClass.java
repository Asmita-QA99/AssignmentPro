package fibonaccipack;

import org.w3c.dom.ls.LSOutput;

public class FibonacciClass {
    public static void main(String[] args) {

     int first = 0;
     int second = 1;
     int count = 10;
     int i = 0;

     while(i < count) {
         System.out.println(first+ "");

         int next = first + second;
         first = second;             // shift second number to first position
         second = next;              // second number position take next number
         i++;                        // i value increment by 1
     }

    }

}