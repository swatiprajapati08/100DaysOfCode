//https://practice.geeksforgeeks.org/problems/minimum-element-in-a-sorted-and-rotated-array/0

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
	    
	    int min=arr[0];
	    for(int i=1;i<n;i++)
	    min=Math.min(min,arr[i]);
	    
	    System.out.println(min);
	     
	     
	 }
	 }
}
