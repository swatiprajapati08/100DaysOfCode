//https://practice.geeksforgeeks.org/problems/length-of-largest-region-of-1s-1587115620/1/?track=ppc-graph&batchId=221


class Area {
    static int findMaxArea(int N, int M, int A[][]) {
        int max=-1;int count=0;
        boolean visited[][]=new boolean[N][M];
        int res=0;
        Res obj= new Res();
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                if(A[i][j]==1 && !visited[i][j])
                {
                    
                    dfs(i,j,A,visited,N,M,obj);
                    res=Math.max(res,obj.res);
                    obj.res=0;
                }
            }
        }
        return res;
    }
   static int dx[]={-1,-1,-1,0,0,1,1,1};
    static int dy[]={-1,0,1,-1,1,-1,0,1};
    static void dfs(int i,int j,int A[][],boolean visited[][],int N,int M,Res obj)
    {
        
            visited[i][j]=true;
            obj.res++;
            for(int u=0;u<8;u++)
            {
                if(isSafe(i+dx[u],j+dy[u],A,visited,N,M)==true)
                dfs(i+dx[u],j+dy[u],A,visited,N,M,obj);
            }
    }
    public static boolean isSafe(int i,int j,int A[][],boolean visited[][],int N,int M)
    {
     return i>=0&&i<N&&j>=0 && j<M && A[i][j]==1&&visited[i][j]==false;
    }
}
class Res{
    int res;
    Res(){
        
    }
}
