package Problems.P21;
/*
 * 21. Merge Two Sorted Lists
 * Easy
 * 
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * Return the head of the merged linked list.
 * 
 * Example 1:
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * 
 * Example 2:
 * Input: list1 = [], list2 = []
 * Output: []
 * 
 * Example 3:
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 */

public class MergedTwoSortedList {
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //Then we see if one of the list is null so return the another
        if(list1 == null && list2 != null) return list2;
        else if (list1 != null && list2 == null) return list1;
        //in the case that both lists were null we return any list
        else if (list1 == null && list2 == null) return list1;

        //If we are here we need to do the merge
        //First we create aux pointers for the lists
        ListNode l1 = list1;
        ListNode l2 = list2;
        //This pointer will be the header of my result pointer
        ListNode result;
        //We need to know what will be the fist value of the result pointer
        if(l1.val < l2.val){
            result = l1;
            l1 = l1.next;
        }else{
            result = l2;
            l2 = l2.next;
        }
        //We create an aux pointer to see the two lists
        ListNode aux = result;
        //Now we have the first pointer only we need to merge all of them
        //We need to merge the two list 
        while(l1 != null && l2 != null){
            //we need to see in the two list what is the less of both
            if(l1.val < l2.val){
                aux.next = l1;
                l1 = l1.next;
            }else{
                aux.next = l2;
                l2 = l2.next;
            }
            aux = aux.next;
        }
        //Now we need to see if some pointer is null
        if(l1 != null) aux.next = l1;
        else if(l2 != null) aux.next = l2;
        return result;
    }


    private void printListNode(ListNode l){
        ListNode pointer = l;
        while(pointer != null){
            System.out.print(pointer.val+"->");
            pointer = pointer.next;
        }
        System.out.println();
    }

    public void test(){
        try{
            this.is();
            System.out.println("All the test pass");
        }catch(MergedTwoSortedListException e){
            System.out.println("Something went wrong!!");
        }

    }

    private void is() throws MergedTwoSortedListException{
        ListNode l = new ListNode(1,new ListNode(2, new ListNode(4, null)));
        ListNode l2 = new ListNode(1,new ListNode(3, new ListNode(4, null)));
        ListNode result = this.mergeTwoLists(l, l2);
        ListNode lfinal = new ListNode(1,new ListNode(1, new ListNode(2,new ListNode(3, new ListNode(4, new ListNode(4, null))))));
        this.printListNode(result);
        this.printListNode(lfinal);
        while(result != null){
            if(result.val != lfinal.val) throw new MergedTwoSortedListException();
            result = result.next;
            lfinal = lfinal.next;
        }
        if(result == null ^ lfinal == null) throw new MergedTwoSortedListException();

    }
}
