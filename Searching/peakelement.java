https://practice.geeksforgeeks.org/problems/peak-element/1/?track=SPCF-Searching&batchId=155

class Peak
{
	// Function to find the peak element
	// a[]: input array
	// n: size of array a[]
	public int peakElement(int[] a,int n)
    {
       return peakUtil(a,0,n-1,n);
    }
    static int peakUtil(int arr[],int low,int high,int n)
    {
        int mid=low+(high-low)/2;
        if((mid==0|| arr[mid]>=arr[mid-1]) && (mid==n-1 || arr[mid+1]<=arr[mid]))
        return mid;
        else if (mid > 0 && arr[mid-1] > arr[mid]) 
			return peakUtil(arr, low, (mid -1), n); 
		else
		    return peakUtil(arr, mid+1, high, n); 
		
        
    }
}