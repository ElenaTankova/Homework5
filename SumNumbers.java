package Homework5;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SumNumbers {
    public static void main(String args[])
    {
    int counter, num, array[];

    Scanner input = new Scanner(System.in);
            System.out.println("Enter number of elements:");
    num = input.nextInt();

    array = new int[num];
            System.out.println("Enter " + num + " integers");

            for (counter = 0; counter < num; counter++)
    array[counter] = input.nextInt();

        int sum = IntStream.of(array).sum();
        System.out.println("The sum is " + sum);
    }
}
