package org.example;


public class Main {

    int x = 5;

    public static void main(String[] args) {

        Main myObj = new Main();

        System.out.println(myObj.x);
        System.out.println("Hello world!");
        String name = "John";
        System.out.println(name);

        int number1 = 20;
        int number2 = 10;

        System.out.println(number1 + number2);

        String[] names = {"James", "Alex"};

        for (int i =0; i <= names.length; i++) {
            System.out.println(names[i]);
        }
    }
}




