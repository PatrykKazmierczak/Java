package org.example.BasicExercise;

import java.util.Scanner;

public class TernaryOperator {

    public static void main(String[] args) {

        String makeOfCar = "BMW";
        boolean isDomestic = makeOfCar == "BMW" ? false : true;

        if(isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        int numb1 = 10;
        int numb2 = 8;
        int max;

        System.out.println("First number: " + numb1);
        System.out.println("Second number: " + numb2);

        max = numb1>numb2  ? numb1 : numb2;

        System.out.println("Maximum is = " + max);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        double marks = sc.nextDouble();

        String result = (marks > 40) ? "pass" : "fail";

        System.out.println("Your " + result + " the exam");
        sc.close();

        double number1 = 20.00;
        double number2 = 100.00;
        double sum;
        double multiplySum;
        double reminder = 4.00;
        double number3 = 30.00;
        double check = 0.00;

        sum = number1 + number2;

        multiplySum = sum / number3;

        double checkReminder = multiplySum / reminder;

        System.out.println(sum);
        System.out.println(multiplySum);
        System.out.println(multiplySum / reminder);

        boolean isTrue = (checkReminder == check) ? true : false;

        if(isTrue) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
