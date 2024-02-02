package az.edu.turing;

import java.util.Scanner;

public class ValueOfVariable4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();
        double y = (2*x-1)/(Math.pow(x,2))+ (Math.sqrt(x*x+1))/2;
        System.out.printf("%.3f", y);
    }
}
