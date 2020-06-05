//Power Set Using Recursion
//https://practice.geeksforgeeks.org/problems/power-set-using-recursion/1/?track=SPCF-Recursion&batchId=155
//date 5 june
class LexSort
{
    // complete the function
    static ArrayList<String> powerSet(String s)
    {
        ArrayList<String> res=new ArrayList<String>();
        permute(s,0,"",res);
        Collections.sort(res);
        return res;
    }
    
    static void permute(String s,int index,String out,ArrayList<String> ans)
    {
        if(index==s.length())
        {
            ans.add(out);
            return;
        }
        permute(s,index+1,out+s.charAt(index),ans);
        permute(s,index+1,out,ans);
    }
    
}
