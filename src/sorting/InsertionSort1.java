package sorting;

import java.lang.reflect.Array;

public class InsertionSort1 {

    public static void main(String[] args) {
        InsertionSort1 insertionSort1 = new InsertionSort1();

        int[] arrayOfNumbers = {22, 1, 33, 42, 4, 7, 2, 9};

        int[] sortedArray = insertionSort1.getSortedArray(arrayOfNumbers);


        System.out.println("sorted array");
        for ( int i =0; i<sortedArray.length;i++) {
            System.out.print(sortedArray[i]+",");
        }
    }

    public int[] getSortedArray(int[] arrayOfNumbers) {

        for (int i = 1; i < arrayOfNumbers.length; i++) {
            int j = i - 1;
            int point = arrayOfNumbers[i];
            while (j >= 0 && arrayOfNumbers[j] > point) {
                arrayOfNumbers[j + 1] = arrayOfNumbers[j];
                j = j - 1;
            }
            arrayOfNumbers[j+1]=point;

                for (int arrayOfNumber : arrayOfNumbers) {
                    System.out.print(arrayOfNumber + ",");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Final value = ");
            for (int arrayOfNumber : arrayOfNumbers) {
                System.out.print(arrayOfNumber + ",");
            }

        return arrayOfNumbers;
    }

}