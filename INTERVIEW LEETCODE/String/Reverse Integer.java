//Reverse Integer


class Solution {
    public int reverse(int x) {
        long rev=0;
        while(x!=0)
        {
         rev=rev*10+x%10;
            x/=10;
        }
        return (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)?0 :(int)rev;
    }
}

/* Gain :How to check overflow
long test = (long)x+y;
if (test > Integer.MAX_VALUE || test < Integer.MIN_VALUE)  
//overflow */
