package az.edu.turing;
import java.util.Scanner;
public class SumAndAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum=0;
        int amount=0;
        int[] arr= new int[5];
        for (int i = 0; i < 5; i++) {
            if (Math.abs(arr[i])<=100){
            arr[i]=sc.nextInt();
            sum+=arr[i];
            amount++;
        }}
        System.out.print(amount+" "+sum);
    }
}