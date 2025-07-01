package dev.lpa;

import java.util.Scanner;

public class ArraysChallenge2 {

    public static void main(String[] args) {
        int[] userInput = getIntegers(5);
        printArray(userInput);

        for (int i = 0; i < userInput.length; i++) {
            System.out.println("Element #" + i + " : " + userInput[i]);
        }
    }


    public static int[] getIntegers(int size) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Element " + array[i] + " ");
        }
    }
}
