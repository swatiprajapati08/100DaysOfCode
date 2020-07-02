[TLE]
-------------------------------------------------------
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int hammingDistance(final List<Integer> A) {
        
        int ans=0;
        for(int i=0;i<A.size()-1;i++)
        {
            for(int j=i+1;j<A.size();j++)
            ans+=count(A.get(i),A.get(j)) *2;
        }
        return ans;
        
    }
    static int count(int A,int B)
    {
        int c=0;
        for(int i=0;i<32;i++)
        {
            if(((A >> i) & 1) != ((B >> i) & 1))
            c++;
        }
        return c;
    }
}

