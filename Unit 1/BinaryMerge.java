public class binaryMerge{
    
    public static void main(String[] args){
    	
    }
    /**
     * This method uses binary search and recursion to find a specific target number by closing in on the
     * left or right as needed by finding the middle number as well.
     * @param nums
     * @param target
     * @param left
     * @param right
     * @return
     */
    public static int binarySearch(int[] nums, int target, int left, int right)
    {
        // if the right side of array us greater
        if(right > left)
        {
        	// finds middle index
        	int mid = left + (right - left) / 2;

        	// if target found at middle number
        	if(nums[mid] == target)
        	{
        		//returns the middle number
        		return mid;
        	}

        	// if the middle number is greater than the target number, search the left side of the array
        	if(nums[mid] > target)
        	{
        		// recursion of the binary search to slowly close in on the left side by minusing middle
        		return binarySearch(nums, target, left, mid - 1);
        	}
        	
        	// or... search right half! (doing the opposite but the right side closing down instead)
            return binarySearch(nums, target, mid + 1, right);
        }
        // Needed return
		return target;
        
    }
    
    /**
     * This method uses merge sort and recursion by splitting it up into two arrays first
     * then combining it back together 
     * @param nums
     * @param left
     * @param right
     */
    public static void mergeSort(int[] nums, int left, int right) 
    {
    	//if right is larger than left
        if (right > left) 
        {
            // finds middle number
        	int mid = left + (right - left) / 2;

            // recursion! works with left hand side array by redoing middle number
            mergeSort(nums, left, mid);

            // does the same thing except on the right 
            mergeSort(nums, mid, right);

            // carries over the array, left, middle, and right numbers stored
            merge(nums, left, mid, right);
        }
        
    }

    /**
     * This is the method that works with trying to piece the array back together
     * @param nums
     * @param left
     * @param mid
     * @param right
     */
    private static void merge(int[] nums, int left, int mid, int right) 
    {
    	// finds the sizes of the two separate arrays calculated already
        int one1 = mid - left;
        int two2 = right - mid;
        // creates the two new arrays
        int[] Left = new int[one1];
        int[] Right = new int[two2];
        
        // base set numbers
        int i = 0;
        int j = 0;
        int k = left;

        // compares numbers from Left and Right and finds the smaller one
        while (i < one1 && j < two2) 
        {
        	//if the Left has the smaller number then
            if (Left[i] < Right[j]) 
            {
            	//puts back in array the new smallest each time whatever index it's at is smaller
                nums[k] = Left[i];
                i++;
            } 
            else 
            {
            	//puts back in array the smallest number from the right array if it turns out not to be in the Left
                nums[k] = Right[j];
                j++;
            }
        }
    }
}
