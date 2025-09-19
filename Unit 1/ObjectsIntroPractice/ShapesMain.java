/*
 * Shapes main class 
 */
public class ShapesMain {

	public static void main(String[] args) 
	{
		/*
		 * call constructor to generate a new Circle object w/ radius of
		 */
		Circle myCirc1 = new Circle (1.9);
		Circle myCirc2 = new Circle (2.7);
		
		/*
		 * Trys to print out Circles, but given reference code
		 */
		System.out.println(myCirc1);
		System.out.println(myCirc2);

		Circle myCirc3 = myCirc1;
		System.out.println(myCirc3);
		
		/*
		 * Prints out original radius of Circle 1
		 */
		System.out.println(myCirc1.getRadius());
		
		/*
		 * Prints out new Radius that circle 1 is set to 
		 */
		myCirc1.setRadius(7.0);
		System.out.println(myCirc1.getRadius());
		
		/*
		 * Prints out circumference, area, degrees, and what shape is 
		 */
		System.out.println(myCirc1.getCircumf());
		System.out.println(myCirc1.getArea());
		System.out.println(Circle.getDegrees());
		Circle.stateShape();
	}

}
