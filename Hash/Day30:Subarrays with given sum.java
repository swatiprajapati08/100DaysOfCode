//https://practice.geeksforgeeks.org/problems/subarray-range-with-given-sum/0


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
	     int sum=Integer.parseInt(br.readLine());
	     HashMap<Integer,Integer> hs=new HashMap<>();
	    // hs.put(0,1);
	     int count=0;
	     int pre_sum=0;
	     for(int i=0;i<n;i++)
	     {
	         pre_sum+=arr[i];
	         if(pre_sum==sum)
	         count++;
	         if(hs.containsKey(pre_sum-sum))
	         count+=hs.get(pre_sum-sum);
	         if(hs.containsKey(pre_sum))
	         hs.put(pre_sum,hs.get(pre_sum)+1);
	         else
	         hs.put(pre_sum,1);
	     }
	     System.out.println(count);
	 }
	 }
}
