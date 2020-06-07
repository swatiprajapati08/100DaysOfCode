//First Repeating Element

//https://practice.geeksforgeeks.org/problems/first-repeating-element/0/?track=SPCF-Hashing&batchId=155

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
	     int f=-1;
	     HashSet<Integer> hs=new HashSet<>();
	    for (int i=arr.length-1; i>=0; i--) 
        { 
           if (hs.contains(arr[i])) 
                f = i; 
            else
                hs.add(arr[i]); 
        } 
	     if(f==-1)
	     System.out.println("-1");
	     else
	     System.out.println(f+1);
	 }
	 }
}
