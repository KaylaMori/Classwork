import java.util.ArrayList;

public class convertArrListProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//Create methods that are passed an ArrayList of Integers and accomplish the following tasks:

	//1. Return the smallest number in the ArrayList. 
	 
	 public static int findSmallest(ArrayList<Integer> nums) 
	 {
		 int smallest = nums.get(0);
	     for (int i = 0; i < nums.size(); i++) 
	     {
	    	 if (nums.get(i) < smallest) 
	    	 {
	    		 smallest = nums.get(i);
	    	 }
	     }
	     return smallest;
	 }

	//2. Return the index of the smallest number in the ArrayList. 
	 
	 public static int smallestIndex(ArrayList<Integer> nums) 
	 {
		 int smallestIndex = 0;
		 for (int i = 0; i < nums.size(); i++) 
		 {
			 if (nums.get(i) < nums.get(smallestIndex)) 
			 {
				 smallestIndex = i;
			 }
		 }
		 return smallestIndex;
	 }

	//3. Return the average of all numbers in the ArrayList. 
	 
	 public static double averageNum(ArrayList<Integer> nums) 
	 {
		 int sum = 0;
		 for (int i = 0; i < nums.size(); i++) 
		 {
			 sum = sum + nums.get(i);
		 }
		 sum = sum/nums.size();
		 return sum;
	 }

	//4. Return true if all numbers in the ArrayList are even, and return false otherwise.
	 
	 public static boolean evenNum(ArrayList<Integer> nums) 
	 {
		 for (int i = 0; i < nums.size(); i++) 
		 {
			 if (nums.get(i) % 2 == 0) 
			 {
				 return true;
			 }
		 }
		 return false;
	 }

	//5. If the ArrayList ever has two consecutive 5's, change them to 0's. 
	 //(For example, passing {4, 5, 5, 2, 1} changes the array to {4, 0, 0, 2, 1} ).
	 
	 public static void twoFives(ArrayList<Integer> nums) 
	 {
		 for (int i = 0; i < nums.size() - 1; i++) 
		 {
			 if (nums.get(i) == 5 && nums.get(i + 1) == 5) 
			 {
				 nums.set(i, 0);
				 nums.set(i + 1, 0);
			 }
		 }
	 }
	 
	//6. Return true if any number shows up three times in a row, and return false otherwise. 

	 public static boolean threeNums(ArrayList<Integer> nums) 
	 {
		 for (int i = 0; i < nums.size() - 1; i++) 
		 {
			 if (nums.get(i) == nums.get(i + 1) && nums.get(i) == nums.get(i + 2)) 
			 {
				 return true;
			 }
		 }
		 return false;
	 }
	 
	//7. Pass an ArrayList of Integers and a value to be searched for. Return how many times that int shows up in the ArrayList. 
	 //(For example, passing ( {4, 5, 5, 2, 1} , 5) returns 2 because 5 shows up twice)
	 
	 public static int countNums(ArrayList<Integer> nums, int target) 
	 {
		 int count = 0;
		 for (int i = 0; i < nums.size(); i++) 
		 {
			 if (nums.get(i) == target) 
			 {
				 count++;
			 }
		 }
		 return count;
	 }
	 
	//8. Alter an ArrayList so that is the backwards version of the ArrayList initially passed 
	 //(for example, passing {4, 5, 5, 2, 1} changes the array to {1, 2, 5, 5, 4}) YOU MAY NOT DO THIS THE SAME AS THE PREVIOUS PROJECT
	 
	 public static void reverseNum(ArrayList<Integer> nums) 
	 {
		 int left = 0;
		 int right = nums.size() - 1;
		 while (left < right) 
		 {
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
		 int last = nums.get(nums.size() - 1);
		 nums.remove(nums.size() - 1);
		 nums.add(0, last);
	 }
	 
	//10. Use either selection sort or insertion sort to sort an ArrayList. 
	 //(For example, passing {4, 5, 5, 2, 1} changes the array to {1, 2, 4, 5, 5})

	 public static void selectionSort(ArrayList<Integer> nums) 
	 {
		 for (int j = 0; j < nums.size() - 1; j++) 
		 {
			 int min = nums.get(j);
			 int minLoc = j;
			 for (int i = j; i <  nums.size(); i++) 
			 {
				 if (min>nums.get(i)) 
				 {
					 min = nums.get(i);
					 minLoc = i;
				 }
			 }
			 int temp = nums.get(minLoc);
			 nums.set(minLoc, nums.get(j));
			 nums.set(j, temp);
		 }
	 }

}
