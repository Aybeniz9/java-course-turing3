package az.edu.turing;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int kok= (int) Math.sqrt(n);
        if (kok*kok==n){
            System.out.println(kok);
        }
        else {
            System.out.println("Is not kok");
        }
}}
