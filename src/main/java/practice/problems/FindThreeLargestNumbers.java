package practice.problems;

import org.slf4j.Logger;

import java.util.Arrays;

import static org.slf4j.LoggerFactory.getLogger;

public class FindThreeLargestNumbers {

    private static final Logger LOGGER = getLogger(FindThreeLargestNumbers.class);

    public static void main(String[] args) {
        var array = new int[] {141,8,-9,-7,-21,-6};
        LOGGER.info("Result = " + Arrays.toString(findThreeLargestNumbers(array)));
    }

    public static int[] findThreeLargestNumbers(int[] array) {

        var largesNumbers = new int[]{-Integer.MAX_VALUE, -Integer.MAX_VALUE, -Integer.MAX_VALUE};

        for(int i : array){
            if(i > largesNumbers[2]) {
                largesNumbers[0] = largesNumbers[1];
                largesNumbers[1] = largesNumbers[2];
                largesNumbers[2] = i;

            } else if(i > largesNumbers[1]) {
                largesNumbers[0] = largesNumbers[1];
                largesNumbers[1] = i;
            }else if(i > largesNumbers[0]) {
                largesNumbers[0] = i;
            }
        }
        return largesNumbers;
    }

}
