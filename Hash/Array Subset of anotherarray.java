//https://practice.geeksforgeeks.org/problems/array-subset-of-another-array/0/

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
	     String s[]=br.readLine().split(" ");
	     int n=Integer.parseInt(s[0]);
	     int m=Integer.parseInt(s[1]);
	     int arr[]=new int[n];
	     int brr[]=new int[m];
	     String str[]=br.readLine().split(" ");
	     for(int i=0;i<n;i++)
	     arr[i]=Integer.parseInt(str[i]);
	     
	     String sr[]=br.readLine().split(" ");
	     for(int i=0;i<m;i++)
	     brr[i]=Integer.parseInt(sr[i]);
	     HashSet<Integer> hs=new HashSet<>();
	     for(int i:arr)
	     hs.add(i);
	     
	     int f=0;
	     for(int k=0;k<m;k++)
	     {
	         if(!hs.contains(brr[k]))
	         {f=1;
	         System.out.println("No");
	         break;}
	     }
	     if(f==0)
	      System.out.println("Yes");
	     
	 }
	 }
}
