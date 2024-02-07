package az.edu.turing;

import java.util.Scanner;

public class MaximumOfAbsoluteValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] numbers = new double[n];
        if (n <= 100) {
            for (int i = 0; i < n; i++) {
                if (numbers[i] <= 100) {
                    numbers[i] = sc.nextDouble();
                }
            }
            double max = numbers[0];
            for (int i = 0; i < n; i++) {
                if (Math.abs(numbers[i]) > max) {
                    max = Math.abs(numbers[i]);
                }}
                System.out.printf("%.2f",max);
        }
    }
}