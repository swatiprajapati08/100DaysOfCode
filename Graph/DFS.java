//https://practice.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1/?track=ppc-graph&batchId=221


class Traversal
{
    static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> g, int N)
    {
      boolean visited[]=new boolean[N];
      ArrayList<Integer> res=new ArrayList<>();
      for(int i=0;i<N;i++)
      {
          if(!visited[i])
          dfsUtil(visited,i,g,N,res);
      }
      return res;
    }
    static void dfsUtil(boolean visited[], int s,ArrayList<ArrayList<Integer>> g,int N,ArrayList<Integer> res)
    {
        visited[s]=true;
        res.add(s);
        for(int u:g.get(s))
        {
            if(!visited[u])
           dfsUtil(visited,u,g,N,res);
        }
    }
}

