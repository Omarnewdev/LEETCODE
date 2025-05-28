package Problems.ProblemsResource;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) 
    { this.val = val; }
    public ListNode(int val, ListNode next) 
    { this.val = val; this.next = next; }

    
    /**
     * This method allows me compare the list itself with another list to see if both are the same
     * Will compare since the node that the list is allocate, so try to compare with the head
     * @param compare
     * @return True if the list compare is equals to the list of the object
     */
    public boolean compareWithAnotherList(ListNode compare){
        
        //First if the compare is null, but someone call the method thats mean that this one have a least a value
        //But the compare list doesn't have anything
        if(compare == null) return false;
        //We need to create an aux pointer to see this list
        ListNode aux = this;
        ListNode auxCompare = compare;
        //Now we will compare the numbers until some number will different
        while(aux != null && auxCompare!= null){
            if(aux.val != auxCompare.val) return false;
            aux = aux.next;
            auxCompare = auxCompare.next;
        }
        if(aux != null ^ auxCompare != null ) return false;
        return true;
    }

    /**
     * This method will print from the node where we are to the last node
     */
    public void printItself(){
        ListNode aux = this;
        while(aux != null){
            System.out.print(aux.val + "->");
            aux = aux.next;
        }
        System.out.println();
    }
}