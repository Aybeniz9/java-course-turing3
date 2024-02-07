package az.edu.turing;

import java.util.Scanner;

public class KN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (k >= 0 && n <= 30) {
            int result = (1 << k) + (1 << n);
            System.out.println(result);
        }
    }
}