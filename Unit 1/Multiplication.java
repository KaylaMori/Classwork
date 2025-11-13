/**
*Main Method
*/
public class testing {


	/**
	*This method multiplies a & b
	*/
	public int multiply(int a, int b)
	{
		//starts count at 0
		int count =0;
		//starts sum at 0
		int sum = 0;

		//occurs only if count is lower than a's amount
		while(count<a)
		{
			//adds b's ampunt to the sum
			sum+=b;
			//Adds 1 to each count
			count++;
		}
		//returns the sum of a times b until "while" can;t occur anymore
		return sum;
	}
	
	
}
