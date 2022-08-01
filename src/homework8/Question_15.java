/* 15. Display left angle triangle of * using nested for loops. */
package homework8;

public class Question_15 {
    public static void main(String[] args) {

        int i, j, row=5;

        for(i=0; i<row; i++)
        {
//inner loop for columns
            for(j=0; j<=i; j++)
            {
//prints stars
                System.out.print("* ");
            }
//throws the cursor in a new line after printing each line
            System.out.println();
        }
    }
}

