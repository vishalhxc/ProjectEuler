/**
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to n?
 */
public class Problem005 {
    static long smallestMultiple(long number) {
        for(long dividend=number*2; dividend>number; dividend += number) {
            innerloop:
            for(long divisor=number-1; divisor >= 1; divisor--) {
                if(dividend % divisor != 0) {
                    break innerloop;
                }
                if(divisor == 1) {
                    return dividend;
                }
            }
        }
        return 1;
    }
}
