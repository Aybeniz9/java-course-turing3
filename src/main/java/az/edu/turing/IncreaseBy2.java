package az.edu.turing;

import java.util.Scanner;

public class IncreaseBy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        if ( n <= 100) {
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

            }
            for (int i = 0; i < n; i++) {
                if (arr[i] >= 0) {
                    arr[i] +=2;
                }
            }  for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);}
            }
        }
    }
