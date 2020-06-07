//Print Non-Repeated Elements

//https://practice.geeksforgeeks.org/problems/print-distinct-elements-1587115620/1/?track=SPCF-Hashing&batchId=155

class Hashing
{
    static ArrayList<Integer> printNonRepeated(int arr[], int n)
    {
        LinkedHashMap<Integer,Integer> hs=new LinkedHashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:arr)
        hs.put(i,hs.getOrDefault(i,0)+1);
        
        for(Map.Entry<Integer,Integer> x:hs.entrySet())
        {
            if(x.getValue()==1)
            list.add(x.getKey());
        }
        return list;
    }
}
