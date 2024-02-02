package az.edu.turing;

import java.util.Scanner;
public class SimpleProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 10 && n <= 99) {
            int firstdigit = n / 10;
            int seconddigit = n % 10;
            System.out.println(firstdigit + " " + seconddigit);
        } else {
            System.out.println("Not found");
        }
    }
}
