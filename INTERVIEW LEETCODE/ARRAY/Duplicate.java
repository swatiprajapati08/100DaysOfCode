/*  Contains Duplicate

Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.*/


Solution:

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> hs=new HashSet<>();
        
        for(int i:nums)
        {
            if(hs.contains(i))
                return true;
            else
                hs.add(i);
        }
        return false;
    }
}


