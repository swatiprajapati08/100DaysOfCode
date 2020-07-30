
//Remove Duplicates from Sorted Array in inplace
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/


class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        int i=0,j=1;
        for(j=1;j<nums.length;j++)
        {
            if(nums[i]==nums[j])
                count++;
            else
            {
                i=i+1;
                //swap
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        return nums.length-count;
    }
}
