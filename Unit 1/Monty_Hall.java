//import scanner
import java.util.Scanner;

/**
 * Main method
 */
public class Monty_Hall {
	
	//scanner input reader
	static Scanner inputReader = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

		//inputReader.nextLine();


		//randomly assign one out of three doors
		
		//starts game
		gameStart();
	

	
	//person chooses one
		
		
	//Take one door away
		
	
	//Keep or Switch?
		
		
		//closes scanner
		inputReader.close();
		
			}
	
	/** 
	 * This method starts the game by generating a win door  
	 */
	private static void gameStart()
	{
		//range*Math.random()+min
		int winDoor = (int)(3*Math.random()+1);
		//scanner
		System.out.print("Winning door is " + winDoor);
		
		//pass winDoor to a method that lets player pick their door
		chooseDoor(winDoor);
	}

	/**
	 * This method asks the player choose door 1, 2, or 3
	 * @param winDoor
	 */
	public static void chooseDoor(int winDoor)
	{
		
		//prompt user to pick their door
		System.out.print("Hello player! Choose a door! (Select 1, 2 , or 3)");
		//scanner
		int playerChoice = inputReader.nextInt();
		
		//passes winDoor and playerChoice to a method to reveal one door
		revealDoor(winDoor, playerChoice);
		
	}
	
	/**
	 * This method asks player to keep or switch and reveals the winning door
	 * @param winDoor
	 * @param playerChoice
	 */
	public static void revealDoor(int winDoor, int playerChoice)
	{
		//if statement for 1 & 1
		if(winDoor == 1 && playerChoice == 1)
		{
			//system.out.print
			System.out.print("It has been revealed that door " + (2*Math.random()+2) + " is not the winning door. Choose 1 to keep & 2 to switch.") ;
			
			//scanner
			int keepswitchChoice = inputReader.nextInt();
			
			//nested if statement for win or lose
			if (keepswitchChoice == 2)
			{
				System.out.print("You win"); 
			}
			
			else 
			{
				System.out.print("You Lose");
			}
		}
		
		//if statement for 1 & 2
		if(winDoor == 1 && playerChoice == 2)
		{
			System.out.print("It has been revealed that door 3 is not the winning door. Choose 1 to keep & 2 to switch.");
			//scanner
			int keepswitchChoice = inputReader.nextInt();
			
			//nested if statement for win or lose
			if (keepswitchChoice == 2)
			{
				System.out.print("You win"); 
			}
			
			else 
			{
				System.out.print("You Lose");
			}
		}
		
		//if statement for 1 & 3
		if(winDoor == 1 && playerChoice == 3)
		{
			System.out.print ("It has been revealed that door 2 is not the winning door. Choose 1 to keep & 2 to switch.") ;
			//scanner
			int keepswitchChoice = inputReader.nextInt();
			
			//nested if statement for win or lose
			if (keepswitchChoice == 2)
			{
				System.out.print("You win"); 
			}
			
			else 
			{
				System.out.print("You Lose");
			}
		}
		
		//if statement for 2 & 1
		if(winDoor == 2 && playerChoice == 1)
		{
			System.out.print ("It has been revealed that door 3 is not the winning door. Choose 1 to keep & 2 to switch.") ;
			//scanner
			int keepswitchChoice = inputReader.nextInt();
			
			//nested if statement for win or lose
			if (keepswitchChoice == 2)
			{
				System.out.print("You win"); 
			}
			
			else 
			{
				System.out.print("You Lose");
			}
		}
		//if statement for 2 & 2
		if(winDoor == 2 && playerChoice == 2)
		{
			//ASK Math.random
			System.out.print ("It has been revealed that door " + (2*Math.random()+1) + " is not the winning door. Choose 1 to keep & 2 to switch.") ;
			//scanner
			int keepswitchChoice = inputReader.nextInt();
			
			//nested if statement for win or lose
			if (keepswitchChoice == 1)
			{
				System.out.print("You win"); 
			}
			
			else 
			{
				System.out.print("You Lose");
			}
		}
		//if statement for 2 & 3
		if(winDoor == 2 && playerChoice == 3)
		{
			System.out.print ("It has been revealed that door 1 is not the winning door. Choose 1 to keep & 2 to switch.") ;
			//scanner
			int keepswitchChoice = inputReader.nextInt();
			
			//nested if statement for win or lose
			if (keepswitchChoice == 2)
			{
				System.out.print("You win"); 
			}
			
			else 
			{
				System.out.print("You Lose");
			}
		}
		
		//if statement for 3 & 1
		if(winDoor == 3 && playerChoice == 1)
		{
			System.out.print ("It has been revealed that door 2 is not the winning door. Choose 1 to keep & 2 to switch.") ;
			//scanner
			int keepswitchChoice = inputReader.nextInt();
			
			//nested if statement for win or lose
			if (keepswitchChoice == 2)
			{
				System.out.print("You win"); 
			}
			
			else 
			{
				System.out.print("You Lose");
			}
		}
		
		//if statement for 3 & 2
		if(winDoor == 3 && playerChoice == 2)
		{
			System.out.print ("It has been revealed that door 1 is not the winning door. Choose 1 to keep & 2 to switch.") ;
			//scanner
			int keepswitchChoice = inputReader.nextInt();
			
			//nested if statement for win or lose
			if (keepswitchChoice == 2)
			{
				System.out.print("You win"); 
			}
			
			else 
			{
				System.out.print("You Lose");
			}
		}
		//if statement for 3 & 3
		if(winDoor == 3 && playerChoice == 3)
		{
			//decides which door to reveal
			int revealDoor = (int)(2*Math.random()+1);
			
			//if reveal door 1
			if (revealDoor == 1)
			{
				System.out.print ("It has been revealed that door 1 is not the winning door. Choose 1 to keep & 2 to switch.") ;
				//scanner
				int keepswitchChoice = inputReader.nextInt();
				
				//nested if statement for win or lose
				if (keepswitchChoice == 1)
				{
					System.out.print("You win"); 
				}
				
				else 
				{
					System.out.print("You Lose");
				}
			}
			//reveal door 2
			else 
			{
				System.out.print ("It has been revealed that door 2 is not the winning door. Choose 1 to keep & 2 to switch.") ;
				//scanner
				int keepswitchChoice = inputReader.nextInt();
				
				//nested if statement for win or lose
				if (keepswitchChoice == 1)
				{
					System.out.print("You win"); 
				}
				else 
				{
					System.out.print("You Lose");
				}
				
			}
			
		}
  }
		
		
		
		
	}
