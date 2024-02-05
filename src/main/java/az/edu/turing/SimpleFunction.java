package az.edu.turing;
import java.util.Scanner;

public class SimpleFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y=x+Math.sin(x);
        System.out.printf("%.4f",y);
    }
}