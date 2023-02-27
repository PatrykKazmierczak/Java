package TestbasicExercise;

import org.example.BasicExercise.SpeedCoverter;
import org.junit.jupiter.api.Test;

import static org.example.BasicExercise.SpeedCoverter.printConversion;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSpeedConverter {

    @Test
    public void testToMilesPerHour1() {
            double result = SpeedCoverter.toMilesPerHour(1.5);
            assertEquals(1,result);
        }
    @Test
    public void testToMilesPerHour2() {
        double result = SpeedCoverter.toMilesPerHour(10.25);
        assertEquals(6,result);
    }
    @Test
    public void testToMilesPerHour3() {
        double result = SpeedCoverter.toMilesPerHour(-5.6);
        assertEquals(-1,result);
    }
    @Test
    public void testToMilesPerHour4() {
        double result = SpeedCoverter.toMilesPerHour(25.42);
        assertEquals(16,result);
    }
    @Test
    public void testToMilesPerHour5() {
        double result = SpeedCoverter.toMilesPerHour(75.114);
        assertEquals(47,result);
    }
    @Test
    public void testPrintConversion() {
        double kilometersPerHour = 100.0;
        assertEquals(100.0, printConversion(kilometersPerHour), 0.0);
    }
}


