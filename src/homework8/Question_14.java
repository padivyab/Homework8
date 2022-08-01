/* 14. Write a program in Java to display the pattern like a diamond.
While loop. */
package homework8;

import java.util.Scanner;

public class Question_14 {
    public static void main(String[] args) {

        int i,j,r;

        for(i=0;i<=7;i++)
        {
            for(j=1;j<=7-i;j++)
                System.out.print(" ");
            for(j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.print("\n");
        }

        for(i=7-1;i>=1;i--)
        {
            for(j=1;j<=7-i;j++)
                System.out.print(" ");
            for(j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}
