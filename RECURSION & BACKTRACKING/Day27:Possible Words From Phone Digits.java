//Possible Words From Phone Digits
//https://practice.geeksforgeeks.org/problems/possible-words-from-phone-digits-1587115620/1/?track=SPCF-Recursion&batchId=155

class PhoneDigit
{
    static String keys[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static void possibleWords(int a[], int N)
    {
      int l=0;
      Words(a,N,l,"");
    }
    static void Words(int a[],int N,int index,String curr)
    {
        if(N==index)
        {
            System.out.print(curr+" ");
            return;
        }
        else
        {
            for(int i = 0; i < keys[a[index]].length(); i++)
            Words(a,N,index+1,curr+keys[a[index]].charAt(i));
        }
    }
}
