package Problems.P9;

/*
 * 
 * 9. Palindrome Number
 * Easy
 * Topics
 * Companies
 * Hint
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * 
 * Example 1:
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * 
 * Example 2:
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * 
 * Example 3:
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */

public class PalindromeNumber {
    //I gonna make it in a recursive way
    //Only will work with positive numbers
    private int reverse(int n,int reversed){
        if(n<=0) return reversed;
        return reverse(n/10, (reversed * 10) + (n%10));
    }
    
    public boolean isPalindrome(int x) {
        //I wanna try to solve this problem in a interesting way
        //If the number is negative return we will return false because the negative char will be in the other side always
        if(x<0) return false;
        //Then we gonna need to reverse the number
        int newNumber = this.reverse(x,0);
        return newNumber == x;
    }

    public void test(){
        try {
            this.is();
            System.out.println("All the test passed!!!!");
        } catch (PalindromeNumberException e) {
            System.out.println("Something went wrong!!!!");
        }
    }

    private void is() throws PalindromeNumberException{
        if(!this.isPalindrome(121)) throw new PalindromeNumberException();
        if(this.isPalindrome(-121)) throw new PalindromeNumberException();
        if(this.isPalindrome(10)) throw new PalindromeNumberException(); 
    }
}
