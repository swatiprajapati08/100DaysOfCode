//Valid Anagram

class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()) return false;
        
        char ch[]=s.toCharArray();
        char ch2[]=t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch2);
        for(int i=0;i<t.length();i++)
        {
            if(ch[i]!=ch2[i])
                return false;
        }
        return true;
    }
}
