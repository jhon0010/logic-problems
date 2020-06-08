package practice.problems;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class PowerOfTwo {

    private static final Logger LOGGER = getLogger(PowerOfTwo.class);

    public static void main(String[] args) {

        var n = 16;
        final boolean powerOfTwo = isPowerOfTwoRecursively(n);
        final boolean powerOfTwoBitManipulation = isPowerOfTwoBitManipulation(n);
        LOGGER.info("The number " + n + " is power of two? = " + powerOfTwo);
        LOGGER.info("The number " + n + " is power of two with BitManipulation? = " + powerOfTwoBitManipulation);
    }

    public static boolean isPowerOfTwoRecursively(int n) {

        if(n == 1){ // 1 because 2^0 = 1
            return true;
        }
        else if ( n%2==1 || n==0 ) { // if is odd number or zero return false
            return false ;
        }

        return isPowerOfTwoRecursively(n/2); // divide by two you can also move bits to the left
    }

    /**
     * & = Binary AND Operator copies a bit to the result if it exists in both operands.
     *
     * For example :
     *
     *      16  = 	10000
     *      15  =   01111
     *    16&15 =   00000
     *
     * Doesn't have coincidences in presents bits.
     */
    public static boolean isPowerOfTwoBitManipulation(int n) {
        return ((n & n - 1) == 0 && n > 0);
    }

}
