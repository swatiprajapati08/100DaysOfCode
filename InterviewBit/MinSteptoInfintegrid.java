/*

You are in an infinite 2D grid where you can move in any of the 8 directions

 (x,y) to 
    (x+1, y), 
    (x - 1, y), 
    (x, y+1), 
    (x, y-1), 
    (x-1, y-1), 
    (x+1,y+1), 
    (x-1,y+1), 
    (x+1,y-1) 
You are given a sequence of points and the order in which you need to cover the points.. Give the minimum number of steps in which you can achieve it. You start from the first point.

NOTE: This question is intentionally left slightly vague. Clarify the question by trying out a few cases in the “See Expected Output” section.



Input Format
Given two integer arrays A and B, where A[i] is x coordinate and B[i] is y coordinate of ith point respectively.



Output Format
Return an Integer, i.e minimum number of steps.



Example Input
Input 1:

 A = [0, 1, 1]
 B = [0, 1, 2]


Example Output
Output 1:

 2


*/


public class Solution {
    public int coverPoints(ArrayList<Integer> a, ArrayList<Integer> b) {
        int m = a.size();
int x=0;
int y=0;
int dist = 0;
for(int i=1;i<m;i++) {
x=Math.abs(a.get(i)-a.get(i-1));
y=Math.abs(b.get(i)-b.get(i-1));
dist += Math.max(x, y);
}

    return dist;
    }
}
