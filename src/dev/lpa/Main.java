package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

//        int[] myIntArray = new int[10];
//        myIntArray[0] = 45;
//        myIntArray[1] = 1;
//        myIntArray[5] = 50;
//        System.out.println(myIntArray[5]);
//
//        double[] myDoubleArray = new double[10];
//        myDoubleArray[2] = 3.5;
//
//        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println("First = " +firstTen[0]);
//        int arrayLength = firstTen.length;
//        System.out.println("ArrayLength = " +arrayLength);
//        int lastInArray = firstTen[arrayLength-1];
//        System.out.println("lastInArray = " +lastInArray);
//
//        int[] newArray;
//        newArray = new int[]{5,4,3,2,1};
//        newArray = new int[5];
//        for (int i = 0; i < newArray.length; i++) {
//            newArray[i] = newArray.length - i;
//        }
//        for (int i = 0; i < newArray.length; i++) {
//            System.out.println(newArray[i] + " ");
//        }
//
//        System.out.println();
//        for (int element : newArray) {
//            System.out.println(element + " ");
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(newArray));
//        Object objectVariable = newArray;
//        if (objectVariable instanceof int[]) {
//            System.out.println("Object variable array is int");
//        }
//
//        Object[] objectArray = new Object[3];
//        objectArray[0] = "Hello";
//        objectArray[1] = new StringBuilder("World");
//        objectArray[2] = newArray;

        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(fourthArray));
        System.out.println(Arrays.toString(thirdArray));

        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));

        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray));

        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray); //Must sort array before using binarySearch.
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Mark") >= 0) {
            System.out.println("Found Mark in the list.");
        }

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5};

        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal!");
        } else {
            System.out.println("Arrays are not equal!");
        }






        }
    private static int[] getRandomArray (int len){

        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
    }







