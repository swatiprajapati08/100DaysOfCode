/*Micro just learned about prime numbers. But he quickly got bored of them, so he defined a new kind of numbers and called them Prime Prime Numbers. A number X is Prime Prime if number of prime numbers from 1 to X (inclusive) are prime. Now he wants to find out the number of Prime Prime numbers from L to R (inclusive). Help Micro with it.

Input:
First line consists of a single integer T denoting number of test cases
Following T lines consists of two space separated integers denoting L and R

Output:
Print the number of Prime Prime Numbers for each between L and R for each test case in a new line.

Constraints:


SAMPLE INPUT 
2
3 10
4 12*/


import java.util.*;
import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean[]  b=new boolean[1000001];
        b[0]=b[1]=true;
        for(int i=2;i*i<=1000000;i++)
        {
            if(!b[i])
            {
                for(int j=i*i;j<=1000000;j+=i)
                b[j]=true;
            }
        }

        int pp[]=new int[1000001];
        int cnt=0;
        for(int i=2;i<=1000000;i++)
        {
            if(!b[i])
            cnt++;
            if(b[cnt]==false)
            pp[i]=1;
            else
            pp[i]=0;
        }
        for(int i=1;i<=1000000;i++)
        pp[i]+=pp[i-1];

        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
        String line[]=br.readLine().split(" ");
        int l=Integer.parseInt(line[0]);
        int r=Integer.parseInt(line[1]);
        System.out.println(pp[r]-pp[l-1]);
        }
    }
}
