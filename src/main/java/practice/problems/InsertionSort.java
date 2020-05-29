package practice.problems;

import org.slf4j.Logger;

import java.util.Arrays;

import static org.slf4j.LoggerFactory.getLogger;

public class InsertionSort {

    private static final Logger LOGGER = getLogger(InsertionSort.class);

    public static void main(String[] args) {

        var array = new int[] {1,8,98,-9,-7,500,-21,35,-6,10000, 0};
        LOGGER.info("\n" + "The array              : " + Arrays.toString(array) );
        final int[] insertionSortArray = insertionSort(array);
        LOGGER.info("\n" + "was ordered and now is : " + Arrays.toString(insertionSortArray));
    }

    public static int[] insertionSort(int[] array) {
        for(int i=1; i < array.length; i++){
            int j = i;
            while(j > 0 && array[j] < array[j - 1]){
                var temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
        return array;
    }

}
