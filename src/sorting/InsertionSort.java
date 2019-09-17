package sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arrayOfNumbers = {22, 1, 33, 42, 4, 7, 2, 9};

        for (int i = 1; i < arrayOfNumbers.length; i++) {
            int j = i - 1;
            int point = arrayOfNumbers[i];
            while (j >= 0 && arrayOfNumbers[j] > point) {
                arrayOfNumbers[j + 1] = arrayOfNumbers[j];
                j = j - 1;
            }
            arrayOfNumbers[j + 1] = point;

            for (int arrayOfNumber : arrayOfNumbers) {
                System.out.print(arrayOfNumber + ", ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Final Value = ");
        for (int arrayOfNumber : arrayOfNumbers) {
            System.out.print(arrayOfNumber + ", ");
        }
    }
}