//https://practice.geeksforgeeks.org/problems/occurences-of-2-as-a-digit/1


 public static long count2s(long n)
    {
        
        ArrayList<Long> al=new ArrayList<Long>();String s=String.valueOf(n);
        long[] arr=new long[s.length()];
        long c=0,t=0;int k=0;
        for(long i=0;i<=n;i++)
        {
            t=i;k=0;
            while(t>0)
            {
                arr[k++]=t%10;
                t/=10;
            }
            for(int j=0;j<k;j++)
            {
                if(arr[j]==2)
                c++;
            }
        }
        return c;
    }
