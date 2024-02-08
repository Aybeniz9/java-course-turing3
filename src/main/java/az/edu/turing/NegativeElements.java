package az.edu.turing;

import java.util.Scanner;

public class NegativeElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        double cem = 0;
        double[] arr = new double[n];
        if (n > 0 && n <= 100) {
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextDouble();}
            for (int i = 0; i < arr.length; i++) {
                if (Math.abs(arr[i]) < 100) {
                    if (arr[i] < 0) {
                        cem += arr[i];
                        count++;
                    }
                }
            }
        }
        System.out.printf("%d %.2f ", count, cem);
    }
}