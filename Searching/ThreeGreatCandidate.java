//https://practice.geeksforgeeks.org/problems/three-great-candidates/0/?track=SPCF-Searching&batchId=155


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
	     long arr[]=new long[n];
	     String str[]=br.readLine().split(" ");
	     for(int i=0;i<n;i++)
	     arr[i]=Long.parseLong(str[i]);
	     Arrays.sort(arr);
	     long x=arr[n-1]*arr[n-2]*arr[n-3];
	     long y=arr[0]*arr[1]*arr[n-1];
	     System.out.println(Math.max(x,y));
	 }
	 }
}
