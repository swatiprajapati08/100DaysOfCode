//152. Maximum Product Subarray
//https://leetcode.com/problems/maximum-product-subarray/

/*Example 1:

Input: [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.*/


class Solution {
    public int maxProduct(int[] arr) {
        int curr_max=arr[0],curr_min=arr[0],prev_max=arr[0],prev_min=arr[0],ans=arr[0];
	     
	     for(int i=1;i<arr.length;i++)
	     {
	         curr_max=Math.max(arr[i],Math.max(arr[i]*prev_max,arr[i]*prev_min));
	         curr_min=Math.min(arr[i],Math.min(arr[i]*prev_max,arr[i]*prev_min));
	         ans=Math.max(ans,curr_max);
	         prev_max=curr_max;
	         prev_min=curr_min;
	     }
        return ans;
    }
}
