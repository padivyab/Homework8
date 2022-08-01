/* 2. Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user entersthe number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge. */
package homework8;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int largestNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;
        int number;
        double sum = 0;
        int amountOfNumbers = 0;
        do {
            System.out.print("Enter an integer, or enter -99 to stop: ");
            number = sc.nextInt();
            if (number == -99) {
                break;
            }
            if (number > largestNumber) {
                largestNumber = number;
            }
            if (number < smallestNumber) {
                smallestNumber = number;
            }
            sum += number;
            amountOfNumbers++;
        } while (number != -99);

        if (amountOfNumbers > 0) {
            double average = sum / amountOfNumbers;
            System.out.printf("The smallest number is: %d.%n", smallestNumber);
            System.out.printf("The largest number is: %d.%n", largestNumber);

        }
    }
        /* Scanner console = new Scanner(System.in);

        int number;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        char choice;

        do
        {
            System.out.print("Enter the number ");
            number = console.nextInt();

            if(number > max)
            {
                max = number;
            }

            if(number < min)
            {
                min = number;
            }

            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);

        }while(number<0);

        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min); */
    }


