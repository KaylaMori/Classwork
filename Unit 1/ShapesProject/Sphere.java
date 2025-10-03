/*
 * Sphere class without main method
 */
public class Sphere {
	
	//attributes
	private double radius; 
	private final double pi = 3.14;
	
	/*
	 * When called, generates new Sphere object with the specified radius, r
	 */
	public Sphere (double r)
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
	 * Changes the radius of the Sphere to a new radius
	 */
	public void setRadius(double newRadius)
	{
		radius = newRadius;
	}
	
	/*
	 * Returns the equation to get the Diameter
	 */
	public double getDiameter()
	{
		return (2*radius);
	}
	
	/*
	 * Returns the equation to get the Surface Area
	 */
	public double getSurfaceArea()
	{
		return (4*pi*(radius*radius));
	}
	
	/*
	 * Returns the degress of a sphere
	 */
	public static int getDegrees()
	{
		return 360;
	}
}
