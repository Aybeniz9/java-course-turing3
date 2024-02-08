package az.edu.turing;

import java.util.Scanner;

public class NegativeElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] numbers = new double[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextDouble();
        }
        double sum = 0;
        int count = 0;
        for (double num : numbers) {
            if (num < 0) {
                sum += num;
                count++;
            }
        }
        System.out.printf("%d %.2f", count, sum);
    }
}