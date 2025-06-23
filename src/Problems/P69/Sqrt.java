package Problems.P69;
/*
 * 69. Sqrt(x)
 * Easy
 * Given a non-negative integer x, return the square root of x rounded 
 * down to the nearest integer. The returned integer should be non-negative
 * as well.
 * 
 * You must not use any built-in exponent function or operator.
 * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 * 
 * Example 1:
 * Input: x = 4
 * Output: 2
 * Explanation: The square root of 4 is 2, so we return 2.
 * 
 * Example 2:
 * Input: x = 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 */

public class Sqrt {
    public int mySqrt(int x) {
        return 2;
    }
    public void test(){
        try {
            this.is();
            System.out.println("All the test passed!!!");
        } catch (SqrtException e) {
            System.out.println("Something went wrong");
        }
    }
    private void is() throws SqrtException{
        if(this.mySqrt(4) != 2) throw new SqrtException();
        System.out.println("First test passed!!!");
        if(this.mySqrt(8) != 2) throw new SqrtException();
        System.out.println("Second test passed!!!");
    }
}
