package az.edu.turing;
//x<=Math.pow(10,6)&&x>=0 &&y<=Math.pow(10,6)&&y>=0&&

import java.util.Scanner;

public class Function5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        long y=sc.nextLong();
        long z=sc.nextLong();
       long a =x*y*z+x+y*y+z*z*z;
        if (x>=0 &&x<=Math.pow(10,6)&&x>=0 &&y<=Math.pow(10,6)&&y>=0&&y>=0&&z<=Math.pow(10,6)&&z>=0){
            System.out.println( a);
        }

    }
}
