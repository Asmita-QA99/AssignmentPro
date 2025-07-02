package Converttohms;

import java.util.Scanner;

public class ConvertToHMSClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Seconds:");
        int seconds = sc.nextInt();

        int hours = seconds/3600;

        int minutes = (seconds % 3600)/60;

        int second = seconds%60;

        System.out.println(+  hours  +  " hours "  +  minutes +  " minutes "  +  second  +  " seconds ");

    }
}

//1 hour = 60 min
//1 min = 60 sec
//hour = sec/3600     //60*60=3600
//minutes = (sec%3600)/60   ----calculates remaining minutes after calculate hours from total seconds
//remainingSeconds = seconds % 60
