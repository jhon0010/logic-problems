package practice.problems;

import org.slf4j.Logger;
import practice.utils.BinaryTree;

import java.util.ArrayList;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

public class BranchSumsBinaryTree {

    private static final Logger LOGGER = getLogger(BranchSumsBinaryTree.class);

    public static void main(String[] args) {
        BinaryTree root = BinaryTree.createBst();
        branchSums(root);
    }

    public static List<Integer> branchSums(BinaryTree root) {

        List<Integer> results = new ArrayList<>();
        recursiveSum(root, 0, results);
        LOGGER.info(" Binary Search sum is =  " + results.toString());
        return results;
    }

    /**
     * Function with side effect just append values to the results list
     */
    public static void recursiveSum(BinaryTree currentNode, int currentSum,
                                    List<Integer> results) {
        if (currentNode == null) {
            return;
        }

        var sum = currentSum + currentNode.value;
        if (currentNode.left == null && currentNode.right == null) {// is a leaf node
            results.add(sum);
            return;
        }

        recursiveSum(currentNode.left, sum, results);
        recursiveSum(currentNode.right, sum, results);

    }

}
