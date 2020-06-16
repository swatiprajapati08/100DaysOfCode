/* Remove Duplicates from Sorted Array

Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.*/



class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums==null || nums.length==0)
            return 0;
       int i=0,j=0;
        int count=0;
        int p=1;
        while(i<nums.length && j<nums.length)
        {
            if(nums[i]==nums[j])
            { j++;}
            else
            {
                i=j;
                nums[p++]=nums[j];
            }
        }
        return p;
    }
}