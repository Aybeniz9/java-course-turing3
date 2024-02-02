package az.edu.turing;

import java.util.Scanner;

public class DollarsInBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=1;
        int S = sc.nextInt();
        if (S>=1&&S<=Math.pow(2,40)){
            N+=S*N;
            System.out.println(N);
        }
    }
}
