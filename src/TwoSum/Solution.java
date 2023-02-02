package TwoSum;

import java.util.Arrays;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0;i<nums.length;i++) {
            for (int j = 0; j <= i; j++) {
                if (target == (nums[i] + nums[j])) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int target = 3;
        System.out.print(Arrays.toString(twoSum(arr, target)));
    }
}