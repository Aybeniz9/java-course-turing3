package az.edu.turing;

import java.util.Scanner;

public class TheRatioOfProductToTheSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        double k = 0;
        if (n >= 0 && n <= 2 * Math.pow(10, 9)) {
            int product = 1;
            int temp = n;
            while (temp != 0) {
                int digit = temp % 10;
                product *= digit;
                temp /= 10;
            }
            int digitSum = 0;
            temp = n;
            while (temp != 0) {
                int digit = temp % 10;
                digitSum += digit;
                temp /= 10;
            }

        }
    }
}
