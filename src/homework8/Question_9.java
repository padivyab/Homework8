/* 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number). */
package homework8;

public class Question_9 {
    public static void main(String[] args) {
        int n1=1,n2=1,n3,i,count=8;
        System.out.print(n1+" "+n2);//printing 0 and 1

        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
