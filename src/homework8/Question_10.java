/* 10. Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153. */
package homework8;

import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {

        int originalNum, digit, cubeSum = 0,num;

        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        num = sc.nextInt();
        originalNum = num;

        while (num!= 0)
        {
            digit = num % 10;
            cubeSum += Math.pow(digit, 3);
            num /= 10;
        }

        if(cubeSum == originalNum)
            System.out.println(originalNum+ " is an Armstrong number");
        else
            System.out.println(originalNum+ " is not an Armstrong number");
    }
    }

