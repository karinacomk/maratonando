
public class Solution {

	// Return the number of items can
	// be produced in temp sec.
	static int findItems(int[] arr, int n, int temp) {
		int ans = 0;
		for (int i = 0; i < n; i++)
			ans += (temp / arr[i]);
		return ans;
	}

	// Binary search to find minimum time
	// required to produce M items.
	static int bs(int[] arr, int n, int m, int high)

	{
		int low = 1;

		// Doing binary search to
		// find minimum time.
		while (low < high) {
			// Finding the middle value.
			int mid = (low + high) >> 1;

			// Calculate number of items to
			// be produce in mid sec.
			int itm = findItems(arr, n, mid);

			// If items produce is less than
			// required, set low = mid + 1.
			if (itm < m)
				low = mid + 1;

			// Else set high = mid.
			else
				high = mid;
		}

		return high;
	}
	
	// Return the minimum time required to 
	// produce m items with given machine. 
	static int minTime(int []arr, int n,  
	                   int m) 
	{ 
	    int maxval = Integer.MAX_VALUE; 
	    
	    System.out.println(maxval);
	  
	    // Finding the maximum time in the array. 
	    for (int i = 0; i < n; i++) {
	    	maxval = Math.max(maxval, arr[i]); 
	    	System.out.println(maxval);
	    }
	  
	    return bs(arr, n, m, maxval * m); 
	} 

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		int n = arr.length;
		int m = 11;

		System.out.println(minTime(arr, n, m));
	}

}
