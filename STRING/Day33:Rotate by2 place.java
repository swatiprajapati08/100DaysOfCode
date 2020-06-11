//https://practice.geeksforgeeks.org/problems/check-if-string-is-rotated-by-two-places-1587115620/1/?track=SPC-Strings&batchId=155
//Check if string is rotated by two places

class Rotation{
    
    /*  Function to check if two strings are rotated
    *   s1, s2: input strings
    */
    public static boolean isRotated(String s1, String s2){
        
       if(s1.length()!=s2.length() || (s1.length()<=2 && !s1.equals(s2)))
{
return false;
}
else if(s1.length()<2)
return true;
//checking right rotated
String res= s1.substring(0,s1.length()-2);
res=s1.substring(s1.length()-2,s1.length())+res;

if(res.equals(s2))
return true;

//checking left rotated
res= s1.substring(2,s1.length());
res=res+s1.substring(0,2);

if(res.equals(s2))
return true;

return false;
    }
    
}
