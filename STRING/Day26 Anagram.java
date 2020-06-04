//Anagram
//https://practice.geeksforgeeks.org/problems/anagram-1587115620/1/?track=SPC-Strings&batchId=155

/*
Input
2
geeksforgeeks forgeeksgeeks
allergy allergic
Output:
YES
NO
*/

class Anagram{    
    /*  Function to check if two strings are anagram
    *   c, d: input string
    */
    public static boolean isAnagram(String s1,String s2)
    {
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        
        for(int i=0;i<s1.length();i++)
        freq1[s1.charAt(i)-'a']++;
        
        for(int i=0;i<s2.length();i++)
        freq2[s2.charAt(i)-'a']++;
        
        for(int i=0;i<26;i++)
        {
            if(freq1[i]!=freq2[i])
            return false;
        }
        return true;
        
    }
}
