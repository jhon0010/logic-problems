package practice.problems;

import org.slf4j.Logger;

import java.util.Arrays;
import java.util.Hashtable;

import static org.slf4j.LoggerFactory.getLogger;

public class ArraySumExactly {

    private static final Logger LOGGER = getLogger(ArraySumExactly.class);


    public static void main(String[] args) {

        Hashtable<Integer,Boolean> y = new Hashtable<>();

        int[] indices = forceBruteApproach();
        LOGGER.info("The indices that reach the target value are " + Arrays.toString(indices));

        int[] indicesHash = hashTableSolution();
        LOGGER.info("The indices that reach the target value are " + Arrays.toString(indicesHash));

    }

    private static int[] hashTableSolution() {

        var targetSum = 9;
        int[] array = {2,7,6,4};

        if(array == null || array.length == 0){
            return new int[0];
        }

        Hashtable<Integer,Boolean> analizedValues = new Hashtable<>();

        for(int arrayValue : array){

            int y = targetSum - arrayValue;
            if(analizedValues.get(y) != null){
                return new int[] {y, arrayValue};
            }else {
                analizedValues.put(arrayValue, true);
            }
        }
        return new int[0];
    }

    /**
     * Taken of https://leetcode.com/problems/two-sum/
     *
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     *
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *
     * Example:
     *
     * Given nums = [2, 7, 11, 15], target = 9,
     *
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     */
    private static int[] forceBruteApproach() {
        var target = 9;
        int[] inputArray = {2,7,6,4};

        for(int i=0; i <= inputArray.length; i++) {
            for(int j=0; j <= inputArray.length; j++) {
                if(inputArray[j] == (target - inputArray[i])){
                    return new int[] {inputArray[i],inputArray[j]};
                }
            }
        }

        throw new IllegalStateException("The array doesnt contains two numbers for the solution");
    }

}
