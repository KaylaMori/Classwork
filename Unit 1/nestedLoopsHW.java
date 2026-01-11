public class testing {

	public static void main(String[] args) {


		buildMultTable(5);


	}
	
	  /**
	   * Method for multiplication table
	   * @param num
	   */
	  public static void buildMultTable(int num)
	  {	
		    //row loops until row num equals num
		    for (int row = 1; row <= num; row++) 
		    {		
			      //column loop print out each column num times row num until equal num 
	          for (int column = 1; column <= num; column++) 
	          {
	        	    System.out.print(row * column + "/t");
	          }
            //returns after each row is finished
	          System.out.println();
	      }
    }
}
