package az.edu.turing;
import java.util.Scanner;
public class SumDivisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k=1;
        double sum=0;
        if (k<=Math.pow(10,8)&&k>0&&n>0){
         while(true){
            sum+=n;

        if (sum%k==0){
            break;

            }
          k++;
        }
            System.out.println(n);
    }
}}