package az.edu.turing;

import java.util.Scanner;

public class DegreeOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n >= 0 && n <= Math.pow(2, 31)) {
            for (int i = 0; i <= n; i += 2) {
                if (n == Math.pow(2, i)) {

                    System.out.println("YES");
                    break;
                } else {
                    System.out.println("NO");
                }
            }
        }


    }
}