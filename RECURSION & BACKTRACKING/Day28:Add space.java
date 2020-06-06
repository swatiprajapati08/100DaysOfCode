//Permutation with Spaces 

/*  https://practice.geeksforgeeks.org/problems/permutation-with-spaces/0    */



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
	     String s=br.readLine();
	     recur(s,0);
	     System.out.println();
	 }
	 }
	 static void recur(String s,int i)
	 {
	     if(i==s.length()-1)
	     {System.out.print("("+s+")");
	     return;}
	     recur(s.substring(0,i+1)+" "+s.substring(i+1),i+2);
	     recur(s,i+1);
	     return;
	 }
}
