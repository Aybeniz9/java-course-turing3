package az.edu.turing;

import java.util.Scanner;

public class ProblemOfabsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long sum = a + b;
            System.out.println(sum);
        }
    }
}
