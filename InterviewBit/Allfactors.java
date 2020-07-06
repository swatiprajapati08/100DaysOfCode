/*Given a number N, find all factors of N.

Example:

N = 6 
factors = {1, 2, 3, 6}
Make sure the returned array is sorted.
*/

public class Solution {
    public ArrayList<Integer> allFactors(int A) {
        
        ArrayList<Integer> arrs=new ArrayList<>();
        TreeSet<Integer> arr=new TreeSet<>();
        if(A==1)
        {arrs.add(1);
        return arrs;}
        for(int i=1;i*i<=A;i++)
        {
            if(A%i==0)
           { arr.add(i);
           arr.add(A/i);
           }
        }
            for (Integer value : arr)
            arrs.add(value);
        return arrs;
    }
}
