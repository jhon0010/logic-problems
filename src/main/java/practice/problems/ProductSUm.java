package practice.problems;

import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

public class ProductSUm {

    private static final Logger LOGGER = getLogger(ProductSUm.class);

    public static void main(String[] args) {

        List<Object> root = new ArrayList<>();
        List<Object> nums1 = new ArrayList<>();
        List<Object> nums2 = new ArrayList<>();

        root.add(1);

        nums1.add(1);

        nums2.add(1);

        nums1.add(nums2);
        root.add(nums1);

        int productSum = productSum(root, 1);
        LOGGER.info("The product sum for " + root.toString() + " is " + productSum);
    }

    public static int productSum(List<Object> array, int depth) {

        var sum = 0;

        for (Object o : array) {

            if (o instanceof Integer) {
                sum += (Integer) o;
            } else if (o instanceof ArrayList) {
                @SuppressWarnings("unchecked")
                List<Object> casted = (List<Object>) o;
                sum += productSum(casted, depth + 1);
            }
        }

        return sum * depth;
    }

}
