import java.util.Scanner;

public class FindFactorOfGivenNumber {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number:");

            int number = scan.nextInt();
            System.out.println("Factors of "  + number +  " are: ") ;
            for(int i =1; i<=number; i++){
                if(number % i == 0){
                    System.out.println(i + "");
                }
            }
            scan.close();
        }
    }


