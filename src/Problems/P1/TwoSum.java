package Problems.P1;

import java.util.Arrays;
import java.util.HashMap;

/*
 * 1. Two Sum
 * Easy
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 
 * You can return the answer in any order.
 * 
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * 
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        //We are going to try to do this exercise with Hash table
        HashMap <Integer,Integer> map = new HashMap<>();
        //We suppose that always will be an answer so we don't need to verify if the array have something
        //We need a sentinel to see the array
        int i = 0;
        //Then we need to see all the variables in the array
        while(i < nums.length){
            //First we see if we have something inside the map that when we rest the number 
            if(!map.isEmpty() && map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }else{
                //we save the number as a key, after the valor is the index of the array where is the number
                map.put(nums[i], i);
            }
            //Always we need to increase the sentinel
            i++;
        }
        return new int[2];
    }
    public void test(){
        try {
            this.is();
            System.out.println("All the test pass!");
            
        } catch (TwoSumException e) {
            System.out.println("Something went wrong!!!!");
        }
    }

    private void is() throws TwoSumException{
        int[] nums = {2,7,11,15};
        int[] result = this.twoSum(nums, 9);
        int[] a = {0,1};
        if(!Arrays.equals(a, result)) throw new TwoSumException();
        int[] nums2 = {3,2,4};
        int[] result2 = this.twoSum(nums2, 6);
        int[] a2 = {1,2};
        if(!Arrays.equals(a2,result2)) throw new TwoSumException();
    }
}
