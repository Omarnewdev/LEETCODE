package Problems.P27;

/*
 * 27. Remove Element
 * Easy
 * 
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. 
 * The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
 * Consider the number of elements in nums which are not equal to val be k, to get accepted, 
 * you need to do the following things:
 * Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
 * The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 * Custom Judge:
 * 
 * The judge will test your solution with the following code:
 * 
 * int[] nums = [...]; // Input array
 * int val = ...; // Value to remove
 * int[] expectedNums = [...]; // The expected answer with correct length.
 *                             // It is sorted with no values equaling val.
 * 
 * int k = removeElement(nums, val); // Calls your implementation
 * 
 * assert k == expectedNums.length;
 * sort(nums, 0, k); // Sort the first k elements of nums
 * for (int i = 0; i < actualLength; i++) {
 *     assert nums[i] == expectedNums[i];
 * }
 * If all assertions pass, then your solution will be accepted.
 * 
 * Example 1:
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 2.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * 
 * Example 2:
 * Input: nums = [0,1,2,2,3,0,4,2], val = 2
 * Output: 5, nums = [0,1,4,0,3,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
 * Note that the five elements can be returned in any order.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 */

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        //First we take the size of the array
        int size = nums.length;
        //We create an aux array to save the values that we need from the array
        int [] aux = new int[size];
        //We crete a sentinel to see the new array
        int i = 0;
        //We create a loop to see all the array
        for (int num : nums) {
            //if the number isn't the same of the val we save it in the array
            if(num != val) {
                aux[i] = num;
                i++;
            }else{
                //And if the number is equal to val we reduce the size
                size--;
            }
        }
        for(i = 0; i < size ; i++){
            nums[i] = aux[i];
        }
        return size ;
    }

    public void test(){
        try {
            this.is();
            System.out.println("All is okay!!!!");
        } catch (RemoveElementException e) {
            System.out.println("Something went wrong!!!");
        }
    }


    private void is() throws RemoveElementException{
        //Input: nums = [3,2,2,3], val = 3
        int[] t1 = {3,2,2,3};
        int k;
        //Output: 2, nums = [2,2,_,_]
        k = this.removeElement(t1, 3);
        int[] result = {2,2};
        for(int i = 0; i < k; i++ ){
            if(t1[i] != result[i] ) throw new RemoveElementException();
        }

        //Test 2
        //Input: nums = [0,1,2,2,3,0,4,2], val = 2
        int[] t2 = {0,1,2,2,3,0,4,2};
        //Output: 5, nums = [0,1,4,0,3,_,_,_]
        k = this.removeElement(t2, 2);
        int[] result2 = {0,1,3,0,4};
        for(int i = 0; i < k; i++ ){
            if(t2[i] != result2[i] ) throw new RemoveElementException();
        }
    }
}