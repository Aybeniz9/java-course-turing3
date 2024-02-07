package az.edu.turing;

import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if (a <= Math.pow(10, 9) && b <= Math.pow(10, 9)) {
            System.out.println(a*a+ b*b);
        }
    }
}