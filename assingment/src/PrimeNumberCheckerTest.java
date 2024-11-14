import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumberCheckerTest {

    @Test
    public void testPrimeNumbers() {
        assertTrue(PrimeNumberChecker.isPrime(2));
        assertTrue(PrimeNumberChecker.isPrime(3));
        assertTrue(PrimeNumberChecker.isPrime(5));
        assertTrue(PrimeNumberChecker.isPrime(7));
        assertTrue(PrimeNumberChecker.isPrime(11));
        assertTrue(PrimeNumberChecker.isPrime(13));
        assertTrue(PrimeNumberChecker.isPrime(17));
        assertTrue(PrimeNumberChecker.isPrime(19));
        assertTrue(PrimeNumberChecker.isPrime(23));
        assertTrue(PrimeNumberChecker.isPrime(29));
    }

    @Test
    public void testNonPrimeNumbers() {
        assertFalse(PrimeNumberChecker.isPrime(1));
        assertFalse(PrimeNumberChecker.isPrime(4));
        assertFalse(PrimeNumberChecker.isPrime(6));
        assertFalse(PrimeNumberChecker.isPrime(9));
        assertFalse(PrimeNumberChecker.isPrime(10));
        assertFalse(PrimeNumberChecker.isPrime(12));
        assertFalse(PrimeNumberChecker.isPrime(15));
        assertFalse(PrimeNumberChecker.isPrime(21));
        assertFalse(PrimeNumberChecker.isPrime(25));
        assertFalse(PrimeNumberChecker.isPrime(27));
    }
}