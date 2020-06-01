package practice.problems;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class CaesarsCipherEncryption {

    private static final Logger LOGGER = getLogger(CaesarsCipherEncryption.class);

    public static void main(String[] args) {

        var key = 70;
        var wordToCypher = "aaa";
        final String cipherWord = caesarCypherEncryption(wordToCypher,key);
        LOGGER.info("The original word = " + wordToCypher + " is now the cipher = " + cipherWord);
    }

    public static String caesarCypherEncryption(String str, int key) {

        var numberOfLetters = 26;
        var cipherArray = new char[str.length()];
        int newKey = key % numberOfLetters; //This gonna return the real number in the range of letters
        LOGGER.info("The key value is = " + newKey);

        for(int i=0 ; i < str.length() ; i++){
            cipherArray[i] = cipherLetter(str.charAt(i), newKey);
        }

        return new String(cipherArray);
    }

    private static char cipherLetter(char letter, int newKey){

        var startAlphabetIndex = 96; //a -1
        var lastAlphabetIndex = 122; //z
        int newLetterAscii = letter + newKey;
        return newLetterAscii <= lastAlphabetIndex ?
                (char) newLetterAscii :
                (char) (startAlphabetIndex + newLetterAscii % lastAlphabetIndex);
    }
    
}
