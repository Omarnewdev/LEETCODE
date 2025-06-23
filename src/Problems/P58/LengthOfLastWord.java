package Problems.P58;

/*
 *
 * 58. Length of Last Word
 * Easy
 * 
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * A word is a maximal substring consisting of non-space characters only.
 * 
 * Example 1:
 * Input: s = "Hello World"
 * Output: 5
 * Explanation: The last word is "World" with length 5.
 * 
 * Example 2:
 * Input: s = "   fly me   to   the moon  "
 * Output: 4
 * Explanation: The last word is "moon" with length 4.
 * 
 * Example 3:
 * Input: s = "luffy is still joyboy"
 * Output: 6
 * Explanation: The last word is "joyboy" with length 6.
 */

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        return 0;
    }

    public void test(){
        try {
            this.is();
            System.out.println("All the test passed!!!!");
        } catch (LengthOfLastWordException e) {
            System.out.println("Something went wrong!!!");
        }
    }

    private void is()throws LengthOfLastWordException{
        if(this.lengthOfLastWord("Hello World") != 5) throw new LengthOfLastWordException();
        System.out.println("First test passed!!!");
        if(this.lengthOfLastWord( "   fly me   to   the moon  ") != 4) throw new LengthOfLastWordException();
        System.out.println("Second test passed!!!");
        if(this.lengthOfLastWord( "luffy is still joyboy") != 6) throw new LengthOfLastWordException();
        System.out.println("Third test passed!!!");
    }
}