import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem003Tests {
    @Test
    public void largestPrimeFactorPrimeNumbersEqualsSelf() {
        assertEquals(2, Problem003.largestPrimeFactor(2));
        assertEquals(3, Problem003.largestPrimeFactor(3));
        assertEquals(5, Problem003.largestPrimeFactor(5));
        assertEquals(7, Problem003.largestPrimeFactor(7));
    }

    @Test
    public void largestPrimeFactor13195Is29() {
        assertEquals(29, Problem003.largestPrimeFactor(13195));
    }

    @Test
    public void largestPrimeFactor600851475143Is6857() {
        assertEquals(6857, Problem003.largestPrimeFactor(600851475143L));
    }
}
