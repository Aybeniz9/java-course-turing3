package az.edu.turing;

import java.util.Scanner;

public class Function5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long z=sc.nextLong();
        long y = sc.nextLong();
       double a =x*y*z+x+y*y+z*z*z;
        if (x<=Math.pow(10,6)&&x>=0 &&y<=Math.pow(10,6)&&y>=0&&z<=Math.pow(10,6)&&z>=0){
            System.out.println( a);
        }

    }
}
