package org.example.BasicExercise;

public class TernaryOperator {

    public static void main(String[] args) {

        String makeOfCar = "BMW";
        boolean isDomestic = makeOfCar == "BMW" ? false : true;

        if(isDomestic) {
            System.out.println("This car is domestic to our country");
        }
    }
}
