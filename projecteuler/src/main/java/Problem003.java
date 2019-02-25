/**
 * What is the largest prime factor of the given number
 */
public class Problem003 {
    static long largestPrimeFactor(long number) {
        long largest = 1;
        long prime = 2;
        while(prime<=number) {
            if(number % prime != 0) prime++;
            else {
                largest = prime;
                number = number/prime;
            }
        }
        return largest;
    }
}
