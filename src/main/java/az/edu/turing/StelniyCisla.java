package az.edu.turing;
import java.util.Scanner;
public class StelniyCisla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n=sc.nextInt();
        int cisla= (int) Math.pow(a,n);
        if (a>=0&n>=0){
            System.out.println(cisla);
        }

    }
}