package org.example;

public class Main {
    public static void main(String[] args) {
        String myString = "This is my String";

        System.out.println(myString);

        myString = myString + " Appended";

        System.out.println(myString);

        // Number String
        String numString = "123";
        numString = numString + "456";

        System.out.println(numString);

        int num = 7;
        numString = numString + num;

        System.out.println(numString);

    }
}