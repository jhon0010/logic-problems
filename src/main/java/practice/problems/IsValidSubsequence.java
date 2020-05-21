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


    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {

        var seqIndex = 0;

        for (int i= 0; i < array.size() ;i++) {

            if(seqIndex == sequence.size()){ // this means that we traverse all the sequence
                break;
            }

            if(array.get(i) == sequence.get(seqIndex)){
                seqIndex++;
            }

        }

        return seqIndex == sequence.size();
    }

}
