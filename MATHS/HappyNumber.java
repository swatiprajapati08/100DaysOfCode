//Happy Number

//https://practice.geeksforgeeks.org/problems/happy-number/0


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
	  if(happy(n))
	  System.out.println("1");
	  else
	   System.out.println("0");
	 }
	 }
	 static int digitSum(int n)
	 {
	     int num=0;
	     while(n!=0)
	     {
	         int m=n%10;
	         num+=m*m;
	         n=n/10;
	     }
	     return num;
	 }
	 static boolean happy(int n)
	 {
	     HashSet<Integer> hs=new HashSet<Integer>();
	     
	     while(n!=1)
	     {
	         int sum=digitSum(n);
	         if(hs.contains(sum))
	         return false;
	         
	         hs.add(sum);
	         n=sum;
	     }
	     return true;
	 }
}