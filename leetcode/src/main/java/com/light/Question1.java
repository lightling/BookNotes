package com.light;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 示例:
     给定 nums = [2, 7, 11, 15], target = 9
     因为 nums[0] + nums[1] = 2 + 7 = 9
    所以返回 [0, 1]
 */
public class Question1 {

    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int target = 9;

        int[] result = Question1.twoSum(nums,target);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(Question1.twoSum2(nums,target)));

    }


    public static int[] twoSum2(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<Integer, Integer>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (map.get((target-nums[i]))!=null){
                return new int[]{map.get((target-nums[i])),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
    /**
     * 时间复杂度为 n平方
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target){

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j]+nums[i]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
