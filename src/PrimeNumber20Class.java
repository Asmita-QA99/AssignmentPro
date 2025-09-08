public class PrimeNumber20Class {
    public static void main(String[] args) {

        int count = 0;     //to count prime numbers
        int number = 2;    // start from 2 (first prime)

        while (count < 20){
            boolean isPrime = true;

            //check divisibility
            for(int i =2; i <= number/2; i++){
                if(number % i == 0){
                    isPrime = false;
                    break;
                }
            }
               if(isPrime){
                   System.out.println(number + "");
                   count ++;

               }
            number ++;
        }

        
        
    }
}
