/**
* This code calculates the surface area and volume of a cube.
*/
public class CubeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//Declares sideLength as double and the number it's measured at.
//sideLength calculates surfaceArea & volume when plugged into the equations.

		
double sideLength = 9.0;

//Declares surfaceArea as double.
//The equation used to find surfaceArea derived from formula: A=6a^2; a = sideLength.


double surfaceArea = 6.0 * (sideLength * sideLength);

//Declares volume as double. 
//The equation used to find volume derived from formula: V=s^3; s = sideLength


double volume = sideLength * sideLength * sideLength;

//Prints the sentence of what surfaceArea & volume of cube is as ints.


System.out.print("The surface area of the cube is " + (int) surfaceArea + " and the volume is " + (int) volume);

		
	}

}
