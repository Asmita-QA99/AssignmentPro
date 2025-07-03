package dayofweek;

import java.util.Scanner;

public class DayOfWeekClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number from 1 to 7 to get the day of the week: ");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.print("1 - Sunday");
                break;
            case 2:
                System.out.print("2 - Monday");
                break;

            case 3:
                System.out.print("3 - Tuesday");
                break;
            case 4:
                System.out.print("4 - Wednesday");
                break;
            case 5:
                System.out.print("5 - Thursday");
                break;
            case 6:
                System.out.print("6 - Friday");
                break;
            case 7:
                System.out.print("7 - Saturday");
                break;

            default:
                System.out.println("Invalid input!");


        }

    }
}
