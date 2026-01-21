//method that subtracts 5 from each number in the array
public static void subtract5FromAll4(int[]nums)
	{
		//creates a copy of the array by creating a new one the same length
		int [] copyArray = new int[nums.length];
		//a for loop that goes through each number in the array
		for(int i=0;i<nums.length; i++)
		{
			//the array that is copied subtracts 5 from each number
			copyArray[i] = nums[i]-5;
		}
	}
