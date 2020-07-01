/**Find whether given Number is prime or Not**/

//https://www.codechef.com/problems/PRB01

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int t=Integer.parseInt(br.readLine());
	  while(t-->0)
	  {
	      int n=Integer.parseInt(br.readLine());
	     System.out.println(isPrime(n));
	  }
	}
	static String isPrime(int n)
	{
	    if(n==1) return "no";
	    for(int i=2;i*i<=n;i++)
	    {
	        if(n%i==0)
	        return "no";
	    }
	    return "yes";
	}
}
