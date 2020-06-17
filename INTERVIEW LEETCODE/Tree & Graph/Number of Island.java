class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length==0)
            return 0;
        
        int c=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)    
            {
               if(grid[i][j]=='1')
               { doDFS(grid,i,j); c++; } 
            }
        }
      return c;
    }
    static void doDFS(char[][] grid,int i,int j)
    {
          if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j] == '0')
         return ;
        
        grid[i][j]='0';
        doDFS(grid, i+1, j);
        doDFS(grid, i-1, j);
        doDFS(grid, i, j+1);
        doDFS(grid, i, j-1);
    }
}