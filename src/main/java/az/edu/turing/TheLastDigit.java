package az.edu.turing;
import java.util.Scanner;
public class TheLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>=1&&n<=Math.pow(10,9)){

            System.out.println(n%10);
        }
    }
}
