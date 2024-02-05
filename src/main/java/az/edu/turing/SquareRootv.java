package az.edu.turing;

import java.util.Scanner;

public class SquareRootv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n <= Math.pow(10, 16) && n >= 1) {

            System.out.printf("%.6f", Math.sqrt(n));
        }
    }
}