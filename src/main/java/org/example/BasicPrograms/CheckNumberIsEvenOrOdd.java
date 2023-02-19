package org.example.BasicPrograms;

import java.util.Scanner;

public class CheckNumberIsEvenOrOdd {
    public static void main(String[] args) {

        int number1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        number1 = sc.nextInt();

        sc.close();

        if (number1 % 2 ==0)
            System.out.println(number1 + " is even number");
        else
            System.out.println(number1 + " is odd number");
    }
}
