package Problems.P28;
/*
 * 
 * 28. Find the Index of the First Occurrence in a String
 * Easy
 * Given two strings needle and haystack, 
 * return the index of the first occurrence of needle in haystack, 
 * or -1 if needle is not part of haystack.
 * Example 1:
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 * 
 * Example 2:
 * Input: haystack = "leetcode", needle = "leeto
 * Output: -1
 * Explanation: "leeto" did not occur in "leetcode", so we return -1.
 */

public class FindTheIndexOfTheFirstOcurrenceInAString {

    //We need to create a function to see if an index is part of the string
    /**
     * @param i The index that we want to see
     * @param s The string that we want to see
     * @return TRUE if is the last index of the string, FALSE if we didt
     */
    private boolean isTheLastCharOfTheString(int i, String s){
        return s.length() == i;
    }

    public int strStr(String haystack, String needle) {
        //We need to create a variable to see the needle string and save the possible occurrence
        int j = 0, possible = -1;
        boolean firstLetter  = true; //To see if we are init the view 
        //FIrst we will create a loop to see all the haystack to see if there is some needle part
        for(int i = 0; i < haystack.length(); i++){
            //If the first letter of the 
            if(needle.charAt(j) == haystack.charAt(i) && firstLetter){
                firstLetter = false;
                possible = i;
                j++;
            }else if(needle.charAt(j) == haystack.charAt(i) && !firstLetter){
                j++;
            }else if(!firstLetter){
                i = possible;
                possible = -1;
                j = 0;
                firstLetter = true;
                
            }
            //Always need to verify if is the end of the the needle word to send the index
            if(!firstLetter && this.isTheLastCharOfTheString(j, needle)){
                return possible;
            }
        }
        return -1;
    }

    public void test(){
        try {
            this.is();
            System.out.println("All the test passed!!");
        } catch (FindTheIndexOfTheFirstOcurrenceInAStringException e) {
            System.out.println("Something went wrong!!!");
        }
    }


    private void is() throws FindTheIndexOfTheFirstOcurrenceInAStringException{
        if(this.strStr("sadbutsad", "sad") != 0) throw new FindTheIndexOfTheFirstOcurrenceInAStringException();
        System.out.println("First test passed!");
        if(this.strStr("leetcode", "leeto") != -1) throw new FindTheIndexOfTheFirstOcurrenceInAStringException();
        System.out.println("Second test passed!");
        if(this.strStr("mississippi", "issip") != 4) throw new FindTheIndexOfTheFirstOcurrenceInAStringException();
        System.out.println("Third test passed!");
    }

}
