/*
 * Cube Class without main method
 */
public class Cube {

	//attributes
	private double length;

	/*
	 * When called, generates new Cube object with the specified length, l
	 */
	public Cube (double l)
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
	 * Changes the length of the Cube to a new length
	 */
	public void setLength(double newLength)
	{
		length = newLength;
	}
	
	public double getTotalSurfaceArea()
	{
		return (6 * (length * length));
	}
	
	public double getVolume()
	{
		return (length * length * length);
	}
	
	/*
	 * Returns the name of the shape
	 */
	public static String getName()
	{
		return ("Cube");
	}
	
	
	
}
