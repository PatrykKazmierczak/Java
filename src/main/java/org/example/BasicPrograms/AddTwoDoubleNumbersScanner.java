package org.example.BasicPrograms;

import java.util.Scanner;

public class AddTwoDoubleNumbersScanner {

    public static void main(String[] args) {

        double number1;
        double number2;
        double sum;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        number1 = sc.nextDouble();

        System.out.println("Please enter second number: ");
        number2 = sc.nextDouble();

        sc.close();
        sum = number1 + number2;
        System.out.println(number1 + " + " + number2 + " equals " + sum);
    }
}
