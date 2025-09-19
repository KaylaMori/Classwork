/*
 * Circle class without main method
 */
public class Circle 
{
	/*
	 * Declares radius as double and pi as final double which is 3.14
	 */
	private double radius; 
	private final double pi = 3.14;

	/*
	 * Constructor gives radius 
	 */
	public Circle (double r)
	{
		radius = r;
	}
	
	/*
	 * Returns the radius 
	 */
	public double getRadius()
	{
		return radius;
	}
	
	/*
	 * Changes circle objects radius as a new Radius 
	 */
	public void setRadius(double newRadius)
	{
		radius = newRadius;
	}
	
	/*
	 * returns the equation to get the Circumference
	 */
	public double getCircumf()
	{
		return (2*pi*radius);
	}
	
	/*
	 * returns the equation to get the Area
	 */
	public double getArea()
	{
		return (pi*(radius*radius));
	}
	
	/*
	 * returns the degrees of a circle
	 */
	public static int getDegrees()
	{
		return 360;
	}
	
	/*
	 * States the shape 
	 */
	public static void stateShape()
	{
		System.out.println("This class generates circle shapes.");
	}
}
		
