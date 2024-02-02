package az.edu.turing;

import java.util.Scanner;
public class ProblemOfabsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int cem = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (Math.abs(a) <= 3 * Math.pow(10, 3) && Math.abs(b) <= 3 * Math.pow(10, 3)) {
                cem += a + b;
            }
            System.out.println(cem);
        }
    }
}
