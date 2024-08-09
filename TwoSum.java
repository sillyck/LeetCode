package LeetCode;

import java.util.Arrays;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] resultat = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    resultat[0] = i;
                    resultat[1] = j;
                }
            }
        }

        return resultat;
    }

    public static void main(String[] args){
        int[] nums = {3,2,3};
        int target = 6;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

}