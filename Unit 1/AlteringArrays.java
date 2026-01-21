	public static void subtract5FromAll4(int[]nums)
	{
		int [] copyArray = new int[nums.length];
		for(int i=0;i<nums.length; i++)
		{
			copyArray[i] = nums[i]-5;
		}
	}
