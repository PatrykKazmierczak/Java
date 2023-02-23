package org.example.BasicExercise;

public class MethodesInJava {
    public static void main(String[] args) {
        calculateScore(true, 900, 5, 100);
    }
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        int finalScore = score;

        if (gameOver == true) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
