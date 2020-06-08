//https://practice.geeksforgeeks.org/problems/zero-sum-subarrays/0/?track=SPCF-Hashing&batchId=155

//Zero Sum Subarrays

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)throws IOException
	 {
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int t=Integer.parseInt(br.readLine());
	 while(t-->0)
	 {
	     int n=Integer.parseInt(br.readLine());
	     int arr[]=new int[n];
	     String str[]=br.readLine().split(" ");
	     for(int i=0;i<n;i++)
	     arr[i]=Integer.parseInt(str[i]);
	     int pre_sum=0,count=0;
	     HashMap<Integer,Integer> hs=new HashMap<>();
	     for(int i=0;i<n;i++)
	     {
	        pre_sum+=arr[i];
	         if(pre_sum==0)
              count++;
            if(hs.containsKey(pre_sum))
                count+=hs.get(pre_sum);
            
            hs.put(pre_sum,hs.getOrDefault(pre_sum,0)+1);
	            
	        } 
	    System.out.println(count);
	 }
	 }
}
