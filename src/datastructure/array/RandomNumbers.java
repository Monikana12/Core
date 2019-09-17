package datastructure.array;

import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {

        int[] studentid = new int[5];

        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int newValue = (random.nextInt(100));
            studentid[i] = newValue;

            for (i = 0; i < studentid.length; i++) {
                System.out.println(studentid[i]);
            }
        }
    }
}