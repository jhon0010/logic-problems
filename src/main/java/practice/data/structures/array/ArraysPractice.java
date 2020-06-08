package practice.data.structures.array;

import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.util.Arrays;
import java.util.Collections;

/**
 * Contains values of the same type.
 *
 * Start with the position in 0 index.
 */
public class ArraysPractice {

    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(ArraysPractice.class);

    public static void main(String[] args) {

        int[] commonInitializing = new int[10];
        int otherWay[] = new int[4];
        int[] byOtherSize = new int[commonInitializing.length];
        int[] intsOnFly = {5,6,-4,58,63,-1,0,7};
        Integer[] integers = {5,6,-4,58,63,-1,0,7};

        intNaturalSort(intsOnFly);
        reverseOrderIntegers(integers);

//        String[] names = {"Jhon", "Peter", "Andres"};
//        LOGGER.info("Original array " + Arrays.toString(names));
//        Arrays.sort(names);
    }

    /**
     * You can define a specific comparator to reverse order the array.
     */
    private static void reverseOrderIntegers(Integer[] integers) {

        LOGGER.info("Original array " + Arrays.toString(integers));
        Arrays.sort(integers, (integer1, integer2) -> integer1.compareTo(integer2) * -1);
        LOGGER.info("Reverse sorted array " + Arrays.toString(integers));

        Arrays.sort(integers, Collections.reverseOrder());
        LOGGER.info("Collections reverse sorted array " + Arrays.toString(integers));

    }

    /**
     * You can not sort with comparator an array of primitives
     * because this expect and object to compare and also
     * expect a T class to try to cast it.
     *
     * Just compare descending
     */
    private static void intNaturalSort(int[] ints) {

        LOGGER.info("Original array " + Arrays.toString(ints));

        Arrays.sort(ints);
        //Arrays.sort(inicializatiOnFly, (n1, n2) -> n1 > n2 ? 0 : -1);

        LOGGER.info("Sorted array " + Arrays.toString(ints));
    }

}
