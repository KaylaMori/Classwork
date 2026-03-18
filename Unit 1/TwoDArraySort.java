public class arraySort {
    
	 public static void main(String[] args) {
		// TODO Auto-generated method stub

	 }
	/**
	 * Sorts 2D array from left right and top bottom by turning into 1D first
	 * @param array
	 */
    public static void sortArray(double[][] array) 
    {
        //Figures out amount of rows and columns
        int rows = array.length;
        int cols = array[0].length;
        //Figures out all amount
        int allNumber = rows * cols;
        //Makes a copy of the array with all amounts (1D array)
        double[] copyArray = new double[allNumber];
        //Keeps counter of position
        int count = 0;
        
        //Loops through rows
        for (int r = 0; r < rows; r++)
        {
        	//Loops through columns
            for (int c = 0; c < cols; c++) 
            {
            	//Turns 1D Array into one array with all elements from original copied into new one
            	//stores the new numbers into a flat array
                copyArray[count] = array[r][c];
                //Goes one by one through 1D array to acquire numbers from previous array
                count++;
            }
        }
        
        //Sorts array with bubble sort
        //Go through array until fully sorted
        for (int j = 0; j < copyArray.length - 1; j++) 
        {
        	//Compares until sorted
            for (int i = 0; i < copyArray.length - 1; i++) 
            {
            	//Swaps the numbers if next number is smaller
                if (copyArray[i] > copyArray[i + 1]) 
                {
                    double first = copyArray[i];
                    copyArray[i] = copyArray[i + 1];
                    copyArray[i + 1] = first;
                }
            }
        }
        
        //Goes back to the original 2D format
        count = 0;
        //Goes through rows
        for (int r = 0; r < rows; r++) 
        {
        	//Goes through columns
            for (int c = 0; c < cols; c++) 
            {
            	//reverses the copied array numbers into rows and columns into what it originally was
                array[r][c] = copyArray[count];
                //Reversed use
                count++;
            }
        }
    }
   
}
