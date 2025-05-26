package Problems.P12;

/*
* medium
* Seven different symbols represent Roman numerals with the following values:
*   
*  Symbol	Value
*   I	1
*   V	5
*   X	10
*   L	50
*   C	100
*   D	500
*   M	1000
*  Roman numerals are formed by appending the conversions of decimal place values
*  from highest to lowest. Converting a decimal place value into a Roman numeral 
*  has the following rules:
*
*   If the value does not start with 4 or 9, select the symbol of the maximal value 
*   that can be subtracted from the input, append that symbol to the result, subtract 
*   its value, and convert the remainder to a Roman numeral.
*   If the value starts with 4 or 9 use the subtractive form representing one symbol 
*   subtracted from the following symbol, for example:
*   4 is 1 (I) less than 5 (V): IV and 9 is 1 (I) less than 10 (X): IX. 
*   Only the following subtractive forms are used: 4 (IV), 9 (IX), 40 (XL), 90 (XC), 
*   400 (CD) and 900 (CM).
*   Only powers of 10 (I, X, C, M) can be appended consecutively at most 3 times to 
*   represent multiples of 10. You cannot append 5 (V), 50 (L), or 500 (D) multiple 
*   times. If you need to append a symbol 4 times use the subtractive form.
*   Given an integer, convert it to a Roman numeral.
*
*   
*
*   Example 1:

*   Input: num = 3749

*   Output: "MMMDCCXLIX"

*   Explanation:

*   3000 = MMM as 1000 (M) + 1000 (M) + 1000 (M)
*   700 = DCC as 500 (D) + 100 (C) + 100 (C)
*   40 = XL as 10 (X) less of 50 (L)
*   9 = IX as 1 (I) less of 10 (X)
*   Note: 49 is not 1 (I) less of 50 (L) because the conversion is based on decimal places
*   Example 2:

*   Input: num = 58

*   Output: "LVIII"

*   Explanation:

*   50 = L
*   8 = VIII
*   Example 3:

*   Input: num = 1994

*   Output: "MCMXCIV"

*   Explanation:

*   1000 = M
*   900 = CM
*   90 = XC
*  4 = IV
 */

public class IntegerToRoman {
    private int sizeNumber(int n){
        if(n <=0){
            return 0;
        } 
        return 1 + sizeNumber(n/10); 
    }
    private int[] createArrayofNumbers(int n){
        int s = sizeNumber(n);
        //We will reserve an array of number with the size of the number
        int[] aux = new int[s];
        int i = s-1;
        while(i >= 0){
            aux[i] = n%10;
            n /= 10;
            i--;
        }
        return aux;
    }

    public String intToRoman(int num) {
        StringBuilder auxString = new StringBuilder();
        //We need to know how many digits the number have
        int digits = sizeNumber(num);
        //We need to transform the number in an array of numbers
        int [] numberArray = this.createArrayofNumbers(num);
        //We create a temporary variable to save the Roman number before add in the auxString
        String aux;
        //We create these lists to organaze the code
        String [] first = {"I","II","III","IV","V","VI","VII","VIII","IX"};
        String [] second = {"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String [] third = {"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String [] fourth = {"M","MM","MMM"};
        //We create our sentinel
        int i = digits;
        //We create a loop that gonna stop when our sentinel is equals to the number of digits
        while(i>0){
            i--;
            if(numberArray[i] == 0) continue;
            
            if(i == digits-1) auxString.insert(0, first[numberArray[i]-1]);
            
            if(i == digits-2) auxString.insert(0, second[numberArray[i]-1]);
            
            if(i == digits-3) auxString.insert(0, third[numberArray[i]-1]);
            
            if(i == digits-4) auxString.insert(0, fourth[numberArray[i]-1]);
            
        }
        //we send the final string
        return auxString.toString();
    }

    public void test(){
        System.out.println("in test");
        try{
            this.is();
        }catch(IntegerToRomanException e){
            System.out.println("something is wrong");
        }
    }
    private void is() throws IntegerToRomanException{
        if( "MMMDCCXLIX".compareTo(this.intToRoman(3749)) != 0) throw new IntegerToRomanException();
        if( "LVIII".compareTo(this.intToRoman(58)) != 0) throw new IntegerToRomanException();
        if( "MCMXCIV".compareTo(this.intToRoman(1994)) != 0) throw new IntegerToRomanException();
        System.out.println("All the test pass!!!");
    }
}
