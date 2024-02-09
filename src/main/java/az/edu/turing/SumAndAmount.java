package az.edu.turing;

import java.util.Scanner;

public class SumAndAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int amount = 0;
        while (sc.hasNext()) {
            int num = sc.nextInt();


            sum += num;
            amount++;
        }
        System.out.print(amount + " " + sum);
    }
}