package Problems.P14;
/*
 * 14. Longest Common Prefix
 * Easy
 * 
 * Write a function to find the longest common prefix string amongst an array of strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * 
 * Example 2:
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 */


public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        //First we need to save the actual char in an aux variable
        char aux;
        //We need to make a stringBuilder to create the result
        StringBuilder result = new StringBuilder();
        //We need a boolean to know if the intern for has to break
        boolean b = false;
        //Then we need to create our sentinel to see the char
        int i = 0;
        while (true) {
            //we need to see if we don't exceed the size of the string
            if( i > strs[0].length()-1) break;
            //Inside first we save the char that the sentinel is watching
            aux=strs[0].charAt(i);
            for (String word : strs) {
                //First we see if weren't exceed the string and see if the both char are the same
                if(word.length()-1<i || word.charAt(i) != aux){
                    b = true;
                    break;
                }
            }
            if(b)break;
            i++;
            //if we are in this place we add to the result string
            result.append(aux);    
        }
        return result.toString();
    }

    private void is() throws LongestCommonPrefixException {
        String [] r =  {"flower","flow","flight"};
        if("fl".compareTo(this.longestCommonPrefix(r)) != 0) throw new LongestCommonPrefixException();  
        String [] r2 = {"dog","racecar","car"};
        if("".compareTo(this.longestCommonPrefix(r2)) != 0) throw new LongestCommonPrefixException();
        String [] r3 = {"a"};
        if("a".compareTo(this.longestCommonPrefix(r3)) != 0) throw new LongestCommonPrefixException();
        String [] r4 = {"ab", "a"};
        if("a".compareTo(this.longestCommonPrefix(r4)) != 0) throw new LongestCommonPrefixException();    
    }

    public void test(){
        try {
            this.is();
        } catch (LongestCommonPrefixException e) {
            System.out.println("Something went wrong!!");
        }
        System.out.println("All the test pass");
    }
}
