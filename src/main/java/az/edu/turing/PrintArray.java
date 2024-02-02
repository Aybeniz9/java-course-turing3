package az.edu.turing;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[]arr=new int[n];
        if (n>=1&&n<=100){
            for (int i = 0; i <n; i++) {
                arr[i]=sc.nextInt();

            }
            for (int i = 0; i <arr.length ; i++) {
                System.out.println(arr[i]);
            }

        }
    }
}