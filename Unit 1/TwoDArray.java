
public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Instantiate a 2-D array gridNums that consists of 4 rows and 6 columns using the new keyword. 
		int[][] gridNums = new int [4][6];

		//2. Instantiate a 2-D array with the following values:

		/*
		4   5    7

		2  -1   8

		0  1   3
		*/
		int[][]gridNums2 = {
				{4,5,7},
				{2,-1,8},
				{10,1,10}
				};
		

		//For the following problems, print out those elements before and after to verify it worked. 
		
		//3. For both of those arrays, change the element in the first row, first column to a 17.
		//Prints out first 2D array
		for(int j=0; j<gridNums.length; j++)
		{
			for(int i=0; i<gridNums[j].length; i++)
			{
				System.out.print(gridNums[j][i] + " ");
			}
			System.out.println();
		}
		//Prints out second 2D array
		for(int j=0; j<gridNums2.length; j++)
		{
			for(int i=0; i<gridNums2[j].length; i++)
			{
				System.out.print(gridNums2[j][i] + " ");
			}
			System.out.println();
		}
		
		//Changes the first and second 2D array's first row and first column to 17
		gridNums[0][0] = 17;
		gridNums2[0][0] = 17;
		
		//Prints out first 2D array after changing element
		for(int j=0; j<gridNums.length; j++)
		{
			for(int i=0; i<gridNums[j].length; i++)
			{
				System.out.print(gridNums[j][i] + " ");
			}
			System.out.println();
		}
		//Prints out second 2D array after changing element
		for(int j=0; j<gridNums2.length; j++)
		{
			for(int i=0; i<gridNums2[j].length; i++)
			{
				System.out.print(gridNums2[j][i] + " ");
			}
			System.out.println();
		}
		
		//4. For both of those arrays, change the element in the second row, third column into a 20. 
		//Prints out first 2D array
		for(int j=0; j<gridNums.length; j++)
		{
			for(int i=0; i<gridNums[j].length; i++)
			{
				System.out.print(gridNums[j][i] + " ");
			}
			System.out.println();
		}
		//Prints out second 2D array
		for(int j=0; j<gridNums2.length; j++)
		{
			for(int i=0; i<gridNums2[j].length; i++)
			{
				System.out.print(gridNums2[j][i] + " ");
			}
			System.out.println();
		}
		
		//Changes the first and second 2D array's second row and third column to 20
		gridNums[1][2] = 20;
		gridNums2[1][2] = 20;
		
		//Prints out first 2D array after changing element
		for(int j=0; j<gridNums.length; j++)
		{
			for(int i=0; i<gridNums[j].length; i++)
			{
				System.out.print(gridNums[j][i] + " ");
			}
			System.out.println();
		}
		//Prints out second 2D array after changing element
		for(int j=0; j<gridNums2.length; j++)
		{
			for(int i=0; i<gridNums2[j].length; i++)
			{
				System.out.print(gridNums2[j][i] + " ");
			}
			System.out.println();
		}
		
		//5. For both of those arrays, change the last element in the first row to a -5. Accomplish this using .length 
		//Prints out first 2D array
		for(int j=0; j<gridNums.length; j++)
		{
			for(int i=0; i<gridNums[j].length; i++)
			{
				System.out.print(gridNums[j][i] + " ");
			}
			System.out.println();
		}
		//Prints out second 2D array
		for(int j=0; j<gridNums2.length; j++)
		{
			for(int i=0; i<gridNums2[j].length; i++)
			{
				System.out.print(gridNums2[j][i] + " ");
			}
			System.out.println();
		}
		
		//Changes the first and second 2D array's last element of the first row as -5
		gridNums[0][gridNums[0].length-1]= -5;
		gridNums2[0][gridNums[0].length-1] = -5;
		
		//Prints out first 2D array after changing element
		for(int j=0; j<gridNums.length; j++)
		{
			for(int i=0; i<gridNums[j].length; i++)
			{
				System.out.print(gridNums[j][i] + " ");
			}
			System.out.println();
		}
		//Prints out second 2D array after changing element
		for(int j=0; j<gridNums2.length; j++)
		{
			for(int i=0; i<gridNums2[j].length; i++)
			{
				System.out.print(gridNums2[j][i] + " ");
			}
			System.out.println();
		}
		
		//6. For both of those arrays, change the first element in the last row to a -7. Accomplish this using .length 
		//Prints out first 2D array
		for(int j=0; j<gridNums.length; j++)
		{
			for(int i=0; i<gridNums[j].length; i++)
			{
				System.out.print(gridNums[j][i] + " ");
			}
			System.out.println();
		}
		//Prints out second 2D array
		for(int j=0; j<gridNums2.length; j++)
		{
			for(int i=0; i<gridNums2[j].length; i++)
			{
				System.out.print(gridNums2[j][i] + " ");
			}
			System.out.println();
		}
		
		//Changes the first and second 2D array's first element of the last row as -7
		gridNums[gridNums.length-1][0] = -7;
		gridNums2[gridNums.length-1][0] = -7;
		
		//Prints out first 2D array after changing element
		for(int j=0; j<gridNums.length; j++)
		{
			for(int i=0; i<gridNums[j].length; i++)
			{
				System.out.print(gridNums[j][i] + " ");
			}
			System.out.println();
		}
		//Prints out second 2D array after changing element
		for(int j=0; j<gridNums2.length; j++)
		{
			for(int i=0; i<gridNums2[j].length; i++)
			{
				System.out.print(gridNums2[j][i] + " ");
			}
			System.out.println();
		}
		
		//7. For both of those arrays, change the last element in the last row to a -30. Accomplish this using .length 
		//Prints out first 2D array
		for(int j=0; j<gridNums.length; j++)
		{
			for(int i=0; i<gridNums[j].length; i++)
			{
				System.out.print(gridNums[j][i] + " ");
			}
			System.out.println();
		}
		//Prints out second 2D array
		for(int j=0; j<gridNums2.length; j++)
		{
			for(int i=0; i<gridNums2[j].length; i++)
			{
				System.out.print(gridNums2[j][i] + " ");
			}
			System.out.println();
		}
		
		//Changes the first and second 2D array's last element of the last row as -30
		gridNums[gridNums.length-1][gridNums[0].length-1] = -30;
		gridNums2[gridNums.length-1][gridNums[0].length-1] = -30;
		
		//Prints out first 2D array after changing element
		for(int j=0; j<gridNums.length; j++)
		{
			for(int i=0; i<gridNums[j].length; i++)
			{
				System.out.print(gridNums[j][i] + " ");
			}
			System.out.println();
		}
		//Prints out second 2D array after changing element
		for(int j=0; j<gridNums2.length; j++)
		{
			for(int i=0; i<gridNums2[j].length; i++)
			{
				System.out.print(gridNums2[j][i] + " ");
			}
			System.out.println();
		}
		
		
	}
	

	//8. Create a method that is passed a 2-D array of ints and one by one prints out each element in the first row. 
	
	public static void firstRow(int nums[][])
	{
		//traverses the first row and prints out each element in the first row
		for(int i=0; i<nums[0].length; i++)
		{
			System.out.println(nums[0][i] + " ");
		}
	}

	//9. Create a method that is passed a 2-D array of ints and one by one prints out each element in the first column.
	
	public static void firstColumn(int nums[][])
	{
		//traverses the first column and prints out each element 
		for(int i=0; i<nums.length; i++)
		{
			System.out.println(nums[i][0] + " ");
		}
	}

	//10. Create a method that is passed a 2-D array of ints and one by one prints out each element in row-major order. 
	
	public static void rowMajor(int nums[][])
	{
		//traverses through the first array and each element and moves on to the next array in order and prints each element out
		for(int j=0; j<nums.length; j++)
		{
			for(int i=0; i<nums[j].length; i++)
			{
				System.out.print(nums[j][i] + " ");
			}
			System.out.println();
		}
	}

	//11. Create a method that is passed a 2-D array of ints and one by one prints out each element in column-major order. 
	
	public static void columnMajor(int nums[][])
	{
		//traverses through the first column and each element and moves on to the next column in order and prints each element out
		for(int j=0; j<nums[0].length; j++)
		{
			for(int i=0; i<nums.length; i++)
			{
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
