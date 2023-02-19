package org.example.BasicPrograms;

import java.util.Scanner;

public class AddTwoNumbersScanner {
    public static void main(String[] args) {

        int number1;
        int number2;
        int sum;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        number1 = sc.nextInt();

        System.out.println("Enter second number: ");
        number2 = sc.nextInt();

        sc.close();

        sum = number1 + number2;
        System.out.println("Sum of two numbers equals: " + sum);
    }
}
