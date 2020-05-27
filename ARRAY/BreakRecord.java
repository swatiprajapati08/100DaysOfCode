//Breaking the Records
import java.io.*;
import java.util.*;
class Solution
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int arr[]=new int[n];
        String line=br.readLine();
        StringTokenizer st=new StringTokenizer(line," ");
        for(int i=0;i<n;i++)
        arr[i]=Integer.parseInt(st.nextToken());
        BreakRecord(arr);

    }
    static void BreakRecord(int arr[])
    {
        int min=arr[0],max=arr[0];
        int c1=0,c2=0;
        for(int i=1;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                c1++;
                min=arr[i];
            }
            if(max<arr[i])
            {
                c2++;
                max=arr[i];
            }
        }
        System.out.println(c2+" "+c1);
    }

}