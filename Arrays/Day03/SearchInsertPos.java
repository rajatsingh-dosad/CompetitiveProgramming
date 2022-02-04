
//LEETCODE 35: Search Insert Position

/*
    Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104
*/

public class SearchInsertPos {

    public static int searchInsert(int[] nums, int target) {

        //Approach 1: Using normal for loop , Time complexity- O(n)

        // for(int i=0;i<nums.length;i++) {

        // if(nums[i]>=target) {
        // return i;
        // }
        // }
        // return nums.length;




        //Approach 2: Using Binary Search , Time complexity- O(logn)
        
        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {

            int mid = (i + j) / 2;
            if (target < nums[mid]) {
                j = mid - 1;
            } else if (target > nums[mid]) {
                i = mid + 1;
            } else if (target == nums[mid]) {

                return mid;
            }

            if (i > j)
                return i;
        }

        return nums.length;

    }

    public static void main(String[] args) {
        
        int arr[] = {1,3,5,6};
        int val = 3;

        int k = searchInsert(arr,val);

        System.out.println(k);
    }
}
