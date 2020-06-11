//https://practice.geeksforgeeks.org/problems/binary-string-1587115620/1/?track=SPC-Strings&batchId=155
//Binary String

class StringBinary{
    public static int binarySubstring(int a, String str)
    {
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='1')
            count++;
        }
        return (count*(count-1))/2;
    }
}
