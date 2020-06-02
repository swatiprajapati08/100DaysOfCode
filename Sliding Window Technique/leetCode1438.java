//https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/submissions/
//1438. Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        int k=sc.nextInt();
    	System.out.println(longestSubarray(arr,k));
    }
       static int longestSubarray(int[] nums, int limit) {
        if(nums.length==1)return 1;
           PriorityQueue<Integer> min = new PriorityQueue<>();
           PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
           min.add(nums[0]);
           max.add(nums[0]);
           int size = 2;
           for (int i = 0, j = i + 1; j < nums.length;) {
               min.add(nums[j]);
               max.add(nums[j]);

               if (Math.abs(min.peek() - max.peek()) <= limit) {
                   j++;
                   size = Math.max(size, j - i);
               } else {
                   min.remove(nums[i]);
                   max.remove(nums[i]);
                   i++;
                   j++;
               }

           }
           return size;
       }

    }

