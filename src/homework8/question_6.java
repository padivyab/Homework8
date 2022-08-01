/* 6.Write a program in Java to display the pattern like a triangle with a number.
For eg.
Input number of rows: 10
Expected Output: */
package homework8;

import java.util.Scanner;

public class question_6 {
    public static void main(String[] args) {
        int i,j,n;
        System.out.print("Input number of rows : ");
        Scanner sc=new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Expected Output :");

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print(j);

            System.out.println("");
        }
    }
}
