//https://practice.geeksforgeeks.org/problems/x-total-shapes/0/?track=SPC-Graph&batchId=155


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-->0)
	 {
	     int n=sc.nextInt();
	     int m=sc.nextInt();
	     char arr[][]=new char[n][m];
	     boolean visited[][]=new boolean[n][m];
	     for(int i=0;i<n;i++)
	     {
	         String str=sc.next();
	         for(int j=0;j<m;j++)
	         {
	         arr[i][j]=str.charAt(j);
	         }
	     }
	     int count=0;
	     for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < m; j++)
                    {
                        if (arr[i][j] == 'X' && !visited[i][j] )
                        {
                            dfs(arr, visited, i, j, n, m);
                            count++;
                        }
                    }
            }
	     System.out.println(count);
	 }
	 }
	 
	 static int dx[] = { -1, 0, 1, 0}; 
     static int dy[] = {0, -1, 0, 1};

	 static void dfs(char arr[][],boolean visited[][],int p,int q,int n,int m)
	 {
	   if(p<0 || q<0 || p>=n || q>=m ||visited[p][q] == true || arr[p][q]=='O')
	   return;
	  else{
	       visited[p][q]=true;
	   
	   for(int i=0;i<4;i++)
	       dfs(arr,visited,p+dx[i],q+dy[i],n,m);
	  }
	 }
 }
 
