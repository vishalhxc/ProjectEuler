/**
 * Find the largest palindrome made from the product of two n-digit numbers.
 */
public class Problem004 {
    static int largestPalindromeProduct(int digits) {
        int maxMultiplier = (int) (Math.pow(10, digits)) - 1;
        int maxProduct = maxMultiplier * maxMultiplier;
        for(int product=maxProduct; product>0; product--) {
            String current = Integer.toString(product);
            String reverse = new StringBuilder(current).reverse().toString();
            if(!current.equals(reverse)) continue;

            for(int multiplier=maxMultiplier; multiplier>0; multiplier--) {
                if(product % multiplier != 0 || product / multiplier > maxMultiplier) {
                    continue;
                }
                return product;
            }
        }
        return 1;
    }
}
