package az.edu.turing;

import java.util.Scanner;

public class DollarsInBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long  money=1;
        long N=1;
        long  S = sc.nextLong();
     if (S>=1&&S<=Math.pow(2,40)){

            while (money<S){
            money+=money+N;
            N++;}
            System.out.println(N-1);
        }
    }}

