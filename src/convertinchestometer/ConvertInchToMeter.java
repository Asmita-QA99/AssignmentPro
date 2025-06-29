package convertinchestometer;

import java.util.Scanner;

public class ConvertInchToMeter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value in inches");
        String input = sc.nextLine();

        if (isValidNumber(input)) {
            double inches = Double.parseDouble(input);
            double meters = inches * -0.0254;
            System.out.printf("Meters: %.2f\n", meters);
        } else {
            System.out.println("Invalid output");

        }

        sc.close();

    }


    static boolean isValidNumber(String input) {
        if (input == null || input.equals("")) {
            return false;
        }

        boolean hasDecimal = false;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (i == 0 && ch == '-') {
                continue;  // allow minus sign at the start
            }

            if (ch == '.') {
                if (hasDecimal) {
                    return false; // second dot not allowed
                } else {
                    hasDecimal = true; // first dot allowed
                    continue;
                }
            }

            if (ch < '0' || ch > '9') {
                return false; // not a digit
            }
        }

        return true; // all checks passed
    }
}


