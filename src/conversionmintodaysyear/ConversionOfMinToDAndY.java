package conversionmintodaysyear;

import java.util.Scanner;

public class ConversionOfMinToDAndY {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the minute");
        int minute = sc.nextInt();

        int days = minute / 1440;                                       // because 1 day = 24 hours
        System.out.println("Minute in days:" + days  + "days");            // 1 hour = 60 min
                                                                          // so, days = minute/(24*60)
        int year = minute / 525600;                                         //        = minute/1440
        System.out.println("Minute in year:" + year  + "year");
                                                                           // 1 year = 365 days
                                                                          // 1 hour = 60 min
                                                                         // 1 day = 24 hours = 24*60=1440 min
    }                                                                    // 1 year = minute/(365*1440)
                                                                         // = minute/525,600
}









