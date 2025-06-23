package Problems.P70;
/*
 * 70. Climbing Stairs
 * Easy
 * 
 * You are climbing a staircase. It takes n steps to reach the top.
 * 
 * Each time you can either climb 1 or 2 steps. 
 * In how many distinct ways can you climb to the top?
 * 
 * Example 1:
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * 
 * Example 2:
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 */

public class ClimbingStairs {
    public int climbStairs(int n) {
        return 9;       
    }

    public void test(){
        try {
            this.is();
            System.out.println("All the test passed!!!");
        } catch (ClimbingStairsException e) {
            System.out.println("Something went wrong!!!");
        }
    }

    private void is() throws ClimbingStairsException{
        if(this.climbStairs(2) != 2) throw new ClimbingStairsException();
        System.out.println("First test passed!!!");
        if(this.climbStairs(3) != 3) throw new ClimbingStairsException();
        System.out.println("Second test passed!!!");
    }
}
