/*Problem Description

Given a column title A as appears in an Excel sheet, return its corresponding column number.



Problem Constraints
1 <= |A| <= 100



Input Format
First and only argument is string A.



Output Format
Return an integer

*/

public class Solution {
    public int titleToNumber(String A) {
        int ans=0;
        if(A.length()==1)
        return (A.charAt(0)-'A')+1;
        int count=A.length();
        
        for(int i=0;i<A.length();i++)
        {ans+=Math.pow(26,count-1)*((A.charAt(i)-'A')+1);
            count--;
        }
        return ans;
    }
}
