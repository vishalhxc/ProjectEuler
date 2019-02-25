import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Problem005Tests {
    @Test
    public void smallestMultipleOf7Is420() {
        assertEquals(420, Problem005.smallestMultiple(7));
    }

    @Test
    public void smallestMultipleOf5Is60() {
        assertEquals(60, Problem005.smallestMultiple(5));
    }

    @Test
    public void smallestMultipleOf10Is2520() {
        assertEquals(2520, Problem005.smallestMultiple(10));
    }

    @Test
    public void smallestMultipleOf13Is360360() {
        assertEquals(360360, Problem005.smallestMultiple(13));
    }

    @Test
    public void smallestMultipleOf20Is232792560() {
        assertEquals(232792560L, Problem005.smallestMultiple(20));
    }
}
