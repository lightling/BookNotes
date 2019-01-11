package com.light;

import java.util.Arrays;

/**
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *
 * 示例 1:
 *
 * 给定数组 nums = [1,1,2],
 *
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 * 示例 2:
 *
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 *
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 *
 * 你不需要考虑数组中超出新长度后面的元素
 */
public class Question26 {
    public static void main(String[] args) {
        Question26 tester = new Question26();
        int[] nums = new int[]{1,1,2};
        System.out.println(tester.removeDuplicates(nums)+(Arrays.toString(nums)));

        nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(tester.removeDuplicates(nums)+(Arrays.toString(nums)));
    }
    public int removeDuplicates(int[] nums){
        //快慢指针，快的先走，和慢的重复了，就替换，然后慢的走
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if(nums[j]==nums[i]){

            }else{
                i++;
                nums[i]=nums[j];
            }
        }



        return  i+1;
    }
}
