package az.edu.turing;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int firstDigit = num / 100;

        int secondDigit = (num / 10) % 10;

        int thirdDigit = num % 10;
        int sum=firstDigit+secondDigit+thirdDigit;
        double kok=  Math.sqrt(sum);

            System.out.printf("%.3f",kok);

    }
}
