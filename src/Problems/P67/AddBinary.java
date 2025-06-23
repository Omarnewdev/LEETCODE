package Problems.P67;
/*
 * 
 * 67. Add Binary
 * Easy
 * Given two binary strings a and b, return their sum as a binary string.
 * 
 * Example 1:
 * Input: a = "11", b = "1"
 * Output: "100"
 * 
 * Example 2:
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 */

public class AddBinary {
    public String addBinary(String a, String b) {
        return "Hello";
    }

    public void test(){
        try {
            this.is();
            System.out.println("All test passed!!!!");
        } catch (AddBinaryException e) {
            System.out.println("Something went wrong!!!");
        }
    }

    private void is() throws AddBinaryException{
        String input1 = "11";
        String input2 = "1";
        if(this.addBinary(input1, input2).compareTo("100") != 0) throw new AddBinaryException();
        System.out.println("First test passed !!!!");
        //Test 2
        String input3 = "1010";
        String input4 = "1011";
        if(this.addBinary(input3, input4).compareTo("10101") != 0) throw new AddBinaryException();
        System.out.println("First test passed !!!!");

    }
}
