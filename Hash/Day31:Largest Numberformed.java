//Largest Number formed from an Array

//https://practice.geeksforgeeks.org/problems/largest-number-formed-from-an-array/0/?track=SPCF-Hashing&batchId=155


import java.util.*;
import java.math.*;
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
	     ArrayList<String> arr=new ArrayList<>();
	     String str[]=br.readLine().split(" ");
	     for(int i=0;i<n;i++)
	     arr.add(str[i]);
	     
	     Collections.sort(arr,new Comp());
	     
	     for(String s:arr)
	     System.out.print(s);
	     
	     System.out.println();
	     
	 }
	 }
	 	public static class Comp implements Comparator<String>
    	{
	    public int compare(String s1,String s2)
	    {
	    return Integer.compare(Integer.parseInt(s2+s1),Integer.parseInt(s1+s2));
	    }
    	}
}
