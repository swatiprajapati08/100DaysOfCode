//https://practice.geeksforgeeks.org/problems/relative-sorting/0/?track=SPCF-Hashing&batchId=155

//Relative Sorting

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
	    String ssss[]=br.readLine().split(" ");
	     
	     int n=Integer.parseInt(ssss[0]);
	     int m=Integer.parseInt(ssss[1]);
	     int arr[]=new int[n];
	     int brr[]=new int[n];
	     
	     String str[]=br.readLine().split(" ");
	     for(int i=0;i<n;i++)
	     arr[i]=Integer.parseInt(str[i]);
	     
	     String s[]=br.readLine().split(" ");
	     for(int i=0;i<m;i++)
	     brr[i]=Integer.parseInt(s[i]);
	     TreeMap<Integer,Integer> tree=new TreeMap<>();
	     for(int i:arr)
	     tree.put(i,tree.getOrDefault(i,0)+1);
	     for(int i=0;i<m;i++)
	     {
	         if(tree.containsKey(brr[i]))
	         {
	             for(int j=0;j<tree.get(brr[i]);j++)
	             System.out.print(brr[i]+" ");
	             tree.remove(brr[i]);
	         }
	     }
	     for(Map.Entry<Integer,Integer> x:tree.entrySet())
	     {
	         for(int j=0;j<x.getValue();j++)
	         System.out.print(x.getKey()+" ");
	     }
	     
	     
	     System.out.println();
	 }
	 }
}
