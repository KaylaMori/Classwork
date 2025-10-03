/*
 * Rectangle Class without main Method
 */
public class Rectangle {

	//attributes
	private double length;
	private final double width = 1.27;
	
	/*
	 * When called, generates new Rectangle object with the specified length, l
	 */
	public Rectangle (double l)
	{
		length = l;
	}
	
	/*
	 * Returns the length
	 */
	public double getLength()
	{
		return length;
	}
	
	/*
	 * Changes the length of the Rectangle to a new length
	 */
	public void setLength(double newLength)
	{
		length = newLength;
	}
	
	/*
	 * Returns the equation to get the Area
	 */
	public double getArea()
	{
		return (length * width);
	}
	
	/*
	 * Returns the equation to get the Perimeter
	 */
	public double getPerimeter()
	{
		return (length + length + width + width);
	}
	
	/*
	 * Returns the name of the shape
	 */
	public static String getName()
	{
		return ("Rectangle");
	}
	
}
