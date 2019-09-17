package utility;

import java.util.Scanner;

public class TestScanner {

    public static int calculator() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("*** insert***");
        int a = scanner.nextInt();
        System.out.println("*** second***");
        int b = scanner.nextInt();
        int x = a + b;
        return x;
    }


    public static void main(String[] args) {
         int result =calculator();
         System.out.println("my value : " +result);


    }
}

