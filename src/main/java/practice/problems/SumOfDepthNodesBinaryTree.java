package practice.problems;

import org.slf4j.Logger;
import practice.utils.BinaryTree;

import static org.slf4j.LoggerFactory.getLogger;

public class SumOfDepthNodesBinaryTree {

    private static final Logger LOGGER = getLogger(SumOfDepthNodesBinaryTree.class);

    public static void main(String[] args) {

        BinaryTree root = BinaryTree.createBst();

        int sum = sumNodeDepth(root, 0); // the depth for the root node is 0
        LOGGER.info("The sum of the node's depth is " + sum);
    }

    public static int sumNodeDepth (BinaryTree currentNode, int depth) {
        if(currentNode == null) { // if we get a null reference of node the value of depth doesn't sum
            return 0;
        }

        // in each call we get into the 2 values bc is a binary tree and the depth is the current + 1
        return depth + sumNodeDepth(currentNode.left, depth + 1) + sumNodeDepth(currentNode.right, depth + 1);
    }


}
