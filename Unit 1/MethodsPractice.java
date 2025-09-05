/**
*This is the work of the Methods Intro Practice
*/

public class MethodsWork {

/** 
 * This is the main string method that makes everything work the way it works by calling them 	
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stateName();
		stateHairStyle();
		stateFavoriteFood();
		printCircleStats(7);
		printMathStuffs(1,9);
		
	}
	
	
	/**
	 * Prints my name: "Kayla" and goes to next line
	 */
	public static void stateName()
	{
		System.out.println("Kayla");
	}
	
	
	/**
	 * Prints my eye color: "Brown" and goes to next line.
	 */
	public static void stateEyeColor()
	{
		System.out.println("Brown");
	}
	
	
	/**
	 * Prints my hair style: "Down" and goes to next line.
	 */
	public static void stateHairStyle()
	{
		System.out.println("Down");
	}
	
	
	/**
	 * Prints my best friends: "Olivia & Evie" and goes to next line
	 */
	public static void stateBestFriend()
	{
		System.out.println("Olivia & Evie");	
	}
	
	
	/**
	 * Prints my favorite food: "Chicken" and goes to next line
	 */
	public static void stateFavoriteFood()
	{
		System.out.println("Chicken");
	}
	
	/**
	 * Declares radius as double. Calculates and prints radius, diameter, circumference, and area of a circle and goes to next line.
	 * @param radius
	 */
	public static void printCircleStats (double radius)
	{
		final double pi = 3.14;
		double diameter = 2 * radius;
		double circumference = 2 * pi * radius;
		double area = pi * (radius * radius);
		
		System.out.println("The radius of the circle is " + radius + " and the diameter is " + diameter + 
				" and the circumference is " + circumference + " and the area is " + area + ".");
	}
	
/**
 * Finds sum, difference, product, quotient, and modulus of two numbers declared as: int variable1 & int variable2
 * Prints the answers out and goes to the next line.
 * @param one
 * @param two
 */
	public static void printMathStuffs(int variable1, int variable2)
	{
		int sum = variable1 + variable2;
		int difference = variable1 - variable2;
		int product = variable1 * variable2;
		int quotient = variable1 / variable2;
		int modulus = variable1 % variable2;
		
		System.out.println("The sum is " + sum + " and the difference is " + difference + " and the product is "
				+ product + " and the quotient is " + quotient + " and the modulus is " + modulus + ".");	
	}

	
	
}
