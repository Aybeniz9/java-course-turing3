package az.edu.turing;

import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a <= Math.pow(10, 9) && b <= Math.pow(10, 9)) {
            System.out.println(a*a+ b*b);
        }
    }
}