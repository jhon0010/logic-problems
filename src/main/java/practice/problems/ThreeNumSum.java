package practice.problems;

import com.sun.jdi.ThreadReference;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

public class ThreeNumSum {

    private static final Logger LOGGER = getLogger(ThreeNumSum.class);

    public static void main(String[] args) {

        int[] array = {35,0,-7, 2, 3, 4,16 ,-4,20,-2,6, -5};
        int targetSum = 7;
        final List<Integer[]> threeNumberSum = threeNumberSum(array, targetSum);

        LOGGER.info("The triplets of numbers that fill the target number " + targetSum + " are : ");
        threeNumberSum.forEach(numbersArray -> LOGGER.info(Arrays.toString(numbersArray)));

    }

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {

        List<Integer[]> results = new ArrayList<>();
        Arrays.sort(array);

        for(int i=0; i < array.length -2; i++){ // 2 for taken position left and right
            var left = i + 1;
            var right = array.length -1;

            while(left < right){
                var sum = array[i] + array[left] + array[right];
                if(sum == targetSum){
                    results.add(new Integer[] {array[i], array[left], array[right]});
                    right--;
                    left ++;
                } else if(sum < targetSum){
                    left ++;
                } else if(sum > targetSum){
                    right--;
                }
            }
        }
        return results;
    }

}
