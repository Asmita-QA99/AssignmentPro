import java.util.Scanner;

public class KaprekarConstant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4 digit number: ");
        int num = sc.nextInt();

        int count = 0;

        // Repeat until we reach 6174
        while (num != 6174) {
            num = kaprekarStep(num);
            count++;
        }

        System.out.println("It takes " + count + " steps to reach 6174.");
    }

    // One step of Kaprekar's process
    public static int kaprekarStep(int num) {
        // extract digits
        int[] digits = new int[4];
        for (int i = 0; i < 4; i++) {
            digits[i] = num % 10;
            num /= 10;
        }

        // sort digits manually (ascending)
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (digits[i] > digits[j]) {
                    int temp = digits[i];
                    digits[i] = digits[j];
                    digits[j] = temp;
                }
            }
        }

        // form ascending number
        int asc = digits[0] * 1000 + digits[1] * 100 + digits[2] * 10 + digits[3];

        // form descending number
        int desc = digits[3] * 1000 + digits[2] * 100 + digits[1] * 10 + digits[0];

        return desc - asc;
    }
}
