//https://practice.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1/?track=SPCF-Hashing&batchId=155

static boolean findsum(int arr[],int n)
{
    int pre_sum=0,count=0;
    HashMap<Integer,Integer> hs=new HashMap<>();
    for(int i:arr)
    {
        pre_sum+=i;
        if(pre_sum==0)
        count++;
        if(hs.containsKey(pre_sum))
        {count+=hs.get(pre_sum);
        hs.put(pre_sum,hs.get(pre_sum)+1);
        }
        else
        hs.put(pre_sum,1);
    }
    return (count>0)? true:false;
}
