package az.edu.turing;

import java.util.Scanner;

public class SquareOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       long n=sc.nextLong();
        if (n>0) {
            for (int i = 1; i *i<= n; i++) {

                System.out.print(i * i + " ");
            }
        }
    }
}