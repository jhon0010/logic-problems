package practice.problems;

import org.slf4j.Logger;

import java.util.Arrays;

import static org.slf4j.LoggerFactory.getLogger;

public class SmallestValueTwoArrays {

    private static final Logger LOGGER = getLogger(SmallestValueTwoArrays.class);

    public static void main(String[] args) {

        int [] arrayOne = {-1,5,10,20,28,3};
        int [] arrayTwo = {26,134,135,15,17};
        int[] smallestDifference = smallestDifference(arrayOne, arrayTwo);

        LOGGER.info("The numbers that have the smallest difference in the arrays : " +
                "\none = " + Arrays.toString(arrayOne) +
                "\ntwo = " + Arrays.toString(arrayTwo) +
                "\nis  = " + Arrays.toString(smallestDifference));

    }


    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {

        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        var smallestDiff = Integer.MAX_VALUE;
        var smallestNum = new int[2];
        var indexOne = 0;
        var indexTwo = 0;

        while (indexOne < arrayOne.length && indexTwo < arrayTwo.length) {

            var v1 = arrayOne[indexOne];
            var v2 = arrayTwo[indexTwo];
            var currentDiff = Math.abs(v1 - v2);

            if (v1 == v2) {
                return new int[]{v1, v2};
            }
            if (currentDiff < smallestDiff) {
                smallestDiff = currentDiff;
                smallestNum[0] = v1;
                smallestNum[1] = v2;
            }
            if (v1 < v2) {
                indexOne++;

            } else if (v1 > v2) {
                indexTwo++;
            }
        }

        return smallestNum;
    }


}
