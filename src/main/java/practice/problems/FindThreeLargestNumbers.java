package practice.problems;

import org.slf4j.Logger;

import java.util.Arrays;

import static org.slf4j.LoggerFactory.getLogger;

public class FindThreeLargestNumbers {

    private static final Logger LOGGER = getLogger(FindThreeLargestNumbers.class);

    public static void main(String[] args) {
        var array = new int[] {141,8,-9,-7,-21,-6};
        LOGGER.info("Result findThreeLargestNumbers = " + Arrays.toString(findThreeLargestNumbers(array)));
        LOGGER.info("Result findThreeLargestNumbersShifthing = " + Arrays.toString(findThreeLargestNumbersShifthing(array)));
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


    public static int[] findThreeLargestNumbersShifthing(int[] array) {

        final int min = -Integer.MAX_VALUE;
        var largesNumbers = new int[]{min, min, min};

        for(int i : array){
            if(largesNumbers[2] > min - 1 && i > largesNumbers[2]) {
                setAndShiftValues(largesNumbers, i, 2);
            } else if(largesNumbers[1] > min - 1 && i > largesNumbers[1]) {
                setAndShiftValues(largesNumbers, i, 1);
            }else if(largesNumbers[0] > min - 1  && i > largesNumbers[0]) {
                setAndShiftValues(largesNumbers, i, 0);
            }
        }
        return largesNumbers;
    }

    private static void setAndShiftValues(int[] largesNumbers, int value, int index){
        for (int i = 0; i < largesNumbers.length; i++) {
            if(index == i){
                largesNumbers[index] = value;
                break;
            } else {
                largesNumbers[i] = largesNumbers[i + 1];
            }
        }
    }

}
