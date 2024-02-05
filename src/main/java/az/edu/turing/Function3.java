package az.edu.turing;

import java.util.Scanner;

public class Function3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            double x=sc.nextDouble();
            double y=sc.nextDouble();
            double f = x * x + Math.sin(x * y) - y * y;
            System.out.printf("%.4f%n", f);

        }
    }
}