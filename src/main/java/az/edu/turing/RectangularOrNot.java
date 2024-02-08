package az.edu.turing;

import java.util.Scanner;

public class RectangularOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int aSquared = a * a;
        int bSquared = b * b;
        int cSquared = c * c;

        // Check if the triangle is rectangular
        boolean isRectangular = (aSquared + bSquared == cSquared) ||
                (aSquared + cSquared == bSquared) ||
                (bSquared + cSquared == aSquared);

        // Print the result
        if (isRectangular) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
