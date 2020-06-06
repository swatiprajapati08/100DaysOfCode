//https://practice.geeksforgeeks.org/problems/number-of-occurrence/0

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
	     int search=Integer.parseInt(s[1]);
	     int arr[]=new int[n];
	     String str[]=br.readLine().split(" ");
	     for(int i=0;i<n;i++)
	     arr[i]=Integer.parseInt(str[i]);
	     HashMap<Integer,Integer> hs=new HashMap<>();
	     for(int i:arr)
	     hs.put(i,hs.getOrDefault(i,0)+1);
	     
	     boolean flag=false;
	     for(Map.Entry entry:hs.entrySet()){
          if((int)entry.getKey()==search){
            System.out.println(entry.getValue());
            flag=true;
            }
            }
            if(!flag)
        System.out.println("-1");
	 }
	 }
}
