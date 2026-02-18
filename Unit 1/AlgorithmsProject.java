public class AlgorithmProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//1. Return the smallest number in the array. 
	
	 public static int findSmallest(int[] nums) 
	 {
     //sets smallest number
		 int smallest = nums[0];
     //for loop to traverse the array
		 for (int i = 0; i < nums.length - 1; i++) 
		 {
       //traverses array and sees if any other number is smaller
			 if (nums[i] < smallest) 
			 {
				 smallest = nums[i];
			 }
		 }
     //returns smallest number
		 return smallest;
	 }
	
	//2. Return the index of the smallest number in the array. 
	 
	 public static int smallestIndex(int[] nums) 
	 {
     //sets smallest index
		 int smallestIndex = 0;
     //for loop to traverse the array
		 for (int i = 0; i < nums.length - 1; i++) 
		 {
       //traverses array and sees if any number is smaller than current index
			 if (nums[i] < nums[smallestIndex]) 
			 {
				 smallestIndex = i;
			 }
		 }
     //returns smallest index
		 return smallestIndex;
	 }
	
	//3. Return the average of all numbers in the array. 
	
	 public static double averageNum(int[] nums) 
	 {
     //sets the sum
		 int sum = 0;
     //traverses array
		 for (int i = 0; i < nums.length - 1; i++) 
		 {
       //adds all numbers together
			 sum = nums[i] + sum;
		 }
     //divides sum into half
		 sum = sum/nums.length;
     //returns sum
		 return sum;
	 }
	 
	//4. Return true if all numbers in the array are even, and return false otherwise.
	 
	 public static boolean evenNum(int[] nums) 
	 {
     //traverses array
		 for (int i = 0; i < nums.length - 1; i++) 
		 {
       //moduleses the number by 2 to see if there will be any remainder
       //No remainder means it's even
			 if (nums[i] % 2 == 0) 
			 {
				 return true;
			 }
		 }
		 return false;
	 }
	
	//5. If the array ever has two consecutive 5's, change them to 0's. 
	//(For example, passing {4, 5, 5, 2, 1} changes the array to {4, 0, 0, 2, 1} ).
	
	 public static void twoFives(int[] nums) 
	 {
     //traverses array
		 for (int i = 0; i < nums.length - 1; i++) 
		 {
       //checks if current number and next number is both 5
       //if so, sets both numbers to 0
			 if (nums[i] == 5 && nums[i + 1] == 5) 
			 {
				 nums[i] = 0;
				 nums[i + 1] = 0;
			 }
		 }
	 }
	 
	//6. Return true if any number shows up three times in a row, and return false otherwise. 
	
	 public static boolean threeNums(int[] nums) 
	 {
     //traverses array
		 for (int i = 0; i < nums.length - 1; i++) 
		 {
       //sees if current number and next and next next number is all the same
       //if so, then returns true
			 if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) 
			 {
				 return true;
			 }
		 }
		 return false;
	 }
	 
	//7. Pass an array of ints and an int to be searched for. Return how many times that int shows up in the array. 
	//(For example, passing ( {4, 5, 5, 2, 1} , 5) returns 2 because 5 shows up twice).
	
	 public static int countNums(int[] nums, int target) 
	 {
     //sets a count
		 int count = 0;
     //traverses array
		 for (int i = 0; i < nums.length - 1; i++) 
		 {
       //sees if current number is the same as traget number
       //if so, adds 1 to the count
			 if (nums[i] == target) 
			 {
				 count++;
			 }
		 }
		 return count;
	 }
	 
	//8. Alter an array so that is the backwards version of the array initially passed 
	//(for example, passing {4, 5, 5, 2, 1} changes the array to {1, 2, 5, 5, 4}).
	
	 public static void reverseNum(int[] nums) 
	 {
     //traverses only half the array
		 for (int i = 0; i < nums.length / 2; i++) 
		 {
       //swaps the first number with last, second number to second last, and so on
			 int temp = nums[i];
			 nums[i] = nums[(nums.length - 1) - i];
			 nums[(nums.length - 1) - i] = temp;
		 }
	 }
	 
	//9. Shift all elements in an array to the right. (For example, passing {4, 5, 5, 2, 1} changes the array to {1, 4, 5, 5, 2}).
	
	 public static void shiftRight(int[] nums) 
	 {
     //traverses array
		 for (int i = nums.length-1; i < 0; i--) 
		    {
          //swaps the last with the next number and so on
			  	int last = nums [nums.length-1];
			    nums[nums.length-1] = nums[i - 1];
			 	  nums[i - 1] = last;
		    }
	 }
	 
	//10. Use either selection sort or insertion sort to sort an array. 
	//(For example, passing {4, 5, 5, 2, 1} changes the array to {1, 2, 4, 5, 5}).

	 public static void selectionSort(int[] nums) 
	 {
     //traverses array
		 for (int j =0; j < nums.length - 1; j++) 
		 {
       //sets the minimum number
			 int min = nums[j];
       //the minimum location
			 int minLoc = j;
       //traverses array
			 for (int i = j; i <= nums.length - 1; i++) 
			 {
         //sees if current number is less than minimum
         //if so, sets new minimum and minimumm location
				 if(min>nums[i])
				 {
					 min = nums [i];
					 minLoc = i;
				 }	
         //swaps the past minimum with the new minimum
				 int temp = nums[minLoc];
				 nums[minLoc] = nums[j];
				 nums[j] = temp;
			 }
				
		 }
	 }

}
