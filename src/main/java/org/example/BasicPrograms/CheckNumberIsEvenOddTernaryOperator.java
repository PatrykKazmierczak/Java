package org.example.BasicPrograms;

import java.util.Scanner;

public class CheckNumberIsEvenOddTernaryOperator {
    public static void main(String[] args) {

        int number;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number ");
        number = sc.nextInt();

        sc.close();

//        if (number % 2 == 0)
//            System.out.println(number + " is even number");
//        else
//            System.out.println(number + " is odd number");
//        }
        String evenOrOdd = number % 2 == 0 ? "even number" : "odd number";
        System.out.println(number + " is " + evenOrOdd);
    }
}


