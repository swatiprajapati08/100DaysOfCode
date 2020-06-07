//https://practice.geeksforgeeks.org/problems/winner-of-an-election-where-votes-are-represented-as-candidate-names-1587115621/1/?track=SPCF-Hashing&batchId=155

class Election
{
    static void winner(String arr[], int n)
    {
        Map<String,Integer> tree= new TreeMap<>();
        for(String s:arr)
        tree.put(s,tree.getOrDefault(s,0)+1);
        
        int max=-1;String ans="";
        
        for(Map.Entry<String,Integer> x:tree.entrySet())
        {
            if(x.getValue()>max)
            {
                max=x.getValue();
                ans=x.getKey();
            }
        }
        System.out.print(ans+" "+max);

}
}
