//Power of 2

//https://practice.geeksforgeeks.org/problems/power-of-2/0/

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
	     long n=Long.parseLong(br.readLine());
	     System.out.println(power(n));
	 }
	 }
	 static String power(long n)
	 {
	      while(n!=0)
        {
            if(n==1)
                return "YES";
            
            if(n%2!=0)
                return "NO";
            else
                n=n/2;
        }
        return "NO";
	 }
}
