public class moreAlterArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Create a method noNegatives() that is passed a double array nums and returns a copy of that array, 
		 * except any negative elements are changed to 0.

		Ex: 

		noNegatives( {-5, 0, -8, 20}  )   -------returns----->     {0, 0, 0, 20}
		
		2. Create a method dropLowest() that is passed an int array nums and returns a copy of that array, 
		except the lowest number in the array has been changed to 0.

		Ex: 

		subtract5FromAll4( {9, -2, 12, 8}  )   -------returns----->     {9, 0, 12, 8}
		 */
	}

	
	/**
	 * Method sets all negatives to zero
	 * @param nums
	 * @return
	 */
	public static double[] noNegatives(double[] nums)
	{
		//creates a copy
		double [] copyArray = new double[nums.length];
		//for loop to go through each number in array
		for(int i=0;i<nums.length; i++)
		{
			//check if number is negative and turn to 0 if so or else it stays the same
			if(nums[i]<0)
			{
				copyArray[i] = 0;
			}
			else
			{
				copyArray[i] = nums[i];
			}
		}
		return copyArray;
	}
	
	/**
	 * Method sets lowest number in array as zero
	 * @param nums
	 * @return
	 */
	 public static int[] dropLowest(int[] nums) 
	 {
		 //creates a copy
		 int[] copyArray = new int[nums.length];
		 //keeps track of lowest number
		 int lowestNumber = nums[0];
		 
		 //for loop to find the lowest number
	     for (int i = 0; i < nums.length; i++) 
	     {
	    	 //starts with the first and goes through each one to see if it is lower than what is already set as the lowest
	    	 //and sets the new lowest as lowestNumber which is looped again to check with the next
	    	 if (nums[i] < lowestNumber) 
	         {
	    		 lowestNumber = nums[i];
	         }
	     }
	     
	     //for loop to just get to the number that was the lowest
	     for (int i = 0; i < nums.length; i++) 
	     {
	    	 //Sets whatever number was the lowest to zero and the rest the same
	    	 if (nums[i] == lowestNumber) 
	    	 {
	    		 copyArray[i] = 0;
	    	 } 
	    	 else 
	         {
	    		 copyArray[i] = nums[i];
	         }
	     } 
	     return copyArray;
	 }
	
}
