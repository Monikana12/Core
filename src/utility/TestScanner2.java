package utility;

import java.util.Scanner;

public class TestScanner2 {

    public static void studentInfo() {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = scanner.nextInt();
        Long moblieNum = scanner.nextLong();
        char gender = scanner.next().charAt(0);

        System.out.println("name");
        System.out.println(age);
        System.out.println(moblieNum);
        System.out.println(gender);

    }

    public static void main(String[] args) {
    studentInfo();
    }
}