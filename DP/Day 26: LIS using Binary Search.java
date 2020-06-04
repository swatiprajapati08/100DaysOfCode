//300. Longest Increasing Subsequence

//https://leetcode.com/problems/longest-increasing-subsequence/


/* Arrays.binarySearch() method returns index of the search key, if it is contained in the array, else it returns (-(insertion point) - 1).
The insertion point is the point at which the key would be inserted into the array: 
the index of the first element greater than the key, or a.length if all elements in the array are less than the specified key*/

public class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int len = 0;
        for (int num : nums) {
            int i = Arrays.binarySearch(dp, 0, len, num);
            if (i < 0) {
                i = -(i + 1);
            }
            dp[i] = num;
            if (i == len) {
                len++;
            }
        }
        return len;
    }
}
