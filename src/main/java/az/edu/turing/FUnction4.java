package az.edu.turing;

import java.util.Scanner;

public class FUnction4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long  x = sc.nextInt();
        long y = 1+x+x*x;
        if (x<=Math.pow(10,9)&&x>=0){
        System.out.println( y);
    }

}}
