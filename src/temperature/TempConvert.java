package temperature;

import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature in Celsius:");
        double Celsius = sc.nextDouble();

        //using formula F = 1.8 * C + 32
        double Fahrenheit = Celsius * 1.8 + 32;
        System.out.println(Celsius + " Celsius = " + Fahrenheit + " Fahrenheit");

        //using formula  K= Celsius + 273

        int kelvin = (int) (Celsius + 273);

        System.out.println(Celsius + " Celsius = " + kelvin + " kelvin");

    }
}