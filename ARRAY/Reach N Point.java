//https://practice.geeksforgeeks.org/problems/reach-the-nth-point/0/


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
	    
	     long dp[]=new long[n+1];
	     dp[0]=1;dp[2]=2;
	     dp[1]=1;
	     for(int i=3;i<=n;i++)
	     dp[i]=dp[i-1]+dp[i-2];
	     
	     System.out.println(dp[n]);
	 }
	 }
}
