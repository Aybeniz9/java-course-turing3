package az.edu.turing;

import java.util.Scanner;

public class DegreeOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n > 0) {
            boolean found = false;
            for (int i = 0; i <= n/2; i++) {
                if (Math.pow(2, i) == n) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
