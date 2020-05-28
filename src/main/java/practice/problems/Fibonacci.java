package practice.problems;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class Fibonacci {

    private static final Logger LOGGER = getLogger(Fibonacci.class);

    public static void main(String[] args) {

        var number = 8;
        int fibonacci = fibonacci(number);
        LOGGER.info("Fibonacci number for " + number + " is " + fibonacci);
    }

    private static int fibonacci(int number){
        if(number == 2) return 1;
        if(number == 1) return 0;
        return fibonacci(number - 1) + fibonacci(number -2);
    }

}
