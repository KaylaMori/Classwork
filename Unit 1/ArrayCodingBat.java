public class arrayCodingBat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//firstLast6()
		public boolean firstLast6(int[] nums) {
			  for(int i=0;i<nums.length; i++)
					{
					  if (nums[0]==6 || nums[nums.length-1]==6)
					  {
						return true;
					  }
					}
				return false;
			}


		//sameFirstLast()
		
		public boolean sameFirstLast(int[] nums) {
			  for(int i=0;i<nums.length; i++)
					{
					  if (nums[0] == nums[nums.length-1])
					  {
						return true;
					  }
					}
				return false;
			}

		
		//makePi()
		
		public int[] makePi() {
			  return new int [] {3,1,4};
			}

		
		//commonEnd()
		
		public boolean commonEnd(int[] a, int[] b) {
			  for(int i=0;i<a.length; i++)
				{
				   if (a[0] == b[0] || b[b.length-1] == a[a.length-1])
					 {
					  	return true;
					 }
				}
			  return false;
			}


		//sum3()
		
		public int sum3(int[] nums) {
			  for(int i=0;i<nums.length; i++)
				{
				  return nums[0]+nums[1]+nums[2];
				}
				return nums[3];
			}

	}

}
