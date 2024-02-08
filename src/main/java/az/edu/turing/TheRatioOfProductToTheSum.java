package az.edu.turing;

import java.util.Scanner;

public class TheRatioOfProductToTheSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        int number = n;
        int product = 1;
        if (n >= 0 && n <= 2 * Math.pow(10, 9)) {
            while (number > 0) {
                int digit = number % 10;
                product *= digit;
                sum += digit;
                number /= 10;
            }
            double ratio = (double) product / sum;
            System.out.printf("%.3f\n", ratio);
        }
    }
}