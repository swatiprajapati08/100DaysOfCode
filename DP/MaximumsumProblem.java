//Maximum sum Problem


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-->0)
	 {
	     int n=sc.nextInt();
	     System.out.println(calc(n));
	 }
	 }
	 static int calc(int n)Maximum sum Problem
	 {
	     int dp[]=new int[n+1];
	     for(int i=0;i<=11;i++)
	     dp[i]=i;
	     
	     for(int i=12;i<=n;i++)
	     {
	         int temp=dp[i/2]+dp[i/3]+dp[i/4];
	         dp[i]=Math.max(temp,i);
	     }
	     return dp[n];
	 }
}