//https://practice.geeksforgeeks.org/problems/count-distinct-elements-1587115620/1/?track=SPCF-Hashing&batchId=155


class Hashing
{
    // Function to count non-repeated elements in the array
    // arr[]: input array
    // n: size of array
    static long countNonRepeated(int arr[], int n)
    {
        HashMap<Integer,Integer> hs= new HashMap<>();
        for(int i:arr)
         hs.put(i,hs.getOrDefault(i,0)+1);
        
        long count=0;
        for(Map.Entry<Integer,Integer> s :hs.entrySet())
        {
            if(s.getValue()==1)
            count++;
        }
        return  count;
    }
}
