//Maximum Occuring Character


class MaxOccur{
    
    // Function to get maximum occuring 
    // character in given string str
    public static char getMaxOccuringChar(String S){
        
        int freq[]=new int[26];
        for(int i=0;i<S.length();i++)
        freq[S.charAt(i)-'a']++;
        
        int max=0;
        char ch='\u0000';
        
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]>max)
            {
                max=freq[i];
                ch=(char)(i+'a');
            }
        }
        return ch;
    }
    
}
