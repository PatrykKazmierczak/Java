package org.example.BasicExercise;

public class MethodesInJava {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("High highScore equals: " + highScore);

        score = 950;
        levelCompleted = 5;
        bonus = 100;

        System.out.println("Next highScore is: " +
                calculateScore(gameOver, score, levelCompleted, bonus));

    }

//    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//
////        boolean gameOver = true;
////        int score = 800;
////        int levelCompleted = 5;
////        int bonus = 100;
//
//        int finalScore = score;
//
//        if (gameOver == true) {
//            finalScore += (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }
//    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }
}






