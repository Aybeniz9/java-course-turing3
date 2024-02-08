package az.edu.turing;

import java.util.Scanner;

public class FindTheSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       double n=sc.nextDouble();
       double sum=0;
        if (n<=1000){
            sum=n/(n+1);
            System.out.printf("%.6f",sum);
        }
    }
}