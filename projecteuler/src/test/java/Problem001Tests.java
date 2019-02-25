import org.junit.Test;
import static org.junit.Assert.*;

public class Problem001Tests {
    @Test
    public void multiplesOf3And5Of1000Equals233168() {
        assertEquals(233168, Problem001.multiplesOf3And5(1000));
    }

    @Test
    public void multiplesOf3And5Of49Equals543() {
        assertEquals(543, Problem001.multiplesOf3And5(49));
    }

    @Test
    public void multiplesOf3And5Of19564Equals89301183() {
        assertEquals(89301183, Problem001.multiplesOf3And5(19564));
    }
}