
public class arraysIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]doubArr;
		double[]doubArr;
		String[]doubArr;
		Circle[]doubArr;
		
		int[]nums= {7, -12, 88, -88, 0, 5, 2000};
		
		String[]fruitsArr = {null, null, null, null, null};
		int[]fruitsArr = {0, 0, 0, 0, 0};
		double[]fruitsArr = {0.0, 0.0, 0.0, 0.0, 0.0};
		boolean[]fruitsArr = {false, false, false, false, false};
		
		String[]fruitsArr = new String[2] = {Bapple};
		String[]fruitsArr = new String[nums.length-1] = {Zanana};
		
		System.out.print(nums[2]);
		
		for( int i = 0; i<nums.length; i++)
		{
			nums[i]++;
		}
	}

}
