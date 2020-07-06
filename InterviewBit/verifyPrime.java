/*Given a number N, verify if N is prime or not.

Return 1 if N is prime, else return 0.

Example :

Input : 7
Output : True
*/

public class Solution {
    public int isPrime(int A) {
       if(A==1)
       return 0;
       for(int i=2;i*i<=A;i++)
       {
           if(A%i==0)
           return 0;
       }
       return 1;
    }
}
