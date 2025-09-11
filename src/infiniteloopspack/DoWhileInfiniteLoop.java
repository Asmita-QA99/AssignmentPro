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

