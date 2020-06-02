package practice.problems;

import org.slf4j.Logger;
import practice.utils.ListNode;

import static org.slf4j.LoggerFactory.getLogger;

public class DeleteNodeOfLinkedList {

    private static final Logger LOGGER = getLogger(DeleteNodeOfLinkedList.class);

    public static void main(String[] args) {

        ListNode root = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        root.next = second;
        second.next = third;
        third.next = fourth;

        LOGGER.info("Original root = " + root.toString());

        LOGGER.info(third.toString());
        third.val = third.next.val;
        third.next = third.next.next;
        LOGGER.info("After deletion of " + third.next + " root = " + root.toString());

    }

}
