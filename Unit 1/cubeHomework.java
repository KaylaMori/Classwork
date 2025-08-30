public class cubeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
/**
* This code calculates the surface area and volume of a cube.
*/

/*
Line 17 declares the sideLength as a double and the number of which it is measured at.
The sideLength is used to calculate the surfaceArea and volume when plugged into
the codes (equations) to find the measurements of each aspect of the cube.
*/
		
double sideLength = 9;

/* 
Line 24 declares the surfaceArea as a double and the equation used to find the measurement.
The equation being 6*(sideLength*sideLength) which is the formula: A=6a^2 in which a = sideLength.
*/

double surfaceArea = 6 * (sideLength * sideLength);

/* 
Line 31 declares the volume as a double and the equation used to find its measurement. 
The equation being "sideLength*sideLength*sideLength" which is the formula: V=s^3 in which s = sideLength
*/

double volume = sideLength * sideLength * sideLength;

/* 
Line 37 prints the sentence of what the surfaceArea and volume of the cube is from lines 24 & 31 as ints.
*/

System.out.print("The surface area of the cube is " + (int) surfaceArea + " and the volume is " + (int) volume);

		
	}

}
