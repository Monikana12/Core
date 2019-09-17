package datastructure.array;

import java.util.Scanner;

public class ScannerArray {

    public static void main(String[] args) {
        int[] studentId =new int[5];

        Scanner scanner =new Scanner (System.in);

        for(int i=0;i<5;i++){
            System.out.println("insert value:");
            int newValue =scanner.nextInt();
            studentId[i] =newValue;
        }

        for(int i=0;i <studentId.length;i++) {
            System.out.println(studentId[i]);
        }
    }
}
