import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem004Tests {
    @Test
    public void largestPalindromeProductOf2DigitsIs9009() {
        assertEquals(9009, Problem004.largestPalindromeProduct(2));
    }

    @Test
    public void largestPalindromeProductOf3DigitsIs906609() {
        assertEquals(906609, Problem004.largestPalindromeProduct(3));
    }
}
