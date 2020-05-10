//
import java.util.*;
class Solution
{
   static int pageCount(int n, int p) {
       
         int page1 = Math.abs((p) / 2);
        if(n%2==0)n++;
    int page2 = Math.abs((p - (n)) / 2);
    return Math.min(page1,page2);
    }

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int p=sc.nextInt();

System.out.println(pageCount(n,p));
}
}