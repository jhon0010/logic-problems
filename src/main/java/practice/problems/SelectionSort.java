package practice.problems;

import org.slf4j.Logger;

import java.util.Arrays;

import static org.slf4j.LoggerFactory.getLogger;

public class SelectionSort {

    private static final Logger LOGGER = getLogger(SelectionSort.class);

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4,16,20,89, 200};
        LOGGER.info("\n" + "The array              : " + Arrays.toString(array) );
        final int[] selectionSort = selectionSort(array);
        LOGGER.info("\n" + "was ordered and now is : " + Arrays.toString(selectionSort));

    }

    public static int[] selectionSort(int[] array) {

        var currentIndex = 0;

        while(currentIndex < array.length - 1){
            var smallestIndex = currentIndex;

            for(int i = currentIndex + 1; i < array.length ; i++){
                if(array[smallestIndex] > array[i]){
                    smallestIndex = i;
                }
            }

            var temp = array[smallestIndex];
            array[smallestIndex] = array[currentIndex];
            array[currentIndex] = temp;
            currentIndex++;
        }
        return array;
    }
}
