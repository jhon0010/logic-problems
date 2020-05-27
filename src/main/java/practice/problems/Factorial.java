package practice.problems;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * n!
 */
public class Factorial {

    private static final Logger LOGGER = getLogger(Factorial.class);

    public static void main(String[] args) {
        var num = 5;
        int i = calculateRecursively(num);
        LOGGER.info("The factorial of " + num + " = " + i);
    }

    public static int calculateRecursively (int num) {
        if(num <= 0) return 1;
        return num * calculateRecursively(num - 1);
    }

}
