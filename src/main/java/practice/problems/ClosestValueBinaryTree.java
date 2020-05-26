package practice.problems;

import org.slf4j.Logger;
import practice.utils.BinaryTree;

import static org.slf4j.LoggerFactory.getLogger;

public class ClosestValueBinaryTree {

    private static final Logger LOGGER = getLogger(ClosestValueBinaryTree.class);

    public static void main(String[] args) {
        BinaryTree root = BinaryTree.createBst();
        int targetValue = 12;
        LOGGER.info("The closest value is = " + findClosestValueInBst(root, targetValue));
    }


    public static int findClosestValueInBst(BinaryTree tree, int target) {

        var tempCurrentNode = tree;
        var tempDiff = Math.abs(target - tempCurrentNode.value);
        var closestValue = tree.value;

        while(tempCurrentNode != null){

            var currentDiff = Math.abs(target - tempCurrentNode.value);

            if(currentDiff < tempDiff){
                tempDiff = currentDiff;
                closestValue = tempCurrentNode.value;
            }

            if(target > tempCurrentNode.value){
                tempCurrentNode = tempCurrentNode.right;
            } else {
                tempCurrentNode = tempCurrentNode.left;
            }
        }

        return closestValue;
    }

}
