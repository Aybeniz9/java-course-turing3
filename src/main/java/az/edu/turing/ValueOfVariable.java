package az.edu.turing;

import java.util.Scanner;

public class ValueOfVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();
        double y = x-(Math.pow(x, 2) +4)/2+Math.pow(x, 3)- 3/(x+7) ;
        System.out.printf("%.3f", y);
    }
}
