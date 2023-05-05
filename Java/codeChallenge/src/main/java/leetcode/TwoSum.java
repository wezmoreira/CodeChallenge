package leetcode;

public class TwoSum {

    public static void main(String[] args) {

    }

    public int[] TwoSum(int[] nums, int target) {
        int[] array = new int[2];

        for(int i =0 ; i < nums.length; i++){
            for(int j = 0; j< nums.length; j++){
                if(nums[i] + nums[j] == target & i != j){
                    array[0] = j;
                    array[1] = i;
                    break;
                }
            }
        }
        return array;
    }
}

/*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    You can return the answer in any order.

    Example:

    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
