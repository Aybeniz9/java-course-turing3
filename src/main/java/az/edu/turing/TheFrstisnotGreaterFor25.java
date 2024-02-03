package az.edu.turing;

import java.util.Scanner;

public class TheFrstisnotGreaterFor25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0 && n <= 100) {
            for (int i = 0; i <n; i++) {
                double a = sc.nextDouble();

                if (a > 2.5) {
                    System.out.println(a);
                } else System.out.println("Not Found");

            }

        }
    }

}
