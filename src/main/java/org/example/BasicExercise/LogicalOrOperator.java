package org.example.BasicExercise;

public class LogicalOrOperator {
    public static void main(String[] args) {

        int topScore = 80;
        if(topScore == 100) {
            System.out.println("You got the high score!");
        }
        int secondTopScore = 81;
        if(topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second score and less than 100");
        }
        if(((topScore > 90) && (secondTopScore <= 90))) {
            System.out.println("Either or both of the conditions are true");
        }
    }
}

