package Problems.P20;

import java.util.Stack;

/*
 * 20. Valid Parentheses
 * Easy
 * 
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * 
 * Example 1:
 * Input: s = "()"
 * Output: true
 * 
 * Example 2:
 * Input: s = "()[]{}"
 * Output: true
 * 
 * Example 3:
 * Input: s = "(]"
 * Output: false
 * 
 * Example 4:
 * Input: s = "([])"
 * Output: true
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */


public class ValidPrentheses {
    private boolean isOpenBrackets(char s){
        return s=='(' || s=='{'|| s=='['; 
    }
    public boolean isValid(String s) {
        int size = s.length();
        //First we need to make the string in a char
        char[] list = s.toCharArray();
        //We are going to create a stack to save the enter information
        Stack<Character> stackOfChar = new Stack<>();
        //We need to create a sentinel to see all the array
        int i = 0;
        while(i < size){
            if(isOpenBrackets(list[i])){
                //if the case is an open bracket we save it in the stack
                stackOfChar.add(list[i]);
            }
            else{
                //if isn't a open bracket we save pop the stack and see if is the par of the open
                //First we need to know if the stack is empty, if is we return false because we don't have an open bracket
                if(stackOfChar.isEmpty()) return false;
                char aux = stackOfChar.pop();
                //we need to see what close bracket works
                if(aux == '(' && list[i] != ')') return false;
                else if(aux == '[' && list[i] != ']') return false;
                else if(aux == '{' && list[i] != '}') return false;
            }
            i++;
        }
        //We need to verify if the stack have a thing
        //if have something that means some bracket wasn't close
        if(!stackOfChar.isEmpty()) return false;
        return true;
    }

    private void is() throws ValidParenthesesExcpetion{
        if(!this.isValid("()")) throw new ValidParenthesesExcpetion();
        if(!this.isValid("([])")) throw new ValidParenthesesExcpetion();
        if(this.isValid("(]")) throw new ValidParenthesesExcpetion();
        if(!this.isValid("()[]{}")) throw new ValidParenthesesExcpetion();
        if(this.isValid("[")) throw new ValidParenthesesExcpetion();
        if(this.isValid("({{{{}}}))")) throw new ValidParenthesesExcpetion();
    }

    public void test(){
        try{
            this.is();
        }catch (ValidParenthesesExcpetion e){
            System.out.println("Something went wrong");
        }
        System.out.println("All the test past away");
    }


    
}
