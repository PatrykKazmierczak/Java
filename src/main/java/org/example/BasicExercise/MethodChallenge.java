package org.example.BasicExercise;

public class MethodChallenge {
    public static void main(String[] args) {


        int highScorePosition = calculateHighScorePosition(600);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Danny", highScorePosition);

        highScorePosition = calculateHighScorePosition(800);
        displayHighScorePosition("Marta", highScorePosition);

        highScorePosition = calculateHighScorePosition(700);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Kamil", highScorePosition);

        System.out.println(addNumbers(12,15));
        System.out.println(substractNumbers(60,50));
    }
    public static String displayHighScorePosition (String playersName, int playersPosition) {

        System.out.println(playersName + " managed the position " + playersPosition + " on high score list " );
        return playersName;
    }
    public static int calculateHighScorePosition (int playerScore ) {

        if(playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 /*&& playerScore < 1000*/) {
            return 2;
        } else if (playerScore >= 100 /*&& playerScore < 500*/) {
            return 3;
        }
        return 4;

        /*else {
            return 4;*/
        }
    public static int addNumbers (int number1, int number2){
        
        int result = number1 + number2;
        return result;
    }

    public static int substractNumbers (int number1, int number2) {

        int result = number1 -number2;
        return result;
    }

}

