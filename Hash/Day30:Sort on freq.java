//https://practice.geeksforgeeks.org/problems/sorting-elements-of-an-array-by-frequency/0/?track=SPCF-Hashing&batchId=155
//Sorting Elements of an Array by Frequency
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
	     String str[]=br.readLine().split(" ");
	     for(int i=0;i<n;i++)
	     arr[i]=Integer.parseInt(str[i]);
	     HashMap<Integer,Integer> hs=new HashMap<>();
	     for(int i:arr)
	     hs.put(i,hs.getOrDefault(i,0)+1);
	     
	     PriorityQueue<Integer> pq=new PriorityQueue<Integer>((a,b)-> {
	         if(hs.get(a)!=hs.get(b)) return hs.get(b)-hs.get(a);
	         else return a-b;
	     });
	     pq.addAll(hs.keySet());
	     
	     while(!pq.isEmpty())
	     {
	         int curr=pq.remove();
	         for(int i=0;i<hs.get(curr);i++)
	         System.out.print(curr+" ");
	     }
	     
	     System.out.println();
	     
	 }
	 }
}
