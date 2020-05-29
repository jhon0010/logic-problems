package practice.problems;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class BinarySearch {

    private static final Logger LOGGER = getLogger(BinarySearch.class);

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4,16,20,89, 200};
        final int target = 3;
        LOGGER.info("The result of binary search is [" + binarySearch(array, target) + "]");
    }

    /**
     * T = O(log(n))
     * S = O(1)
     */
    public static int binarySearch(int[] array, int target) {

        int left = 0;
        int right = array.length -1;
        int index = -1;
        int middle;

        while(left <= right){

            middle =  (right + left) / 2;
            var middleValue = array[middle];

            if(target == middleValue){
                return middle;
            }

            if(target > middleValue) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }

        }

        return index;
    }

}
