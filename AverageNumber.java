package Homework5;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String args[])
    {
        int counter,num, total = 0, array[];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        num = input.nextInt();

        array = new int[num];
        System.out.println("Enter " + num + " integers");

        for (counter = 0; counter < num; counter++)
            array[counter] = input.nextInt();


        for(int i=0; i<array.length; i++){
            total = total + array[i];
        }
        double average = total / array.length;

        System.out.format("The average is: %.1f", average);
    }
}
