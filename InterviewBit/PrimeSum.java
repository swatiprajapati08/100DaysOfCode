/*
Given an even number ( greater than 2 ), return two prime numbers whose sum will be equal to given number.

NOTE A solution will always exist. read Goldbach’s conjecture

Example:


Input : 4
Output: 2 + 2 = 4

If there are more than one solutions possible, return the lexicographically smaller solution.

If [a, b] is one solution with a <= b,
and [c,d] is another solution with c <= d, then

[a, b] < [c, d] 

If a < c OR a==c AND b < d. 
*/


public class Solution {
    public ArrayList<Integer> primesum(int A) {
        
        boolean arr[]=new boolean[A+1];
        arr[0]=true;
        arr[1]=true;
        for(int i=2;i*i<=A;i++)
        {
            if(!arr[i])
            {
                for(int j=i*i;j<=A;j+=i)
                arr[j]=true;
            }
        }
        
        ArrayList<Integer> ans=new ArrayList<>();
        //int ans2[]=new int[2];
        for(int i=2;i<=A/2;i++)
        {
            if(arr[i]==false && arr[A-i]==false)
            {
               ans.add(i);
              ans.add(A-i);
                break;
            }
        }
        
        return ans;
    }
}
