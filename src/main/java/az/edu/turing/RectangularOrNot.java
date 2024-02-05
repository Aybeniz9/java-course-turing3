package az.edu.turing;

import java.util.Scanner;

public class RectangularOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a>0&&a<=Math.pow(10,2)&&b>0&&b<=Math.pow(10,2)&&c>0&&c<=Math.pow(10,2)){
            if ((Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2))||(Math.pow(a,2)+Math.pow(c,2)==Math.pow(b,2))||(Math.pow(c,2)+Math.pow(b,2)==Math.pow(a,2))){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }

    }
}
