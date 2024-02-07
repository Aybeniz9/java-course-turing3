package az.edu.turing;

import java.util.Scanner;

public class MonthlyAndQuarterly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 1 && n <= 3) {
            System.out.println("First");
        } else if (n <= 6) {
            System.out.println("Second");
        } else if (n <= 9) {
            System.out.println("Third");
        } else if (n <= 12) {
            System.out.println("Fourth");
        } else {
            System.out.println("Unvaliable month");
        }
    }
}