package az.edu.turing;

import java.util.Scanner;

public class Function1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){

            float x = sc.nextFloat();
            double  y= (Math.pow(x,3)+2*Math.pow(x,2)-3);
            System.out.printf("%.4f\n",y);
        }
    }
}