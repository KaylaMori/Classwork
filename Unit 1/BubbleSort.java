
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
	
	/**
	 * Moves first number to last spot
	 * @param nums
	 */
	public static void bubbleSort(int[]nums)
	{      
		boolean isSorted = false;
		while(!isSorted)
		{
			isSorted = true;
		}
		// Traverses the array
	    for (int i = 0; i < nums.length - 1; i++) 
	    {
	    	//Sorts the array 
	    	if(nums[i]>nums[i+1])
	    	{
	    		int first = nums [i];
	    		nums[i] = nums[i + 1];
	    		nums[i+1] = first;
	    		isSorted = false;
	    	}	
	    }
	}
		
