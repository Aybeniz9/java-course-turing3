package az.edu.turing;

import java.util.Scanner;

public class OddElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []numbers=new int[n];
        if (n>=0&&n <= 100) {
            for (int i = 0; i < n; i++) {
                numbers[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (numbers[i] % 2 != 0) {
                    System.out.print(numbers[i]+" ");
                }

            }
        }}}