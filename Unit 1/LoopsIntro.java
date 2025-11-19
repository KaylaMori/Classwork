public class loopsIntro {

	/**
	 * Main Method
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(getIfRepeats("dogy"));

	
	}

	/**
	 * This method counts how many times the inputted char shows up
	 * @param str
	 * @param letter
	 * @return
	 */
	public static int countLetters(String str, char letter)
	{
		//Creates the count variable and assigns 0
		int count = 0;
		//for loop; runs until i equals string length
		for(int i = 0; i<str.length();i++)
		{
			//runs and adds one to count only if letter matches with the character
			if (letter == str.charAt(i))
			{
				count++;
			}
		}
		//returns count amount when for loop stops running
		return count;
	}
	
	/**
	 * This method finds the factorial of the inputted number
	 * @param num
	 * @return
	 */
	public static int getFactorial (int num)
	{
		//assigns the answer variable as 0
		int answer=0;
		//for loop, runs until number is 0 or less
		for (;num>0;)
		{
			//Times the answer variable by the num variable then minuses one from its value
			answer*=num;
			num--;
		}
		//returns the value of the answer variable
		return answer;
	}
	
	
	/**
	 * This method finds if two of the same letters are next to each other
	 * @param str
	 * @return
	 */
	public static boolean getIfRepeats(String str)
	{
		//assigns count variable as 0
		int count = 0;
		
		// for loop runs when i is less than string length - 1
		for(int i = 0; i<str.length()-1 ;i++)
		{
				//if two characters next to each other equal -> add one to count. If not restart for loop
				if (str.charAt(i) == str.charAt(i+1))
				{
					count++;
					
					//Returns true if there's any two characters next each other since count + 1. If not, false
					if (count > 0)
					{
						return true;
					}
					else
					{
						return false;
					}
					
				}
			
		}
		// safety return false runs when if statement doesn't apply
		return false;
		
	
	}
}
