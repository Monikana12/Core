package com.condition;

public class Execption {

    public static void main(String[] args) {
        String[] name = {"Mr X", "Mr Y", "Mr Z"};
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);

        try {
            System.out.println(name[4]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("exception");
        }

        int num[] ={10,60,80};

        try{
            System.out.println(num[3]);
        }catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("koko");
        }

        try {
            System.out.println(name[4]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("caught");
            ex.printStackTrace();
        }

        finally {

        }



    }
}
