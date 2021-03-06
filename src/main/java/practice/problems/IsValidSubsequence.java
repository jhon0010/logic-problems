package practice.problems;

import org.slf4j.Logger;

import java.util.Arrays;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

public class IsValidSubsequence {

    private static final Logger LOGGER = getLogger(IsValidSubsequence.class);

    public static void main(String[] args) {

        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> subsequence = Arrays.asList(5, 1, 22, 23, 6, -1, 8, 10);

        var isValid = isValidSubsequence(array, subsequence);
        LOGGER.info("\n Is the list    = " + subsequence.toString() + " \n subsequence of = " + array.toString() + " \n = " + isValid);
    }


    /**
     * You can also solve this problem by double iteration but this increase the time complexity.
     */
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {

        var seqIndex = 0;

        for (Integer integer : array) {
            if (seqIndex < sequence.size() && sequence.get(seqIndex).equals(integer)) {
                seqIndex++;
            }
        }

        System.out.println("" + seqIndex + "  " + sequence.size() + " " +  (seqIndex == sequence.size()) );
        return seqIndex == sequence.size();
    }

}
