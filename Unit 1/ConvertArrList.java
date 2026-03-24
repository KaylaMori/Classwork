import java.util.ArrayList;

public class convertArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	}
	
	//1. Create a method checkFor4() that is passed an ArrayList and returns the index of the first 4 if that array has a 4 and -1 if that array has no 4's. 
	
			//Instantiates an empty ArrayList that specifically stores Integers
			ArrayList <Integer> nums = new ArrayList <Integer>();
			/**
			 * returns index of the first four found but returns -1 if there is no 4 in the array list
			 * @param nums
			 * @return
			 */
			public static int checkFor4(ArrayList <Integer> nums)
			{
				//sets indexFour as 0
				int indexFour = 0;
				//traverses the array list
				for (int i=0; i<nums.size()-1;i++)
				{
					//finds if there is a 4 in the array list
					if(nums.get(i)==4)
					{
						//sets the index as where the place of 4 is 
						indexFour = i;
						//returns the index
						return indexFour;
					}
				}
				//returns -1 if nothing else happens
				return -1;
			}
			
	
		//2. Create a method ridAllFives() that is passed an ArrayList nums and altars that ArrayList without returning anything. The ArrayList will have any 5’s deleted from nums.
		//Ex: 
		//subtract5FromAll4( {5, 5, 0, 8, 5, 20}  )   -------turns nums into----->     {0, 8, 20}
			
			/**
			 * gets rid of all fives in the array list
			 * @param nums
			 */
			public static void ridAllFives(ArrayList <Integer> nums)
			{
				//traverses the array
				for (int i=0; i<nums.size()-1;i++)
				{
					//finds where five is in the array list
					if(nums.get(i)==5)
					{
						//removes the five
						nums.remove(i);
						//if there is a five, it'll reset the i back to where it originally was after the first five is removed
						i--;
					}
				}
			}
				
		//3. Create a method bubbleSort() that is passed an ArrayList and sorts it using bubblesort.
			/**
			 * sorts the array list with bubble sort
			 * @param nums
			 */
			public static void bubbleSort(ArrayList <Integer> nums)
			{
				//traverses the array
				for (int j = 0; j < nums.size() - 1; j++) 
		        {
		        	//Compares until sorted
		            for (int i = 0; i < nums.size() - 1; i++) 
		            {
		            	//Swaps the numbers if next number is smaller
		                if (nums.get(i) > nums.get(i+1)) 
		                {
		                    int first = nums.get(i);
		                    nums.set(i, nums.get(i+1));
		                    nums.set(i+1, first);
		                }
		            }
		        }
			}
}
