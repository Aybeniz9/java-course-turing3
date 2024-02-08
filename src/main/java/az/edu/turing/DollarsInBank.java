package az.edu.turing;

import java.util.Scanner;

public class DollarsInBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long money = 0;
        long N = 0;
        long S = sc.nextLong();
            while (money < S) {
                N++;
                money = money*2+N;
            }
            System.out.println(N-1 );
        }
    }


