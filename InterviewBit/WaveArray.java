/*Given an array of integers, sort the array into a wave like array and return it,
In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5.....

Example

Given [1, 2, 3, 4]

One possible answer : [2, 1, 4, 3]
Another possible answer : [4, 1, 3, 2]*/



public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
       Collections.sort(A);
        int n=A.size();
        if(A.size()%2!=0)
            n=A.size()-1;
            
            
        for(int i=0;i<n;i+=2)
        {
            int temp=A.get(i);
            A.set(i,A.get(i+1));
            A.set(i+1,temp);
        }
        return A;
    }
}
