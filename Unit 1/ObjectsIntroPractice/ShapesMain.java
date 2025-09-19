public class ShapesMain {

	public static void main(String[] args) 
	{
		/*
		 * call constructor to generate a new Circle object w/ radius of __
		 */
		Circle myCirc1 = new Circle (1.9);
		Circle myCirc2 = new Circle (2.7);
		
		
		System.out.println(myCirc1);
		System.out.println(myCirc2);

		Circle myCirc3 = myCirc1;
		System.out.println(myCirc3);
		
		
		System.out.println(myCirc1.getRadius());
	
		myCirc1.setRadius(7.0);
		System.out.println(myCirc1.getRadius());
		System.out.println(myCirc1.getCircumf());
		System.out.println(myCirc1.getArea());
		System.out.println(Circle.getDegrees());
		Circle.stateShape();
	}

}
