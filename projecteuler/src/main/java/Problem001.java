import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Find the sum of all the multiples of 3 or 5 below the provided parameter value number.
 */
public class Problem001 {
    static int multiplesOf3And5(int constraint)
    {
        List<Integer> multiples = multiplesOfNumbers(constraint, new int[]{3,5});
        int sum=0;
        for (int multiple : multiples)
        {
            sum += multiple;
        }
        return sum;
    }

    static List<Integer> multiplesOfNumbers(int constraint, int[] values)
    {
        List<Integer> multiples = new ArrayList<Integer>();
        for(int value=0; value<values.length; value++)
        {
            for(int multiple=values[value]; multiple<constraint; multiple=multiple+values[value])
            {
                if(!multiples.contains(multiple)) multiples.add(multiple);
            }
        }
        Collections.sort(multiples);
        return multiples;
    }
}
