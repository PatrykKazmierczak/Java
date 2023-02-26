package TestbasicExercise;

import org.example.BasicExercise.PositiveNegativZero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPositiveNegativeZero {

    @Test
    public void testPositiveNUmber() {

        int result = PositiveNegativZero.checkNumber(7);
        assertEquals(7,result);
    }
    @Test
    public void testNegativeNumber() {
        int result = PositiveNegativZero.checkNumber(-7);
        assertEquals(-7, result);
    }
    @Test
    public void testZeroNumber() {
        int result = PositiveNegativZero.checkNumber(0);
        assertEquals(0,result);
    }

}
