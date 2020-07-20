class Solution {
    public boolean isPalindrome(String s) {
        StringBuffer sb=new StringBuffer("");
        
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
                sb.append(Character.toLowerCase(s.charAt(i)));
        }
        String str=sb.toString();
        //System.out.println(str);
        //if(str.length()==1)
           // return false;
        int l=0,r=str.length()-1;
        
        while(l<r)
        {
            if(str.charAt(l)!=str.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}
