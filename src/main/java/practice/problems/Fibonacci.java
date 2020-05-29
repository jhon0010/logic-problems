package practice.problems;

import org.slf4j.Logger;

import java.util.HashMap;

import static org.slf4j.LoggerFactory.getLogger;

public class Fibonacci {

    private static final Logger LOGGER = getLogger(Fibonacci.class);

    public static void main(String[] args) {

        var number = 8;

        int fibonacci = fibonacci(number);
        LOGGER.info("Fibonacci number for " + number + " is " + fibonacci);


        HashMap<Integer, Integer> fibonacciComputations = new HashMap<>();
        fibonacciComputations.put(1, 0);
        fibonacciComputations.put(2, 1);
        int fibonacciMemoization = fibonacciWithMemoization(number, fibonacciComputations);
        LOGGER.info("Fibonacci number for " + number + " is " + fibonacciMemoization);

        int fibonacciIterativeWay = fibonacciIterativeWay(number);
        LOGGER.info("Fibonacci number for " + number + " is " + fibonacciIterativeWay);


    }

    /**
     * Time = O(2^n)  = For each call we call two times the same function.
     * Space = O(n) = Stacked functions calls
     */
    private static int fibonacci(int number) {

        if (number == 2) return 1;
        if (number == 1) return 0;
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    /**
     * Time O(n) = The access to the hash maps occurs in a constant time.
     * Space = O(n) = The stored calculations in a hashmap.
     */
    private static int fibonacciWithMemoization(int number, HashMap<Integer, Integer> fibonacciComputations) {

        if (!fibonacciComputations.containsKey(number)) {
            fibonacciComputations.put(number, fibonacciWithMemoization(number - 1, fibonacciComputations) +
                    fibonacciWithMemoization(number - 2, fibonacciComputations));
        }

        return fibonacciComputations.get(number);
    }

    private static int fibonacciIterativeWay(int number){

        var n = 1;
        var previousResults = new int[2];
        previousResults[0] = 0;
        previousResults[1] = 1;

        while (n < number){

            var currVal = previousResults[0] + previousResults[1];
            previousResults[0] = previousResults[1];
            previousResults[1] = currVal;
            n++;
        }

        return previousResults[0];
    }

}
