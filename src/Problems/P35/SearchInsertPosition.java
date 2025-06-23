package Problems.P35;

/*
 * 35. Search Insert Position
 * Easy
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * Example 1:
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * 
 * Example 2:
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * 
 * Example 3:
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 */
public class SearchInsertPosition {
    
    public int searchInsert(int[] nums, int target) {
        //First of all we need to see the next number of the target
        //The bigger
        int size = nums.length;
        int send = size ;
        for(int i=0; i<size;i++){
            if(nums[i]>=target) {
                send = i;
                break;
            }
        }
        //Then we see three possibilities
        return send;

    }

    public void test(){
        try {
            this.is();
            System.out.println("All the test passed!!");
        } catch (SearchInsertPositionException e) {
            System.out.println("Something went wrong!!!");
        }
    }

    private void is() throws SearchInsertPositionException{
        int[] num = {1,3,5,6};
        if(this.searchInsert(num, 5) != 2) throw new SearchInsertPositionException();
        System.out.println("First Test passed!!!");
        if(this.searchInsert(num, 2) != 1) throw new SearchInsertPositionException();
        System.out.println("Second Test passed!!!");
        if(this.searchInsert(num, 7) != 4) throw new SearchInsertPositionException();
        System.out.println("Third Test passed!!!");
    }
}
