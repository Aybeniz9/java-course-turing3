package az.edu.turing;

import java.util.Scanner;

public class SumDivisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        long sum = 0;
        long n = 0;
        while (true) {
            n++;
            sum += n;
            if (sum % k == 0) {
                System.out.println(n);
                break;
            }
        }
    }
    }