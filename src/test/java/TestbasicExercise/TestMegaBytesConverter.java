package TestbasicExercise;

import org.example.BasicExercise.MegaBytesConverter;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMegaBytesConverter {

    @Test
    public void testNegativeInput() {
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1);
        assertEquals("Invalid Value", systemOut().getHistory());
    }

    @Test
    public void testZeroInput() {
        MegaBytesConverter.printMegaBytesAndKiloBytes(0);
        assertEquals("0 KB = 0 MB and 0 KB", systemOut().getHistory());
    }

    @Test
    public void testNonDivisibleInput() {
        MegaBytesConverter.printMegaBytesAndKiloBytes(2048);
        assertEquals("2048 KB = 2 MB and 0 KB", systemOut().getHistory());
    }

    @Test
    public void testDivisibleInput() {
        MegaBytesConverter.printMegaBytesAndKiloBytes(1024);
        assertEquals("1024 KB = 1 MB and 0 KB", systemOut().getHistory());
    }

    // Helper method to capture console output
    private Console systemOut() {
        return new Console();
    }

    private static class Console extends PrintStream {
        private final ByteArrayOutputStream out;

        public Console() {
            super(new ByteArrayOutputStream());
            out = (ByteArrayOutputStream) super.out;
        }

        public String getHistory() {
            return out.toString().trim();
        }
    }

}
