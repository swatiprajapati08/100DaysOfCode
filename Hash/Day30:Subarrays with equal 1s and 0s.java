//Subarrays with equal 1s and 0s
//https://practice.geeksforgeeks.org/problems/count-subarrays-with-equal-number-of-1s-and-0s-1587115620/1/?track=SPCF-Hashing&batchId=155

 static int countSubarrWithEqualZeroAndOne(int arr[], int N)
    {
        int pre_sum=0,count=0;
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<N;i++)
        {
            pre_sum+=(arr[i]==0)?-1:1;
            if(pre_sum==0)
            count++;
            if(hs.containsKey(pre_sum))
                count+=hs.get(pre_sum);
            
            hs.put(pre_sum,hs.getOrDefault(pre_sum,0)+1);
            
        }
        return count;
    }
