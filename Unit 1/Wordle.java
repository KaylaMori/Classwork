//imports scanner
import java.util.Scanner;
		 
public class Wordle {
	
	//scaner input reader
	static Scanner inputReader = new Scanner(System.in);
	
	/**
	 * Main Method
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		gameStart();
		//generate a random word
		//check right letters (Blank, Yellow, Green)
		//each letter
		//5 tries
				
		//closes the scanner
		inputReader.close();	
				
	}
			
	/**
	 * This method starts the game by assigning the winning word
	 */
	private static void gameStart()
	{
		//assigns the random word
		String theWord = "words";
				
		//pass theWord to a method that lets player pick their door
		checkRight(theWord);
	}
			
	/**
	 * This method checks the correct placement of five characters in five tries 
	 * @param str
	 * @return
	 */
	 public static String checkRight(String str)
	 {
		 //counter starts at 1
		 int count = 1;
		 
		 //loop runs until count is 6 or more
		 while (count<6)
		 {
			 //What number try out of 5
			 System.out.println("This is try number " + count + " out of 5.");
			 //Asks player to guess 5 letter word
			 System.out.println("Guess the 5 letter word");
			 
			 //ask user for input and stores it as a String object
			 String playerChoice = inputReader.nextLine();
 		
		 	 //boolean returns invalid input if amount of characters player input is less or more than five
			 //boolean runs if the amount of characters is five
			 if (playerChoice.length() < 5 || playerChoice.length() > 5)
			 	{
				 	//returns Invalid Input
				 	System.out.print("Invalid Input");
			 	}	
			 else
			 {

				 //runs a loop until it goes through all five characters of the word
				 for (int i = 0; i < str.length(); i++) 
				 {

					 //boolean runs if the character matches the same index string character
					 if(playerChoice.charAt(i) == str.charAt(i))
					 {
						 //Character is green
						 System.out.println("The letter " + playerChoice.charAt(i) + " is Green.");
					 }
					 //locates the character of the string and works only if it is within the word
					 else if (str.indexOf(playerChoice.charAt(i))>-1)
					 {
						 //Character is Yellow
						 System.out.println("The letter " + playerChoice.charAt(i) + " is Yellow");  
					 }
			         //runs if both of the above booleans don't apply 
					 //and the player input character does not match the index string character   
					 else if (!(playerChoice.charAt(i) == str.charAt(i)))
					 {
						 //Character is Blank
						 System.out.println("The letter " + playerChoice.charAt(i) + " is Blank");    
					 }
		        
				 }
	       
			 }  
			 //Adds 1 to the counter after each while loop
			 count++;
		}
		//safety return
		return str;
		 	 
    }
	           
		    
}
		

