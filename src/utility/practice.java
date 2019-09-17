package utility;

public class practice {
    public static void main(String[] args) {

        String[] name = new String[3];

        name[0] = "dina";
        name[1] = "bina";
        name[2] = "kona";

        System.out.println(name.length);
        System.out.println(name[2]);
        String[] newArray = name.clone();
        System.out.println(newArray.length);
        System.out.println(newArray[2]);
    }
}