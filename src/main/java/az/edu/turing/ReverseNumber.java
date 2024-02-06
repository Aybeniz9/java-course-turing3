package az.edu.turing;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long reversedNumber = 0;


        while (n > 0) {
            long digit = n % 10;
            reversedNumber = reversedNumber * 10 + digit;
            n /= 10;
        }

        System.out.println(reversedNumber);
    }
}

