
public class arrayCodingBat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//rotateLeft3()
		public int[] rotateLeft3(int[] nums) {
			return new int [] {nums[1], nums[2], nums[0]};
		}

		//reverse3()
		public int[] reverse3(int[] nums) {
			  return new int [] {nums[2], nums[1], nums[0]};
			}


		//maxEnd3()
		public int[] maxEnd3(int[] nums) {
			  if (nums[0] > nums[2])
			  {
				  return new int [] {nums[0], nums[0], nums[0]};
			  }
			  else
			  {
				  return new int [] {nums[2], nums[2], nums[2]};
			  }
			}


		//sum2()
		public int sum2(int[] nums) {
			  if(nums.length>1)
			  {
			    return nums[0] + nums[1];
			  }
			  else if (nums.length<1)
			  {
			    return 0;
			  }
			  else
			  {
			    return nums[0];
			  }
			}
		
		//middleWay()
		public int[] middleWay(int[] a, int[] b) {
			  return new int [] {a[1], b[1]};
			}


		//makeEnds()
		public int[] makeEnds(int[] nums) {
			  return new int [] {nums[0], nums[nums.length-1]};
			}
		
	}
}
