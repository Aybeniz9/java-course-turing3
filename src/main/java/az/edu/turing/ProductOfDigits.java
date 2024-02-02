package az.edu.turing;

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a>=100&&a<=999){

            int firstDigit = a / 100;

            int secondDigit = (a/ 10) % 10;

            int thirdDigit = a% 10;
            System.out.println(firstDigit*secondDigit*thirdDigit);
        }

    }
}