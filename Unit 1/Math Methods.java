public class mathMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/**
	 * Declares the numbers as a positive int, negative int, positive double, and negative double
	 */
	int posInt = 9;
	int negInt = -9;
	double posDouble = 7.0;
	double negDouble = -7.0;
	
	/**
	 * Prints out absolute values of the 4 numbers using Math.abs () method and goes to next line
	 */
	//It is overloaded because Math.abs () is used with the same numbers as different implementations (ints and double)
	System.out.println(Math.abs(posInt) + ", " + Math.abs(negInt) + ", " + Math.abs(posDouble) + ", " + Math.abs(negDouble));
		
	/**
	 * Prints out the positive int to the power of the negative int & negative int to the power of the positive Int
	 * Using the Math.pow () method and goes to the next line.
	 */
	//It is not overloaded because it stays as ints and have the same implementations
	System.out.println(Math.pow(posInt, negInt) + ", " + Math.pow(negInt, posInt));
	
	/**
	 * Prints out the square root of the inserted numbers using the Math.sqrt () method and goes to the next line.
	 */
	//I didn't expect the negative numbers to work since in math it usually turns into an imaginary number (i).
	//But I guess it worked since it printed out NaN because it can be calculated but not given a definite answer.
	System.out.println(Math.sqrt(posInt) + ", " + Math.sqrt(negInt) + ", " + Math.sqrt(posDouble) + "," + Math.sqrt(negDouble));
	
	/**
	 * Prints out a random number using the Math.random () method from 11 -> 20 
	 * using the formula from the method, declaring it as an int
	 */
	//range*Math.random()+min
	double randomNumber = ((int)10*Math.random())+11;
	System.out.print((int)randomNumber);
	
	
	}

}
