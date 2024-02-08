package az.edu.turing;

import java.util.Scanner;

public class TheArithmeticMeanOfPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double cem = 0;
        int count = 0;
        double[] numbers = new double[n];
        if (n > 0 && n <= 100) {
            for (int i = 0; i < n; i++) {
                numbers[i] = sc.nextDouble();
            }
            for (int i = 0; i < n; i++) {
                if (numbers[i] > 0) {
                    cem += numbers[i];
                    count++;
                }
            }
            if (count > 0) {
                double result = cem / count;
                System.out.printf("%.2f", result);
            } else {
                System.out.println("Not Found");
            }
        }
    }
}



