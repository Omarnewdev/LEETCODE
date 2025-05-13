package Problems.P13;


/*
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
*
*   Symbol       Value
*   I             1
*   V             5
*   X             10
*   L             50
*   C             100
*   D             500
*   M             1000  
*For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
*
*Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
*
*   I can be placed before V (5) and X (10) to make 4 and 9. 
*   X can be placed before L (50) and C (100) to make 40 and 90. 
*   C can be placed before D (500) and M (1000) to make 400 and 900.
*Given a roman numeral, convert it to an integer.
*/

public class RomanToInteger {
    public int romanToInt(String s) {
        int res = 0;  //First of all I create a variable to save the exit number
        int i=0;    //The sentinel that tells me when finalize the loop
        int aux = 0;    //Where I will save the number before sum it to "res"
        boolean isLow = false;  //Tell me if the number rest the next one
        char [] l = s.toCharArray();    //I need to it to convert my string in a chat list
        int size = s.length();  //To know the size of the list
        while(i<size){
            //First I need to know if the number have next
            if(i+1< size){
                //I will see if the next number is to rest or not
                switch (l[i]) {
                    //Inside this switch we follow the rules that the problem gave us
                    case 'I':
                        if(l[i+1] == 'V' || l[i+1] == 'X' ){
                            isLow = true;
                            aux = (l[i+1] == 'V')? 4: 9;
                        }   
                        break;
                    case 'X':
                        if(l[i+1] == 'L' || l[i+1] == 'C' ){
                            isLow = true;
                            aux = (l[i+1] == 'L')? 40: 90;
                        }   
                        break;
                    case 'C':
                        if(l[i+1] == 'D' || l[i+1] == 'M' ){
                            isLow = true;
                            aux = (l[i+1] == 'D')? 400: 900;
                        }   
                        break;
                    
                }
            }
            if(!isLow){
                //In the case the number isn't rest any of them we assign a value
                switch (l[i]) {
                    case 'I':
                        aux = 1;
                        break;
                    case 'V':
                        aux = 5;
                        break;
                    case 'X':
                        aux = 10;
                        break;
                    case 'L':
                        aux = 50;
                        break;
                    case 'C':
                        aux = 100;
                        break;
                    case 'D':
                        aux = 500;
                        break;
                    case 'M':
                        aux = 1000;
                        break;
                }
            }else{
                //If the number is resting only we need to add 1 to the sentinel
                //Because to rest a number we need both of them
                i++;
            }
            //Resest the boolean variable
            isLow = false;
            //Sum the aux number with the correct number
            res += aux;
            //Add one to the sentinel to finish the work
            i++;
        }
        return res;
    }
    
    public void test(){
        try {
            this.is();
        } catch (RomanToIntegerException e) {
            System.out.println("something goes wrong");
        }
        System.out.println("All the tests pass");
    }

    public void is() throws RomanToIntegerException{
        if(this.romanToInt("III") != 3) throw new RomanToIntegerException();
        if(this.romanToInt("LVIII") != 58) throw new RomanToIntegerException();
        if(this.romanToInt("MCMXCIV") != 1994) throw new RomanToIntegerException();
    }
}
