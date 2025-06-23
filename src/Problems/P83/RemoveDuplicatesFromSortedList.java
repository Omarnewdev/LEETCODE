package Problems.P83;

import Problems.P26.RemoveDuplicatesFromSortedArrayException;
import Problems.ProblemsResource.ListNode;

/*
 * 
 * 83. Remove Duplicates from Sorted List
 * Easy
 * 
 * Given the head of a sorted linked list, delete all duplicates
 * such that each element appears only once. Return the linked list 
 * sorted as well.
 * 
 * Example 1:
 * Input: head = [1,1,2]
 * Output: [1,2]
 * 
 * Example 2:
 * Input: head = [1,1,2,3,3]
 * Output: [1,2,3]
 */
//Use Problems Resource

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode n = new ListNode();
        return n;
    }

    public void test(){
        try {
            this.is();
            System.out.println("All the test passed!!!!");
        } catch (RemoveDuplicatesFromSortedArrayException e) {
            System.out.println("Something went wrong!!!");
        }

    }

    private void is() throws RemoveDuplicatesFromSortedArrayException{
        ListNode input1 = new ListNode(1,new ListNode(1,new ListNode(2,null)));
        ListNode output1 = this.deleteDuplicates(input1);
        ListNode finalNode1 = new ListNode(1,new ListNode(2,null));
        if(!finalNode1.compareWithAnotherList(output1)) throw new RemoveDuplicatesFromSortedArrayException();

        //Second test
        ListNode input2 = new ListNode(1,new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(3,null)))));
        ListNode output2 = this.deleteDuplicates(input2);
        ListNode finalNode2 = new ListNode(1,new ListNode(2,new ListNode(3, null)));
        if(!finalNode2.compareWithAnotherList(output2)) throw new RemoveDuplicatesFromSortedArrayException();
        
    }
}
