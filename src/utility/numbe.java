package utility;

public class numbe {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            int prime = 0;
            for (int x = 1; x <= i; x++) {
                if (i % x == 0) {
                    prime++;
                }
            }
            if (prime <= 2)
                System.out.println(i);
        }


    }
}
