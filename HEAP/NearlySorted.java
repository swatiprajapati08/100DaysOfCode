//Nearly sorted
//https://practice.geeksforgeeks.org/problems/nearly-sorted-1587115620/1/?track=SPC-Heap&batchId=155

class solve{
    void nearlySorted(int arr[], int num, int k){
     PriorityQueue<Integer> pq =new PriorityQueue<>();
      for(int i=0;i<num;i++)
      {
         pq.add(arr[i]);
         if(pq.size()>k)
         System.out.print(pq.poll()+" ");
      }
      while(!pq.isEmpty())
      System.out.print(pq.poll()+" ");
    }
}
