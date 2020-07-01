/*Find and Print All The Prime Numbers Between L and R (Both L and R Inclusive)

Input Format

Take Input Value of L and R

Output Format

Print All The Prime Number Between L and R (Both L and R inclusive)

Constraints

0 < L < 10001
0 < R < 10001
L <= R
SAMPLE INPUT 
2 10
SAMPLE OUTPUT 
2 3 5 7
*/

import java.util.*;
import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

       String line[]=br.readLine().split(" ");
        int l=Integer.parseInt(line[0]);
        int r=Integer.parseInt(line[1]);
        boolean[]  b=new boolean[10002];
        b[0]=b[1]=true;

        for(int i=2;i<=10001;i++)
        {
            if(!b[i])
            {
                for(int j=i*i;j<=10001;j+=i)
                b[j]=true;
            }
        }

        for(int i=l;i<=r;i++)
        {
            if(b[i]==false)
            System.out.print(i+" ");
        }
    }
}
