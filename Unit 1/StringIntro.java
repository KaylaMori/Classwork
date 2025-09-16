/**
 * I imported a scanner
 */
import java.util.Scanner;

/**
 * This is the String Intro Assignment
 */
public class stringIntro {

/**
 * This is where the scanner is and closes at the end
 * The methods are also all called back in this space
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Scanner
	Scanner myReader = new Scanner(System.in);
		
	String myWord = new String (myReader.nextLine());

	//Call four methods
	printSecondAndLastLetter(myWord);
	System.out.println(findTheE(myWord));
	System.out.println(getLength(myWord));
	printFirstAndLastThree(myWord);
	
	//Close Scanner
myReader.close();


	}
	
	/**
	 * This method is used to find the second and last letter of a given word using charAt
	 * Then it returns the two letters
	 * @param str
	 */
	public static void printSecondAndLastLetter(String str)
	{
		System.out.println("" + str.charAt(1) +  str.charAt(str.length()-1));
		
	}

	/**
	 * This method finds the first e of the word using indexOf and returns the location of the e
	 * @param myWord
	 * @return
	 */
	public static String findTheE(String myWord)
	{
		int eLocation = myWord.indexOf('e');
		return ("The first e is " + eLocation);
	}
	
	/**
	 * This method finds the length of the word using length() and returns the number of letters in a word
	 * @param myWord
	 * @return
	 */
	public static String getLength(String myWord)
	{
		return ("The length is " + myWord.length());
	}
	
	/**
	 * This method finds the first three and last three letters of a word using a substring and returns the six letters
	 * @param myWord
	 */
	public static void printFirstAndLastThree (String myWord)
	{
		
		String firstThree = new String (myWord.substring(0,3));
		String lastThree = new String (myWord.substring(myWord.length()-3));
		System.out.println(firstThree + lastThree);
		
	}

}
