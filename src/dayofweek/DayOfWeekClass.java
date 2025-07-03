package dayofweek;

import java.util.Scanner;

public class DayOfWeekClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number from 1 to 7 to get the day of the week: ");
        int day = sc.nextInt();

        if(day == 1) {
            System.out.println(" 1 - Sunday");
        }
        else if(day == 2) {
            System.out.println(" 2 - Monday");
        }
        else if(day == 3) {
            System.out.println(" 3 - Tuesday");
        }
        else if(day == 4) {
            System.out.println(" 4 - Wednesday");
        }
        else if(day == 5) {
            System.out.println(" 5 - Thursday");
        }
        else if(day == 6) {
            System.out.println(" 6 - Friday");
        }
        else if(day == 7) {
            System.out.println(" 7 - Saturday");
        }

        }

    }

