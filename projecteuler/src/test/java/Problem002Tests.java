import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem002Tests {
    @Test
    public void fibonacciEvenSumDepth10Is188() {
        assertEquals(60696, Problem002.fibonacciEvenSum(23));
    }

    @Test
    public void fibonacciEvenSumDepth23Is60696() {
        assertEquals(60696, Problem002.fibonacciEvenSum(23));
    }

    @Test
    public void fibonacciEvenSumDepth43Is1485607536() {
        assertEquals(1485607536, Problem002.fibonacciEvenSum(43));
    }
}
