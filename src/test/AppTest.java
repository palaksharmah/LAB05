package java.com.example;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testOddOrEvenOutput() {
        App app = new App();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        app.OddOrEven();
        String expectedOutput = "odd" + System.lineSeparator() +
                               "even" + System.lineSeparator() +
                               "odd" + System.lineSeparator() +
                               "even" + System.lineSeparator() +
                               "odd" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());
        System.setOut(System.out);
    }
}
