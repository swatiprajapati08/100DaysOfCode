//https://practice.geeksforgeeks.org/problems/count-ways-to-nth-stairorder-does-not-matter1322/1/?track=SPC-DP&batchId=155


class DynamicProgramming{
    
    // function to find number of ways 
    Long countWays(int m){
        
          
        if(m==1) return (long)1;
        else if(m%2!=0)
        return((long)(m+1)/2);
        else return((long)(m/2+1));
        
    }    
    
    
}
