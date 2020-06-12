//https://practice.geeksforgeeks.org/problems/longest-consecutive-subsequence/0


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
	     
	     HashSet<Integer> hs=new HashSet<Integer>();
	     for(int i:arr)
	     hs.add(i);
	     int max=0;
	     for(int i:hs)
	     {
	         int currNum=i;
	         int currMax=1;
	         if(!hs.contains(i-1))
	         {
	             while(hs.contains(currNum+1))
	             {
	                currNum+=1;
	                currMax+=1;
	             }
	             max=Math.max(max,currMax);
	         }
	         
	     }
	     System.out.println(max);
	 }
	 }
}
