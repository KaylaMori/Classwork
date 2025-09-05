/**
 * This uses nonvoid methods to get info about myself, circle stats, and results of two numbers.
 */

public class NonVoidMethodPractice {

	/**
	 * This is the main nonvoid method where all the statements are called
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//prints 3 statements of my name, hair style, and favorite food
	System.out.println(giveName());
	System.out.println(giveHairStyle());
	System.out.println(giveFavoriteFood());
	
	//prints the circumference, diamter, and area when any radius input below (_)
	System.out.println(getCircleStats(9));	
	
	//prints the statement of sum, difference, prdoduct, quotient, remainder of modulus when any two numbers input below in the (_,_)
	System.out.println("The sum of both numbers is " + getTwoIntSum (9,1) + " and the difference is " + getTwoIntDifference (9,1) + 
			" and the product is " + getTwoIntProduct (9,1) + " and the quotient is " + getTwoIntQuotient (9,1) + " and the remainder of the modulus is " + getTwoIntModRemain (9,1) + ".");
		
	}
	
	/**
	 * Returns the statement of my name.
	 * @return
	 */
	public static String giveName()
	{
	return "My name is Kayla.";
	}
	
	
	/**
	 * Returns the statement of my eye color
	 * @return
	 */
	public static String giveEyeColor()
	{
	return "My eye color is Brown.";
	}
	
	
	/**
	 * Returns the statement of my Hair Style
	 * @return
	 */
	public static String giveHairStyle()
	{
	return "I usually have my hair style down";
	}

	
	/**
	 * Returns the statement of my best friends
	 * @return
	 */
	public static String giveBestFriend()
	{
	return "My best friends are Olivia & Evie.";
	}
	
	
	/**
	 * Returns the statement of my favorite food
	 * @return
	 */
	public static String giveFavoriteFood()
	{
	return "My favorite food is chicken.";
	}
	
	
	
	/**
	 * Declares radius as double; calculating diameter, circumference, and area 
	 * Returns its statement of answers
	 * @param radius
	 * @return
	 */
	public static String getCircleStats(double radius)
	{
	double pi = 3.14;
	double diameter = 2 * radius;
	double circumference = 2 * pi * radius;
	double area = pi * (radius * radius);
		return "The radius of the circle is " + radius + " and the diameter is " + diameter + 
				" and the circumference is " + circumference + " and the area is " + area + ".";
	}
	
	
	/**
	 * Declares Two Variables as Ints
	 * Returns the sum of two variables
	 * @param variable1
	 * @param variable2
	 * @return
	 */
	
	public static int getTwoIntSum(int variable1, int variable2)
	{
		return variable1 + variable2;
	}
	
	/**
	 * Declares Two Variables as Ints
	 * Returns the difference of two variables
	 * @param variable1
	 * @param variable2
	 * @return
	 */
	public static int getTwoIntDifference(int variable1, int variable2)
	{
		return variable1 - variable2;
	}
	
	/**
	 * Declares Two Variables as Ints
	 * Returns the product of two variables
	 * @param variable1
	 * @param variable2
	 * @return
	 */
	public static int getTwoIntProduct(int variable1, int variable2)
	{
		return variable1 * variable2;
	}
	
	/**
	 * Declares Two Variables as Ints
	 * Returns the quotient of two variables
	 * @param variable1
	 * @param variable2
	 * @return
	 */
	public static int getTwoIntQuotient(int variable1, int variable2)
	{
		return variable1 / variable2;
	}
	
	/**
	 * Declares Two Variables as Ints
	 * Returns the Modulus Remainder of two variables
	 * @param variable1
	 * @param variable2
	 * @return
	 */
	public static int getTwoIntModRemain(int variable1, int variable2)
	{
		return variable1 % variable2;
	}
	
}
