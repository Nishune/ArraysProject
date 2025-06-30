package dev.lpa;

public class Main {

    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        myIntArray[0] = 45;
        myIntArray[1] = 1;
        myIntArray[5] = 50;
        System.out.println(myIntArray[5]);

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;

        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("First = " +firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("ArrayLength = " +arrayLength);
        int lastInArray = firstTen[arrayLength-1];
        System.out.println("lastInArray = " +lastInArray);

        int[] newArray;
        newArray = new int[]{5,4,3,2,1};
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i] + " ");
        }
    }
}
