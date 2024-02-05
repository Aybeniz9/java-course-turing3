package az.edu.turing;

import java.util.Scanner;

public class SquareOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= Math.pow(10, 9)) {
            for (int i = 1; i < n; i++) {
                int kok = (int) Math.sqrt(i);
                if (kok * kok == i)
                    System.out.println(i);
            }
        }
    }
}