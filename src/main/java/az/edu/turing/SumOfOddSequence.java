package az.edu.turing;

import java.util.Scanner;

public class SumOfOddSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int sum = 0;
            int N = sc.nextInt();
            if (N >= 1 && N <= 100) {
                for (int i = 1; i <= N; i += 2) {

                    sum += i;
                }
            }
            System.out.println(sum);
        }
    }
}