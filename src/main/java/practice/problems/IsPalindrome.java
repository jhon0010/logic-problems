package practice.problems;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class IsPalindrome {

    private static final Logger LOGGER = getLogger(IsPalindrome.class);

    public static void main(String[] args) {

        var word = "level";
        LOGGER.info("The word " + word + " is palindrome? = " + isPalindrome(word));
    }

    public static boolean isPalindrome(String str) {

        var array = str.toCharArray();
        var leftIndex = 0;
        var rightIndex = array.length - 1;

        while (leftIndex < rightIndex){
            if(!(array[leftIndex] == array[rightIndex])){
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
        return true;
    }
}
