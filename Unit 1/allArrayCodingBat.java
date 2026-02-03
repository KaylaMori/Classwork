
public class allArrayCodingBat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//has23
		
		public boolean has23(int[] nums) {
		  for(int i=0;i<nums.length; i++)
			{
			  if (nums[0]==2 || nums[nums.length-1]==3 || nums[0]==3)
			  {
				  return true;
			  }
			}
			return false;
		}
		
		//no23
		
		public boolean no23(int[] nums) {
			for(int i=0;i<nums.length; i++)
			{
				if (nums[0]==2 || nums[nums.length-1]==3 || nums[0]==3 || nums[nums.length-1]==2)
				{
					return false;
				}
			}
			return true;
		}

		
		//makeLast
		
		public int[] makeLast(int[] nums) {  
			if(nums.length == 1)
			{
			   return new int [] {0, nums[nums.length-1]};
			}
			if(nums.length == 2)
			{
			   return new int [] {0, 0, 0, nums[nums.length-1]};
			}
			if(nums.length == 3)
			{
			   return new int [] {0, 0, 0, 0, 0, nums[nums.length-1]};
			}
			if(nums.length == 4)
			{
			   return new int [] {0, 0, 0, 0, 0, 0, 0, nums[nums.length-1]};
			}
			return nums;
		}

		
		//double23
		
		public boolean double23(int[] nums) {
			for(int i=0;i<nums.length; i++)
			{
				if (nums.length == 1)
				{
					return false;
				}
				if (nums[0]==2 && nums[nums.length-1]==2)
				{
					return true;
				}
				if (nums[0]==3 && nums[nums.length-1]==3)
				{
					return true;
				}
			}
			return false;
		}

		
		//fix23
		
		public int[] fix23(int[] nums) {
			for(int i=0;i<nums.length; i++)
			{
				if (nums[0]==2 && nums[1]==3)
				{
					return new int [] {nums [0], 0, nums [2]};
				}
				if (nums[1]==2 && nums[2]==3)
				{
					return new int [] {nums [0], nums [1], 0};
				}
			}
			return nums;
		}

		
		//start1
		
		public int start1(int[] a, int[] b) {
			int count = 0;
			for(int i=0;i<a.length; i++)
			{
				if (a[i] == 1)
				{
					count++;
				}
			}
			for(int i=0;i<b.length; i++)
			{
				if (b[i] == 1)
				{
					count++;
				}
			}
			return count;
		}

		
		//biggerTwo
		
		public int[] biggerTwo(int[] a, int[] b) {
			int sumA = 0;
			int sumB = 0;
			for(int i=0;i<a.length; i++)
			{
				sumA = a[0]+a[1];
			}
			for(int i=0;i<b.length; i++)
			{
				sumB = b[0]+b[1];
			}
				
			if (sumA>sumB)
			{
				return new int [] {a[0], a[1]};
			}
			if (sumB>sumA)
			{
				return new int [] {b[0], b[1]};
			}
			if (sumA == sumB)
			{
				return new int [] {a[0], a[1]};
			}
			return new int [] {a[0], a[1]};
						
		}

		
		//makeMiddle
		
		public int[] makeMiddle(int[] nums) {
			return new int[] {nums[nums.length / 2 - 1], nums[nums.length / 2]};
		}
		
		//plusTwo
		
		public int[] plusTwo(int[] a, int[] b) {
			return new int[] {a[0], a[1], b[0], b[1]};
		}

		
		//swapEnds
		
		public int[] swapEnds(int[] nums) {
			int temp = nums[0];
			nums[0] = nums[nums.length - 1];
			nums[nums.length - 1]=temp;
			return nums;
		}

		
		//midThree
		
		public int[] midThree(int[] nums) {
			return new int[] {nums[nums.length / 2 - 1], nums[nums.length / 2], nums[nums.length / 2 + 1]};
		}

		
		//maxTriple
		
		public int maxTriple(int[] nums) {
			int highest = 0;
			if (nums[0]>nums[nums.length/2])
			{
				if (nums[0]>nums[nums.length-1])
			    {
			      return nums[0];
			    }
			    else
			    {
			      return nums[nums.length-1];
			    }
			}
			if (nums[0]<nums[nums.length/2])
			{
				if (nums[nums.length/2]>nums[nums.length-1])
			    {
			      return nums[nums.length/2];
			    }
			    else
			    {
			      return nums[nums.length-1];
			    }
			   
			}
			return nums[nums.length/2];
		}

		
		//frontPiece
		
		public int[] frontPiece(int[] nums) {
			if(nums.length<1)
			{
				return new int[] {};
			}
			if(nums.length<=1)
			{
				return new int[] {nums[0]};
			}
			return new int[] {nums[0], nums[1]};
		}

		
		//unlucky1
		
		public boolean unlucky1(int[] nums) {
			  if (nums.length <=1)
			  {
			    return false;
			  }
			  if (nums[0]==1 && nums[1]==3)
				{
					return true;
				}
				if (nums[1]==1 && nums[2]==3)
				{
					return true;
				}
				if (nums[nums.length-2]==1 && nums[nums.length-1]==3)
				{
					return true;
				}
				return false;
			}

		
		//make2
		
		public int[] make2(int[] a, int[] b) {
			if (a.length<1)
			{
				return new int[] {b[0], b[1]};
			}
			if (a.length==1)
			{
				return new int[] {a[0], b[0]};
			}
			if (a.length>1)
			{
				return new int[] {a[0], a[1]};
			}
			return new int[] {a[0], a[1]};
		}
		
		//front11
		
		public int[] front11(int[] a, int[] b) {
			if (a.length<1 && b.length<1)
			{
				return new int[] {};
			}
			if (a.length<1)
			{
				return new int[] {b[0]};
			}
			if (b.length<1)
			{
				return new int[] {a[0]};
			}
			if(a.length>1 || b.length>1)
			{
				return new int[] {a[0],b[0]};
			}
			return new int[] {a[0],b[0]};
		}

		
		
	}

}
