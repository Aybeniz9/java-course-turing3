package az.edu.turing;

import java.util.Scanner;

public class Transformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n += 1;
            }
            counter++;
        }
        System.out.println(counter);
    }

}



