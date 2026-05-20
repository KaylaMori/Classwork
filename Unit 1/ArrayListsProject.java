//import scanner
import java.util.ArrayList;

public class convertArrListProject {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//Create methods that are passed an ArrayList of Integers and accomplish the following tasks:
	
	//1. Return the smallest number in the ArrayList. 
	 
	 public static int findSmallest(ArrayList<Integer> nums) 
	 {
		 //sets the 'smallest' to the zeroeth index in the arrayList
		 int smallest = nums.get(0);
		 //for loop to traverse the array and find the smallest in the array list
	     for (int i = 0; i < nums.size(); i++) 
	     {
			 //compares the current index of the number in the array list to what is set as 'smallest' in that time
	    	 if (nums.get(i) < smallest) 
	    	 {
				 //if it is smaller, sets that as the new 'smallest'
	    		 smallest = nums.get(i);
	    	 }
	     }
		 //goes through everything in the array list and returns the 'smallest'
	     return smallest;
	 }

	//2. Return the index of the smallest number in the ArrayList. 
	 
	 public static int smallestIndex(ArrayList<Integer> nums) 
	 {
		 //sets the smallest index to zero
		 int smallestIndex = 0;
		 //for loop to traverse the length of the nums array and find the smallest index
		 for (int i = 0; i < nums.size(); i++) 
		 {
			 //compares the current index it is on at the time with what is set at the smallest index
			 if (nums.get(i) < nums.get(smallestIndex)) 
			 {
				 //sets whatever index it is at as smallest index if it is smaller than what it was at i
				 smallestIndex = i;
			 }
		 }
		 //returns the supposed smallest index
		 return smallestIndex;
	 }

	//3. Return the average of all numbers in the ArrayList. 
	 
	 public static double averageNum(ArrayList<Integer> nums) 
	 {
		 //sets the sum as 0
		 int sum = 0;
		 //for loop to traverse the nums array to get the sum
		 for (int i = 0; i < nums.size(); i++) 
		 {
			 //sets the sum as adding every number in the nums array
			 sum = sum + nums.get(i);
		 }
		 //gets the final sum by diving the total amount by how many numbers exist in the nums array
		 sum = sum/nums.size();
		 //returns the 'sum' which is the average of all numbers
		 return sum;
	 }

	//4. Return true if all numbers in the ArrayList are even, and return false otherwise.
	 
	 public static boolean evenNum(ArrayList<Integer> nums) 
	 {
		 //for loop to traverse the nums array 
		 for (int i = 0; i < nums.size(); i++) 
		 {
			 //returns true if the current index of the array is divisible by two with zero leftovers 
			 if (nums.get(i) % 2 == 0) 
			 {
				 return true;
			 }
		 }
		 //returns false if it is not true
		 return false;
	 }

	//5. If the ArrayList ever has two consecutive 5's, change them to 0's. 
	 //(For example, passing {4, 5, 5, 2, 1} changes the array to {4, 0, 0, 2, 1} ).
	 
	 public static void twoFives(ArrayList<Integer> nums) 
	 {
		 //for loop to traverse the nums array 
		 for (int i = 0; i < nums.size() - 1; i++) 
		 {
			 //finds if there is a 5 at the current index it's on and if there is also a 5 on the next index and if so...
			 if (nums.get(i) == 5 && nums.get(i + 1) == 5) 
			 {
				 //sets the current index that had the 5 and the next index, as 0
				 nums.set(i, 0);
				 nums.set(i + 1, 0);
			 }
		 }
	 }
	 
	//6. Return true if any number shows up three times in a row, and return false otherwise. 

	 public static boolean threeNums(ArrayList<Integer> nums) 
	 {
		 //for loop to traverse the nums array
		 for (int i = 0; i < nums.size() - 1; i++) 
		 {
			 //sees if the current index and the next index with the next index is all the same and if so... returns true
			 if (nums.get(i) == nums.get(i + 1) && nums.get(i) == nums.get(i + 2)) 
			 {
				 return true;
			 }
		 }
		 //returns false if not
		 return false;
	 }
	 
	//7. Pass an ArrayList of Integers and a value to be searched for. Return how many times that int shows up in the ArrayList. 
	 //(For example, passing ( {4, 5, 5, 2, 1} , 5) returns 2 because 5 shows up twice)
	 
	 public static int countNums(ArrayList<Integer> nums, int target) 
	 {
		 //count is set to 0
		 int count = 0;
		 //for loop to traverse the nums array
		 for (int i = 0; i < nums.size(); i++) 
		 {
			 //sees if the target number is what the current index is set at
			 if (nums.get(i) == target) 
			 {
				 //adds 1 to count if it is the target number
				 count++;
			 }
		 }
		 //returns the final count number
		 return count;
	 }
	 
	//8. Alter an ArrayList so that is the backwards version of the ArrayList initially passed 
	 //(for example, passing {4, 5, 5, 2, 1} changes the array to {1, 2, 5, 5, 4}) YOU MAY NOT DO THIS THE SAME AS THE PREVIOUS PROJECT
	 
	 public static void reverseNum(ArrayList<Integer> nums) 
	 {
		 //sets left as zero
		 int left = 0;
		 //sets right as the final number in the nums array
		 int right = nums.size() - 1;
		 //while loop for only when the left number is less than the right
		 while (left < right) 
		 {
			 //this whole code switches the first and last number and slowly works it's way to the middle by one
			 int temp = nums.get(left);
			 nums.set(left, nums.get(right));
			 nums.set(right, temp);
			 left++;
			 right--;
		 }
	 }
	 
	//9. Shift all elements in an ArrayList to the right. 
	 //(For example, passing {4, 5, 5, 2, 1} changes the array to {1, 4, 5, 5, 2}) YOU MAY NOT USE A LOOP

	 public static void shiftRight(ArrayList<Integer> nums) 
	 {
		 //sets the last as the last number in the nums array
		 int last = nums.get(nums.size() - 1);
		 //removes whatever was thelast number
		 nums.remove(nums.size() - 1);
		 //adds the last number to the very front in which everything else is shifted over now
		 nums.add(0, last);
	 }
	 
	//10. Use either selection sort or insertion sort to sort an ArrayList. 
	 //(For example, passing {4, 5, 5, 2, 1} changes the array to {1, 2, 4, 5, 5})

	 public static void selectionSort(ArrayList<Integer> nums) 
	 {
		 //for loop to traverse the nums array
		 for (int j = 0; j < nums.size() - 1; j++) 
		 {
			 //sets the min as whatever number it is traversing at that moment
			 int min = nums.get(j);
			 //sets the min location as the index
			 int minLoc = j;
			 //for loop to traverse the nums array
			 for (int i = j; i <  nums.size(); i++) 
			 {
				 //sees if the current min it's at is greater than whatever is being traversed in the second nums array
				 if (min>nums.get(i)) 
				 {
					 //if so, sets the new min
					 min = nums.get(i);
					 //and the new min location is that index
					 minLoc = i;
				 }
			 }
			 //this whole code switches around that current index number with the location of the minimum number to sort the array
			 int temp = nums.get(minLoc);
			 nums.set(minLoc, nums.get(j));
			 nums.set(j, temp);
		 }
	 }

}
