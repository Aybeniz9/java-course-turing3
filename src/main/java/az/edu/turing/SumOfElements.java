package az.edu.turing;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double cem=0;
        for (int i = 0; i < num; i++) {
            double a = sc.nextDouble();
            cem+=a;


        }
        System.out.printf("%.1f",cem);
    }
}