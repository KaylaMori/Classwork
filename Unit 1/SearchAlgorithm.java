public class stuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}
	/**
	 * This method cuts algorithm in half again and again until they find the target number
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int searchAlg(int[] nums, int target)
	{
    //This is minimum number
		int min = 0;
    //This is maximum number
		int max = nums.length -1;
    //This is middle number
		int mid = min + (max-min)/2;
		//runs until target is found
		while (nums[mid] != target)
		{
			//finds where target is located in first or last half
			if (nums[mid] > target)
			{
				//cuts down to the first half, making current middle the max
				max = mid;
				//finds middle term
				mid = max/2;
				/*
				if (nums[mid+1] == target)
				{
					mid = mid +1;
				}
				*/
			}
			else if (nums[mid] < target)
			{
				//cuts down to the later half, making current middle the min
				min = mid;
				//finds middle term
				mid = min + (max-min)/2;
			}
		}
		//returns the index of a number (mid?)
		return mid;
	}


}
