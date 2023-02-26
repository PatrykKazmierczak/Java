package TestbasicExercise;


import org.junit.jupiter.api.Test;

import static org.example.BasicExercise.MethodChallenge.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestMethodChallenge {

    @Test
    public void testHighScorePositionGreaterOrEqualThousand() {
        int score = 1000;
        int result = calculateHighScorePosition(score);
        assertEquals(1,result);
    }
    @Test
    public void testHighScorePositionGreaterOrEqualFiveHundred() {
        int score = 500;
        int result = calculateHighScorePosition(score);
        assertEquals(2,result);
    }
    @Test
    public void testHighScorePositionGreaterOrEqualHundred() {
        int score = 100;
        int result = calculateHighScorePosition(score);
        assertEquals(3,result);
    }
    @Test
    public void testHighScoreDifferentThanOther() {
        int score = 50;
        int result = calculateHighScorePosition(score);
        assertEquals(4,result);
    }
    @Test
    public void testDisplayHighScorePosition() {
        String name = "John";
        int position = 1;
        String result = displayHighScorePosition(name, position);
        assertEquals(name, result);
    }
    @Test
    public void testCalculateHighScorePosition() {
        int score = 1200;
        int result = calculateHighScorePosition(score);
        assertEquals(1,result);
    }
    @Test
    public void testAddNumbers() {
        int number1 = 25;
        int number2 = 25;
        int result = addNumbers(number1, number2);
        assertEquals(50, result);
    }
    @Test
    public void testSubstractNumbers() {
        int number1 = 15;
        int number2 = 5;
        int result = substractNumbers(number1, number2);
        assertEquals(10,result );
    }
}
