package az.edu.turing;
import java.util.Scanner;
public class SumAndAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int amount=0;
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i]<=100){
            arr[i]=sc.nextInt();
            sum+=arr[i];
            amount++;
        }
        System.out.println(amount+" "+sum);
    }
}}