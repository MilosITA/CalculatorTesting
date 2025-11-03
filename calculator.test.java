import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testSabiranje() {
        double rezultat = 5 + 3;
        assertEquals(8, rezultat, 0.001);
    }

    @Test
    public void testOduzimanje() {
        double rezultat = 10 - 4;
        assertEquals(6, rezultat, 0.001);
    }

    @Test
    public void testMnozenje() {
        double rezultat = 7 * 6;
        assertEquals(42, rezultat, 0.001);
    }

    @Test
    public void testDeljenje() {
        double rezultat = 20 / 4;
        assertEquals(5, rezultat, 0.001);
    }

    @Test
    public void testDeljenjeNulom() {
        double rezultat;
        try {
            rezultat = 10 / 0;
            fail("Očekivana greška: deljenje nulom");
        } catch (ArithmeticException e) {
            assertTrue(true);
        }
    }
}
