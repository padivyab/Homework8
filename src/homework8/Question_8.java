/* Display right angle triangle of @ using nested for loops. */
package homework8;

public class Question_8 {
    public static void main(String[] args) {

        for (int i = 1 ; i <= 5; i++ )
        {
            for (int j = 1 ; j <= i; j++ )
            {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
