package az.edu.turing;
import java.util.Scanner;
public class Function2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <4 ; i++) {
        double x=sc.nextDouble();
        double y=Math.sqrt(x)+2*x+Math.sin(x);
        System.out.printf("%.4f%n",y);
    }
}}