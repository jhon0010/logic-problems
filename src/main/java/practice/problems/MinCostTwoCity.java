package practice.problems;

import org.slf4j.Logger;

import java.util.Arrays;

import static org.slf4j.LoggerFactory.getLogger;

public class MinCostTwoCity {

    private static final Logger LOGGER = getLogger(MinCostTwoCity.class);

    public static void main(String[] args) {

        /**
         * This matrix represents the cost of travel for a person to two different cities
         *      city A = pos 0
         *      city B = pos 1
         */
        int [][] costs = new int[][] { {10,20}, {30,200}, {400,50}, {30,20}};

        for (int[] cityCost: costs) {
            LOGGER.info("Original array = " + Arrays.toString(cityCost) + " = " + (cityCost[0] - cityCost[1]));
        }

        for (int i = 0; i < costs.length -1; i++) {
            LOGGER.info("Operation to sort = " + Arrays.toString(costs[i]) + " = "
                    + (
                            (costs[i][0] - costs[i + 1][0]) - (costs[i][1] -  costs[i+1] [1])
                        ));
        }

        LOGGER.info("\n\n\n");
        Arrays.sort(costs, (p1, p2) -> (p1[0] - p2[0]) - (p1[1] - p2[1]));

        for (int[] cityCost: costs) {
            LOGGER.info("Sorted Array =" + Arrays.toString(cityCost) + " = " + (cityCost[0] - cityCost[1]));
        }

    }

    //costs each value [][] represents each cost for person to travel to A = pos 0 and B = pos 1
    public int twoCitySchedCost(int[][] costs) {

        Arrays.sort(costs , (p1,p2) -> (p1[0] - p2[0]) - (p1[1] - p2[1]) );
        int sum = 0;

        for(int i = 0; i < costs.length / 2; i++){
            sum += costs[i][0];
            sum += costs[costs.length / 2 + i][1];
        }

        return sum;
    }

}
