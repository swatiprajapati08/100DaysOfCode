//https://practice.geeksforgeeks.org/problems/count-ways-to-reach-the-nth-stair-1587115620/1/?track=SPC-DP&batchId=155

class DynamicProgramming{
    
    // function to count ways to reach mth stair
    Long countWays(int m){
        
       long dp[]=new long[m+1];
       
       
       dp[0]=1;dp[1]=1; 
       //dp[2]=2;
       for(int i=2;i<=m;i++)
        dp[i]=(dp[i-1]%1000000007+dp[i-2]%1000000007)%1000000007;
        
        return dp[m];
    }
    
}
