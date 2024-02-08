package az.edu.turing;

import java.util.Scanner;

public class TheFrstisnotGreaterFor25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int index = 1;
        boolean found = false;
        double[] arr = new double[n];
        double value = 0;
        if (n > 0 && n <= 100) {
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextDouble();
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] < 2.5) {
                    found = true;
                    index += i;
                    value = arr[i];
                    break;
                }
            }
            if (found) {
                System.out.printf("%d %.2f", index, value);
            } else System.out.println("Not Found");
        }
    }
}


