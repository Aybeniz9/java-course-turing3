package az.edu.turing;

import java.util.Scanner;

public class Function1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int []arr=new int [4];


        for (int i = 0; i <arr.length; i++) {
            long x = sc.nextInt();
            double y=Math.pow(x,3)+2*Math.pow(x,2)-3;
            System.out.printf("%.4f",y);

        }

    }
}