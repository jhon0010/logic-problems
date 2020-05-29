package practice.problems;

import org.slf4j.Logger;

import java.util.Arrays;

import static org.slf4j.LoggerFactory.getLogger;

public class BubbleSort {

    private static final Logger LOGGER = getLogger(BubbleSort.class);

    public static void main(String[] args) {
        var array = new int[] {1,8,98,-9,-7,500,-21,35,-6,10000, 0};
        LOGGER.info("\n" + "The array              : " + Arrays.toString(array) );
        final int[] orderedArray = bubbleSort(array);
        LOGGER.info("\n" + "was ordered and now is : " + Arrays.toString(orderedArray));
    }

    public static int[] bubbleSort(int[] array) {

        if(array != null && array.length == 0) return new int[] {};

        var isOrdered = false;
        var counter = 1;

        while(!isOrdered){

            isOrdered = true;
            for(int i=0 ; i < array.length - counter ; i++){

                if(array[i] > array[i +1]){
                    swappingValues(array, i , i + 1);
                    isOrdered = false;
                }
            }
            counter++;
        }
        return array;
    }

    private static void swappingValues(int[] array, int i , int j){
        var temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
