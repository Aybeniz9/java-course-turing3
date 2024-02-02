package az.edu.turing;

import java.util.Scanner;

public class PerimetrRectangle {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
   int cem=0;
    if (a>=1&&b<=1000){
        cem+=(a+b)*2;
    }
        System.out.println(cem);

}}
