package Homework5;

import java.util.Arrays;
import java.util.Scanner;

public class SmallerNumber {
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

        int min = Arrays.stream(array).min().getAsInt();
        System.out.println("Smaller in given array is " +min);
    }
}
