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
        List<Integer> results = branchSums(root);
        LOGGER.info(" Binary Search sum is =  " + results.toString());
    }

    public static List<Integer> branchSums(BinaryTree root) {
        List<Integer> results = new ArrayList<>();
        recursiveSum(root, 0, results);
        return results;
    }

    /**
     * Depth-first search (DFS) is an algorithm for traversing or searching tree or graph data structures.
     * The algorithm starts at the root node (selecting some arbitrary node as the root node in the case of a graph)
     * and explores as far as possible along each branch before backtracking.
     * <{@link https://en.wikipedia.org/wiki/Depth-first_search>}
     *
     * Function with side effect just append values to the results list
     */
    public static void recursiveSum(BinaryTree currentNode, int currentSum,
                                    List<Integer> results) {

        if (currentNode == null) {
            return;
        }

        var sum = currentSum + currentNode.value;
        LOGGER.info("The current value of node is " +  currentNode.value + " and sum = " + sum);
        if (currentNode.left == null && currentNode.right == null) {// is a leaf node
            results.add(sum);
            return;
        }

        recursiveSum(currentNode.left, sum, results);
        recursiveSum(currentNode.right, sum, results);

    }

}
