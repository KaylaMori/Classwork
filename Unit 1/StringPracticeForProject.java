import java.util.Scanner;
public class StringPracticeForProject {
	static Scanner inputReader = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		Scanner inputReader = new Scanner(System.in);

		//inputReader.nextLine();
		
		
		stopLoop();
		circleLoop();
	

		
		
		
		inputReader.close();
	}

	
	public static String stopLoop()
	{
		int stop = 0;
		int count =0;
		while(stop<1)
		{
	
			count++;
			String playerInput = inputReader.nextLine();
			if(playerInput.equals("stop") )
			{
				System.out.print("end");
				stop++;
			}
			else 
			{
				System.out.print(playerInput + " " + count);
			}
			
		}
		return "stop";
	}
	
	
	public static void circleLoop()
	{
		Circle myCircle = new Circle (4.0);
		double startRadius = myCircle.getRadius();
		double currentRadius = myCircle.getRadius();
		
		for (int i = 0; i < 5; i++) 
        {
			System.out.print("Add to the radius");
			double circleRadius = inputReader.nextDouble();
			currentRadius += circleRadius;
        }
		System.out.print("Your shape started with a radius of " + startRadius +" and ended with a radius of " + currentRadius + ".");
		
	}
}
