public class methodsWork {

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
	 * This prints my name: "Kayla" and goes to the next line.
	 */
	public static void stateName()
	{
		System.out.println("Kayla");
	}
	
	
	/**
	 * This prints my eye color: "Brown" and goes to the next line.
	 */
	public static void stateEyeColor()
	{
		System.out.println("Brown");
	}
	
	
	/**
	 * This prints my hair style: "Down" and goes to the next line.
	 */
	public static void stateHairStyle()
	{
		System.out.println("Down");
	}
	
	
	/**
	 * This prints my best friends: "Olivia & Evie" and goes to the next line
	 */
	public static void stateBestFriend()
	{
		System.out.println("Olivia & Evie");	
	}
	
	
	/**
	 * This prints my favorite food: "Chicken" and goes to the next line
	 */
	public static void stateFavoriteFood()
	{
		System.out.println("Chicken");
	}
	
	/**
	 * This method can print the diameter, circumference, and area of a circle by inputting any radius as a double and goes to the next line.
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
 * This method can find the sum, difference, product, quotient, and modulus of two numbers declared as: int variable1 & int variable2
 * in which any number can be input and prints the answers out and goes to the next line.
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
