/*1. Two Sum
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].*/


class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        hs.put(nums[i],i);
        for(int i=0;i<nums.length;i++)
        {
            int comp=target-nums[i];
            if(hs.containsKey(comp)&& hs.get(comp) != i)
                return new int[]{hs.get(comp),i};
        }
        return new int[]{0,0};
    }
}
