public class Solution {
    public int isPalindrome(int A) {
        if(A<0)
        return 0;
        int rev=0;
        int m=A;
        while(m!=0)
        {
            rev=rev*10+m%10;
            m/=10;
        }
        if(rev==A)
        return 1;
        else
        return 0;
    }
}
