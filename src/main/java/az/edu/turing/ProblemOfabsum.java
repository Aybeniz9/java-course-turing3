package az.edu.turing;

import java.util.Scanner;

public class ProblemOfabsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {

            double  a = sc.nextDouble();
            double b = sc.nextDouble();

            if (Math.abs(a) <= 30000 && Math.abs(b) <= 30000) {
                System.out.println(a + b);
            }
        }
    }
}
