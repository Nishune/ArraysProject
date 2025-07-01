package dev.lpa;

import java.util.Scanner;

public class ArraysChallenge2 {

    public static void main(String[] args) {
        int[] userInput = getIntegers(5);
        int[] sortedArray = sortIntegers(userInput);
        printArray(sortedArray);

    }


    public static int[] getIntegers(int size) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter numbers: ");
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {

        int[] sortedArray = array.clone();

        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;

            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
