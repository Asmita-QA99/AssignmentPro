package infiniteloopspack;

import java.util.Scanner;

public class DoWhileInfiniteLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            System.out.println("you entered:" +num);
        }while(true);

        }
    }


    /*
  package infiniteloopspack;

public class ForInfiniteLoop {
    public static void main(String[] args) {
        for(;;){
            System.out.println("Current Time"  +System.currentTimeMillis());
        }
    }
}

  */

/*
package infiniteloopspack;

public class WhileInfinite {
    public static void main(String[] args) {
        int i = 1;
        while(true){
            System.out.println("Number:" + i);
            i++;
        }

    }
}

 */
