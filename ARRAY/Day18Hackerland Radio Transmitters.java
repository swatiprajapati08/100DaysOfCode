//Hackerland Radio Transmitters

import java.io.*;
import java.util.*;
class Solution
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String l=br.readLine();
        StringTokenizer ss=new StringTokenizer(l," ");
        int n=Integer.parseInt(ss.nextToken());
        int k=Integer.parseInt(ss.nextToken());
        int arr[]=new int[n];
        String line=br.readLine();
        StringTokenizer st=new StringTokenizer(line," ");
        for(int i=0;i<n;i++)
        arr[i]=Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

       int numOfTransmitters = 0;
        int i = 0;
        while (i < n) {
        numOfTransmitters++;
        int loc = arr[i] + k;
        while (i < n && arr[i] <= loc) i++;
        i--;
        //System.out.print(arr[i]);
        loc = arr[i] + k;
        while (i < n && arr[i] <= loc) i++;
        }
System.out.println(numOfTransmitters);
    }
}
