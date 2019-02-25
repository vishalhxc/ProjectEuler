/**
 * By considering the terms in the Fibonacci sequence whose values
 * do not exceed n-th term, find the sum of the even-valued terms
 */
public class Problem002 {
    static int fibonacciEvenSum(int depth) {
        int second = 1;
        if(depth==0) return second;
        int last = 1;
        if(depth==1) return last;
        int sum = 0;
        for(int i=0; i<=depth; i++) {
            int current = last + second;
            if(current % 2 == 0) sum += current;

            second = last;
            last = current;
        }
        return sum;
    }
}
