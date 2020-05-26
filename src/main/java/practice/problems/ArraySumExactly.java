package practice.problems;

import org.slf4j.Logger;

import java.util.Arrays;
import java.util.Hashtable;

import static org.slf4j.LoggerFactory.getLogger;

public class ArraySumExactly {

    private static final Logger LOGGER = getLogger(ArraySumExactly.class);


    public static void main(String[] args) {

        var targetSum = 9;
        int[] array = {2,7,6,4};

        Hashtable<Integer,Boolean> y = new Hashtable<>();

        int[] indices = forceBruteApproach(array, targetSum);
        LOGGER.info("The indices that reach the target value are " + Arrays.toString(indices));

        int[] indicesHash = hashTableSolution(array, targetSum);
        LOGGER.info("The indices that reach the target value are " + Arrays.toString(indicesHash));

    }


    public static int[] hashTableSolution(int[] array, int targetSum) {

        Hashtable<Integer,Integer> numbers = new Hashtable<Integer, Integer>();

        for(int x: array){

            var y = numbers.get(x);

            if(y != null){
                return new int[] {x,y};
            } else {
                numbers.put(targetSum - x, x);
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
    private static int[] forceBruteApproach(int[] array, int targetSum) {

        for(int i=0; i <= array.length; i++) {
            for(int j=0; j <= array.length; j++) {
                if(array[j] == (targetSum - array[i])){
                    return new int[] {array[i],array[j]};
                }
            }
        }

        throw new IllegalStateException("The array doesnt contains two numbers for the solution");
    }

}
