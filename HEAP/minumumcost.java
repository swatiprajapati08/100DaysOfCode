import java.util.*;
import java.io.*;

public class GFG {
  public static void main(String args[]) throws IOException {
    
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   int t=Integer.parseInt(br.readLine());
    while(t-->0)
    {
      int n=Integer.parseInt(br.readLine());
      PriorityQueue<Long> pq= new PriorityQueue<>(); 
      String str[]=br.readLine().split(" ");
      for(int i=0;i<n;i++)
      {
        long x=Long.parseLong(str[i]);
        pq.add(x);
      }
      long cost=0;
      for(int i=1;i<n;i++) 
      {
        long a=pq.poll();
        long  b=pq.poll();
        cost+=a+b;
        pq.add(a+b);
      }
      if(n==1)
      System.out.println(pq.poll());
      else
      System.out.println(cost);
    }
    
  }
}
