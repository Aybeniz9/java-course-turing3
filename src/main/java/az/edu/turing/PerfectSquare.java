package az.edu.turing;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=1;
        if (n>=0){
            while(m*m<n){
                m++;
            }

        if (m*m==n){
            System.out.println(m);
        }
        else {
            System.out.println("No");
        }
}}}
