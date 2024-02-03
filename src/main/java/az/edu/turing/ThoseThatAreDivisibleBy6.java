package az.edu.turing;

import java.util.Scanner;

public class ThoseThatAreDivisibleBy6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int cem = 0;
        if (n > 0 && n <= 100) {
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a <= Math.pow(10, 4)) {
                    if (a % 6 == 0) {
                        count++;
                        cem += a;
                    }
                }
            }
            System.out.println(count + " " + cem);
        }
    }
}
