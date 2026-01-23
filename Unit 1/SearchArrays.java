
public class SearchArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * Method checks is four exists in array
	 * @param nums
	 * @return
	 */
	public static boolean checkFor4( int[] nums)
	{
		//for loop to go through each number in array
		for(int i=0;i<nums.length; i++)
		{
			//check if number is 4 and returns true if exists
			if(nums[i] == 4)
			{
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Method checks how many fours are in array
	 * @param nums
	 * @return
	 */
	public static int countFor4( int[] nums)
	{
		//count how many times 4 shoes up
		int count = 0;
		//for loop to go through each number in array
		for(int i=0;i<nums.length; i++)
		{
			//check if number is 4 and adds one to count each time if so
			if(nums[i] == 4)
			{
				count++;
			}
		}
		return count;
	}
	
	/**
	 * Method finds if exactly four 4's in array
	 * @param nums
	 * @return
	 */
	public static boolean checkForFour4( int[] nums)
	{
		//count how many times 4 shows up
		int count = 0;
		//for loop to go through each number in array
		for(int i=0;i<nums.length; i++)
		{
			//check if number is 4
			if(nums[i] == 4)
			{
				count++;
				
				//Returns true only if there's four 4's
				if(count == 4)
				{
				return true;
				}
			}
		}
		return false;
	}
	
}
