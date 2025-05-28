package Problems.P2;

import Problems.ProblemsResource.ListNode;


/*
 * 2. Add Two Numbers
 * 
 * Medium
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order, and each of their nodes contains a single digit. 
 * Add the two numbers and return the sum as a linked list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * 
 * Example 1:
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * 
 * Example 2:
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * 
 * Example 3:
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 */


public class AddTwoNumbers{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //First we will need the variables that we'll use
        int rest = 0;
        int sum;
        ListNode result = new ListNode();
        //Then we save the head of the list
        ListNode aux1 = l1;
        ListNode aux2 = l2;
        ListNode auxResult = result;
        //Now we will see the numbers until the two lists will finish
        while(aux1 != null || aux2 != null || rest!=0){
            sum = 0;
            //We sum the rest if we have one 
            sum += rest;
            //We will see if the list have number or not
            //If have a number we sum with the val
            sum += (aux1 == null)? 0: aux1.val;
            sum += (aux2 == null)? 0: aux2.val;
            //Then we need to see if the number have a rest or not
            if(sum > 9){
                rest = 1;
                sum %= 10;
            }else{

                rest = 0;
            }
            //Then we need to save the number in the new list
            auxResult.val = sum; 
            
            //And finally if the l1 and l2 have next we move to the next
            aux1 = (aux1 == null)? null : aux1.next;
            aux2 = (aux2 == null)? null : aux2.next;

            //Then we create a new node and we move into it
            if(aux1 != null || aux2 != null || rest!=0){
                //only create a new node if the other lists has a least an element
                auxResult.next = new ListNode();
                auxResult = auxResult.next;    
            }
        }
        return result;
    }

    public void test(){
        try {
            this.is();
            System.out.println("All the test passed");
            
        } catch (AddTwoNumbersException e) {
            System.out.println("Something went wrong!!!!");
        }
    }

    private void is() throws AddTwoNumbersException{
        //Test1
        //[2,4,3]
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        //[5,6,4]
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));
        ListNode result = this.addTwoNumbers(l1, l2);
        //[7,0,8]
        ListNode original = new ListNode(7, new ListNode(0, new ListNode(8,null)));
        if(!original.compareWithAnotherList(result)) throw new AddTwoNumbersException();
        
        //Test2
        //[0]
        l1 = new ListNode(0,null);
        //[0]
        l2 = new ListNode(0,null);
        result = this.addTwoNumbers(l1, l2);
        //[0]
        original = new ListNode(0,null);
        if(!original.compareWithAnotherList(result)) throw new AddTwoNumbersException();

        //Test 3
        //[9,9,9,9,9,9,9]
        l1 = new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,null)))))));
        //[9,9,9,9]
        l2 = new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,null))));
        result = this.addTwoNumbers(l1, l2);
        //[8,9,9,9,0,0,0,1]
        original = new ListNode(8,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(1,null))))))));
        result.printItself();
        original.printItself();

        if(!original.compareWithAnotherList(result)) throw new AddTwoNumbersException();

    }


}