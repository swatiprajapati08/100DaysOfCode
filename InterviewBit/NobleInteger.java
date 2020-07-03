/*Problem Description

Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals to p.



Input Format
First and only argument is an integer array A.



Output Format
Return 1 if any such integer p is found else return -1.



Example Input
Input 1:

 A = [3, 2, 1, 3]
Input 2:

 A = [1, 1, 3, 3] */



public class Solution {
    public int solve(ArrayList<Integer> A) {
      Collections.sort(A);
      if(A.get(A.size()-1)==0)return 1;
      for(int i=0;i<A.size()-1;i++)
      {
          if(A.get(i)==A.get(i+1))continue;
         if(A.size()-i-1==A.get(i))return 1;
          
      }
      return -1;
    }
}
