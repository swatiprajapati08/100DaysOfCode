//https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/


class Traversal {
    static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> g, int N) {
       boolean visited[]=new boolean[N];
       Queue<Integer> q=new LinkedList<Integer>();
       ArrayList<Integer> res=new ArrayList<>();
       visited[0]=true;
       q.add(0);
       while(!q.isEmpty())
       {
           int temp=q.poll();
           res.add(temp);
           for(int i: g.get(temp))
           {
               if(!visited[i])
               q.add(i);
           }
       }
    return res;
    }
}
