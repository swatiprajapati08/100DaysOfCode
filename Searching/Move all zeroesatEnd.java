//Move all zeroes to end of array


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
	     int brr[]=new int[n];
	     String str[]=br.readLine().split(" ");
	     for(int i=0;i<n;i++)
	     arr[i]=Integer.parseInt(str[i]);
	     int j=1,p=0;
	     for(int i=0;i<n;i++)
	     {
	         if(arr[i]==0)
	         {brr[n-j]=0;j++;}
	         else
	         brr[p++]=arr[i];
	     }
	     for(int i:brr)
	     System.out.print(i+" ");
	     System.out.println();
	 }
	 }
}
