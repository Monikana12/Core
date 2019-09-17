package com.condition;

public class ExceptionHandling {
    public static void main(String[] args) {

        String[] name = {"Mr X", "Mr Y", "Mr Z"};
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);

        try {
            System.out.println(name[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("exception  occured");
        }


        try {
            System.out.println(name[4]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("caught the exception ");
            ex.printStackTrace();
        }

        finally {

        }


    }
}