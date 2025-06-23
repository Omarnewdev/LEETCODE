package Problems.P66;

import java.util.Arrays;

/*
 * 66. Plus One
 * Easy
 * 
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
 * The digits are ordered from most significant to least significant in left-to-right order. 
 * The large integer does not contain any leading 0's.
 * 
 * Increment the large integer by one and return the resulting array of digits.
 * 
 * Example 1:
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 * 
 * Example 2:
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * Incrementing by one gives 4321 + 1 = 4322.
 * Thus, the result should be [4,3,2,2].
 * 
 * Example 3:
 * Input: digits = [9]
 * Output: [1,0]
 * Explanation: The array represents the integer 9.
 * Incrementing by one gives 9 + 1 = 10.
 * Thus, the result should be [1,0].
 */

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int [] hi = new int[8];
        return hi;   
    }

    public void test(){
        try{
            this.is();
            System.out.println("All the test passed!!!");

        }catch (PlusOneException e){
            System.out.println("Something went wrong!!!");
        }
    }

    private void is()throws PlusOneException{
        //first
        int[] nums1 = {1,2,3};
        int[] myOutput1 = this.plusOne(nums1);
        int[] outputFinal1 = {1,2,4}; 
        if(!Arrays.equals(myOutput1, outputFinal1)) throw new PlusOneException();
        System.out.println("First test passed!!!!");

        //Second
        int[] nums2 = {4,3,2,1};
        int[] myOutput2 = this.plusOne(nums2);
        int[] outputFinal2 = {4,3,2,2}; 
        if(!Arrays.equals(myOutput2, outputFinal2)) throw new PlusOneException();
        System.out.println("Second test passed!!!!");

        //Third
        int[] nums3 = {9};
        int[] myOutput3 = this.plusOne(nums3);
        int[] outputFinal3 = {1,0}; 
        if(!Arrays.equals(myOutput3, outputFinal3)) throw new PlusOneException();
        System.out.println("Third test passed!!!!");
    }

}
