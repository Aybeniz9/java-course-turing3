package az.edu.turing;

import java.util.Scanner;

public class ValueOfVariable6 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y = Math.sqrt(Math.pow(x, 4) + 1) / Math.pow(x, 2) - (Math.sqrt(Math.pow(x,2) / (Math.pow(x,2) + 1)));
        System.out.printf("%.3f",y);
    }
}