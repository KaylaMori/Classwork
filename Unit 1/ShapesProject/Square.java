/*
 * Square Class without main method
 */
public class Square {

	//attributes
	private double length;

	/*
	 * When called, generates new Square object with the specified length, l
	 */
	public Square (double l)
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
	 * Changes the length of the Square to a new length
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
		return (length * length);
	}
	
	/*
	 * Returns the equation to get the Perimeter
	 */
	public double getPerimeter()
	{
		return (length + length + length + length);
	}
	
	/*
	 * Returns the Name of the Shape
	 */
	public static String getName()
	{
		return ("Square");
	}
	
	
}
