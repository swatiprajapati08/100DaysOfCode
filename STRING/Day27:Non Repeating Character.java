//Non Repeating Character
/*
Example:
Input :
3
hello
zxvczbtxyzvy
xxyyzz
Output :
h
c
-1
*/

class Repeatation
{
    static char nonrepeatingCharacter(String S)
    {
        int freq[]=new int[256];
        for(int i=0;i<S.length();i++)
        freq[S.charAt(i)-'a']++;
        
        for(int i=0;i<S.length();i++)
        {
            if(freq[S.charAt(i)-'a']==1)
            return S.charAt(i);
        }
        return '$';
    }
}
