//Isomorphic Strings

//https://practice.geeksforgeeks.org/problems/isomorphic-strings-1587115620/1/?track=SPC-Strings&amp;batchId=155

/*Example:
Input:
2
aab
xxy
aab
xyz
Output:
1
0  */


class Isomorphic{
    // This function returns true if str1 and str2 are ismorphic
    // else returns false
    public static boolean areIsomorphic(String S1,String S2)
    {
        
        if(S1.length()!=S2.length())
        return false;
        int a[]=new int[256];
        int b[]=new int[256];
        
        for(int i=0;i<S1.length();i++)
        {
            if(a[S1.charAt(i)]==0 && b[S2.charAt(i)]==0)
            {
                a[S1.charAt(i)]=S2.charAt(i);
                b[S2.charAt(i)]=S1.charAt(i);
            }
            else
            {
                if(a[S1.charAt(i)]!=S2.charAt(i)&&b[S2.charAt(i)]!=S1.charAt(i)) return false;
            }
        }
        return true;
        
        
        
    }
}
