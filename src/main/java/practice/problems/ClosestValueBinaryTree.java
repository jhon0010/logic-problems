package practice.problems;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class ClosestValueBinaryTree {

    private static final Logger LOGGER = getLogger(ClosestValueBinaryTree.class);

    public static void main(String[] args) {

        BST root = new BST(10);

        root.left = new BST(5);
        root.left.left = new BST(2);
        root.left.left.left = new BST(1);
        root.left.right = new BST(25);

        root.right = new BST(15);
        root.right.right = new BST(22);
        root.right.left = new BST(13);
        root.right.left.right = new BST(14);

        int targetValue = 12;

        LOGGER.info("The closest value is = " + findClosestValueInBst(root, targetValue));

    }


    public static int findClosestValueInBst(BST tree, int target) {

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

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }

}
