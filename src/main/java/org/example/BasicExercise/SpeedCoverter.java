package org.example.BasicExercise;

public class SpeedCoverter {

   /* Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour. This method needs to return the rounded value of the calculation of type long.

    If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to indicate an invalid value.

            Otherwise, if it is positive, calculate the value of miles per hour, round it and return it. For conversion and rounding, check the notes in the text below.

    Examples of input/output:

    toMilesPerHour(1.5); → sho uld return value 1

    toMilesPerHour(10.25); → should return value 6

    toMilesPerHour(-5.6); → should return value -1

    toMilesPerHour(25.42); → should return value 16

    toMilesPerHour(75.114); → should return value 47


    //1 km = 0,6215 mile */

    public static void main(String[] args) {

//        toMilesPerHour(1.5); → should return value 1
//        toMilesPerHour(10.25); → should return value 6
//        toMilesPerHour(-5.6); → should return value -1
//        toMilesPerHour(25.42); → should return value 16
//        toMilesPerHour(75.114); → should return value 47

        toMilesPerHour(10.25);
        printConversion(10.25);

    }
    public static double toMilesPerHour (double kilometersPerHour) {

        long milesPerHour = 0;
        if (kilometersPerHour < 0) {
            System.out.println("-1");
            return -1;
        } else if (kilometersPerHour > 0) {
            double mile = 0.6215;
            milesPerHour = Math.round(kilometersPerHour * mile);
            System.out.println(milesPerHour);
        }
        return Math.round(milesPerHour);
    }
    /*2. Write another method called printConversion with 1 parameter of type double with the name kilometersPerHour.

    This method should not return anything (void) and it needs to calculate milesPerHour from the kilometersPerHour parameter. */
    public static double printConversion(double kilometersPerHour){

        if(kilometersPerHour < 0) {
            System.out.println("Invalid value");
        } else if (kilometersPerHour > 0) {
            System.out.println(kilometersPerHour + " km/h " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
        return kilometersPerHour;
    }
}
