package az.edu.turing;

import java.util.Scanner;

public class SumOfSquaresB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if (n >= 1 && n <= Math.pow(10, 6)) {
            long cem = n * (n + 1) * (2 * n + 1) / 6;
            System.out.println(cem);
        }
    }
}