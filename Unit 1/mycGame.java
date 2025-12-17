
//import the scanner
import java.util.Scanner;
// Main class 
public class mycGame {

    public static void main(String[] args) {
    
    	//scanner input reader
    	Scanner inputReader = new Scanner(System.in);
        
    	//Method start (Intro w/ starting lines)
        gameStart();

        // Create character name
        System.out.print("Enter your stage name: ");
        String name = inputReader.nextLine();
        
        //Create character age
        System.out.print("Enter your age: ");
        int age = inputReader.nextInt();
        
        // While loop check for valid input
        String skill = "";
        int validSkill = 0;
        while (validSkill<1) 
        {
        	//Choose specialty
            System.out.print("Choose your specialty (Vocal/Dance/Rap): ");
            skill = inputReader.nextLine();
            
            if (skill.equalsIgnoreCase("Vocal") || skill.equalsIgnoreCase("Dance") || skill.equalsIgnoreCase("Rap")) 
            {
                validSkill += 1;
            } 
            else 
            {
                System.out.println("Invalid skill. Choose Vocal, Dance, or Rap as written.");
            }
        }
        
        // Characters stats 
        charStats player = new charStats(name, age, 50, 30, skill);
        player.displayStats();
        
        System.out.println("This is the start of the Survival Show!!!");
        System.out.println("You're competing with 99 other trainees to debut.");
        System.out.println("There are many talented people so do your best!.");
        
        
        // ROUND 1 (First impressions + audition piece)
        
        // While loop check for valid input
        String round1 = "";
        int validChoice = 0;
        while (validChoice<1) 
        {
            System.out.println("ROUND 1");
            System.out.println("For your first performance, you will be creating your first impression to everyone" + " Play it safe with a popular song (Type 1) or Take a risk with an original song you created (Type 2)?");
            
            round1 = inputReader.nextLine();
            
            if (round1.equalsIgnoreCase("1") || round1.equalsIgnoreCase("2"))
            {
                validChoice += 1;
            }
            else 
            {
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }
        
        
        
        
        //if loop for the two choices of ROUND 1 songs
        if (round1.equalsIgnoreCase("1")) 
        {
            System.out.println("You perform a well-known popular song.");
            System.out.println("The judges approve of your performance. The audience likes it as well.");
            player.setPopularity(player.getPopularity() + 10);
            System.out.println("Popularity +10! The judges liked your performance. It was stable.");
        } 
        else 
        {
            System.out.println("You perform your own original song.");
            System.out.println("The judges are interested and paying close attention.");
            player.setTalent(player.getTalent() + 15);
            player.setPopularity(player.getPopularity() + 5);
            System.out.println("Talent +15! Popularity +5! The judges are impressed by your lyricism and producing skills!");
        }
   
        player.displayStats();

        
        
        
        
        // ROUND 2: Performing with a team
        System.out.println("ROUND 2: Team Battle");
        System.out.println("Choose a team that you will be working with for the group performance challenge.");
        
        // While loop check for valid input
        validChoice = 0;
        String round2 = "";
        while (validChoice<1) 
        {
            System.out.println("Do you want to join Team A with popular trainees with good skills (Type 1) or Team B with unknown trainees but amazing skills? (Type 2)");
            round2 = inputReader.nextLine();
            
            if (round2.equalsIgnoreCase("1") || round2.equalsIgnoreCase("2"))
            {
                validChoice += 1;
            } 
            else
            {
                System.out.println("Invalid choice! Please enter 1 or 2.");
            }
        }
        
        
        //if loop for the two team choices
        if (round2.equalsIgnoreCase("1"))
        {
            // Popular team 
            System.out.println("You join Team A with popular trainees.");
            System.out.println("The cameras are on your team a lot of the time so you manage to snag screentime :D");
            System.out.println("Only downside is you get constantly outshined.");
            
            // POSITION
            // // While loop check for valid input
            validChoice = 0;
            String positionChoice = "";
            while (validChoice<1) 
            {
                System.out.print("During practice, do you try to take the center position (Type 1) or support your teammates and be cohesive as a team (Type 2)? ");
                positionChoice = inputReader.nextLine();
                
                if (positionChoice.equalsIgnoreCase("1") || positionChoice.equalsIgnoreCase("2")) 
                {
                    validChoice += 1;
                } 
                else 
                {
                    System.out.println("Invalid choice! Please enter 1 or 2.");
                }
            }
            
            //If loop for two position choices
            if (positionChoice.equalsIgnoreCase("1")) 
            {
                System.out.println("You ask for the center position.");
                System.out.println("Some teammates look upset and hesitant but it gives you some screentime i guess.");
                player.setPopularity(player.getPopularity() + 15);
                player.setTalent(player.getTalent() - 5);
                System.out.println("Popularity +15! Talent -5! Screentime but team tension.");
            } 
            else 
            {
                System.out.println("You support your team and create a cohesive and synchronized performance!");
                System.out.println("The judges praise your teamwork.");
                player.setTalent(player.getTalent() + 10);
                player.setPopularity(player.getPopularity() + 10);
                System.out.println("Talent +10! Popularity +10! Yay!");
            }
            
            
            
            // VOTING
            player.displayStats();
            System.out.println("ROUND 3: Eliminations");
            System.out.println("It's the first elimination. You're in danger.");
            
            //While loop check for Valid Input
            validChoice = 0;
            String round3 = "";
            while (validChoice<1) 
            {
                System.out.print("Do you rely on fans and fanservice, create a moving speech (Type 1) or focus on giving an amazing performance (Type 2)? ");
                round3 = inputReader.nextLine();
                
                if (round3.equalsIgnoreCase("1") || round3.equals("2")) 
                {
                    validChoice += 1;
                } 
                else 
                {
                    System.out.println("Invalid choice! Please enter 1 or 2.");
                }
            }
            
            //if loop for voting
            //create a moving speech choice
            if (round3.equalsIgnoreCase("1")) 
            {
                System.out.println("You pour your emotions out on stage.");
                System.out.println("'I've dreamed of this since I was a child and I will continue to work extremely hard. Thank you to all my fans and I hope for continued support!'");
                
                // Loop
                System.out.println("Votes are calculated.");
                int votes = 0;
                for (int i = 1; i <= 5; i++) 
                {
                    votes += 100;
                    System.out.println("Vote count: " + votes + " votes!");
                }
                
                player.setPopularity(player.getPopularity() + 20);
                
                //ENDINGS for FANSERVICE
                if (player.getPopularity() >= 70) 
                {
                    //ENDING good popularity
                    System.out.println("The audience LOVES you!");
                    System.out.println("You make it to the finals and debut as the group's visual and center!");
                    System.out.println("Your star quality and connection to fans makes you one of the most biased members!");
                    System.out.println("ENDING: FAN FAVORITE");
                    player.displayStats();
                } 
                else
                {
                    //ENDING not enough popularity
                    System.out.println("Despite the votes, you're eliminated.");
                    System.out.println("But due to fans love for you online, you are scouted by another company");
                    System.out.println("You join that company and debut in a decently successgul group later!");
                    System.out.println("ENDING: GOOD SO BAD (ZB1 REFERENCE :D)");
                    player.displayStats();
                }
            } 
            
        	//focus on giving amazing performance choice
            else 
            {
                System.out.println("You deliver a perfect performance!");
                
                if (skill == "Vocal") 
                {
                    System.out.println("Your vocals hit every note and sound just like the studio recording!");
                    player.setTalent(player.getTalent() + 25);
                } 
                else if (skill == "Dance") 
                {
                    System.out.println("Your dance moves are sharp and detailed, giving you an applause!");
                    player.setTalent(player.getTalent() + 25);
                } 
                else 
                {
                    System.out.println("Your rap flow is smooth and cadence is remarkable!");
                    player.setTalent(player.getTalent() + 25);
                }
                
                //judge scores
                System.out.println("Judge scores:");
                int totalScore = 0;
                for (int i = 1; i <= 4; i++) 
                {
                    System.out.println("Judge " + i + ": 10/10!");
                    totalScore += 10;
                }
                System.out.println("Perfect score: " + totalScore + "/40!");

                
                // ENDING for PERFORMANCE
                System.out.println("You're skills carry you throughout the whole competition!");
                System.out.println("You debut as the group's main " + skill + "!");
                System.out.println("Netizens call you the best in the generation!");
                System.out.println("ENDING: THE ACE");
                player.displayStats();
            }
        }
        
        
        
        
        
        
        //Underdog team path
        else 
        {
            System.out.println("You join Team B with the underdogs.");
            System.out.println("Your team lacks attention and star quality but everyone is ambitious to debut.");
            
            //LEADER
            validChoice = 0;
            String leaderChoice = "";
            while (validChoice<1) 
            {
                System.out.print("Your team needs a leader first off. Do you volunteer to be leader (Type 1) or let someone else lead while you focus on practcing your own skills (Type 2)? ");
                leaderChoice = inputReader.nextLine();
                
                if (leaderChoice.equalsIgnoreCase("1") || leaderChoice.equalsIgnoreCase("2")) 
                {
                    validChoice += 1;
                } 
                else 
                {
                    System.out.println("Invalid choice! Please enter 1 or 2.");
                }
            }
            
            //LEADER
            if (leaderChoice.equalsIgnoreCase("1")) 
            {
                System.out.println("You take charge as the leader!");
                System.out.println("You organize practice schedules and motivate everyone while leading dance practices and fixing the details of your performance.");
                
                //TEAM BONDING
                System.out.println("Team bonding (Required by leader (YOU)!!!):");
                for (int i = 1; i <= 3; i++) 
                {
                    System.out.println("Day " + i + ": Team chemistry improving!");
                }
                
                player.setTalent(player.getTalent() + 5);
                player.setPopularity(player.getPopularity() + 20);
                System.out.println("Talent +5! Popularity +20!");
                System.out.println("The judges notice your leadership qualities!");
            } 
            
            //NOT LEADER
            else 
            {
                System.out.println("You focus on perfecting your skills.");
                System.out.println("Others handle the emotional aspects and you just practice.");
                player.setTalent(player.getTalent() + 25);
                System.out.println("Talent +25! DEDICATION!");
            }
            
            
            
            
            //CONCEPT BATTLE
            player.displayStats();
            System.out.println("ROUND 3: Concept Battle");
            System.out.println("You must choose between two final performance concepts that will be performed at the finale.");
            
            validChoice = 0;
            String conceptChoice = "";
            while (validChoice<1) 
            {
                System.out.print("Do you choose a trendy, y2k concept (Type 1) or a cinematic, artistic concept (Type 2)? ");
                conceptChoice = inputReader.nextLine();
                
                if (conceptChoice.equalsIgnoreCase("1") || conceptChoice.equalsIgnoreCase("2")) 
                {
                    validChoice += 1;
                } 
                else 
                {
                    System.out.println("Invalid choice! Please enter 1 or 2.");
                }
            }
            
            
            
            
            
            //ENDING underdogs
            //y2k concept
            if (conceptChoice.equalsIgnoreCase("1")) 
            {
                System.out.println("You go viral on SNS!");
                System.out.println("The performance choreography turns into a dance challenge all over SNS!");
                
                // TRENDING
                System.out.println("Popularity increase:");
                for (int i = 1; i <= 4; i++) 
                {
                    System.out.println("The performance choreo is trending in " + i + " countries!");
                }
                
                player.setPopularity(player.getPopularity() + 30);
                
                
                //ENDING popular
                if (player.getPopularity() >= 75) 
                {
                    System.out.println("You become popular on social media!");
                    System.out.println("You debut and even gain a massive following!");
                    System.out.println("You know what that means? Influence! Brand deals! Endorsments!");
                    System.out.println("ENDING: Trending Sensation");
                    player.displayStats();
                } 
                
                //ENDING ok
                else 
                {
                    System.out.println("You gain a solid fanbase and dedicated fans!");
                    System.out.println("You successfully debut in the final lineup!");
                    System.out.println("ENDING: You Debuted Congrats. That's it.");
                    player.displayStats();
                }
            } 
            
            
            //cinematic concept
            else 
            {
                System.out.println(" You deliver a cinematic stage!");
                System.out.println("The judges and audience are wowed at the performance and stage production.");
                
                player.setTalent(player.getTalent() + 20);
                
                
                
                //ENDING talented
                if (player.getTalent() >= 90) 
                {
                    System.out.println("The judges call you a stage genius!");
                    System.out.println("You debut as the group's performance director!");
                    System.out.println("Your known for stage designs, outfits, key choreo, and small little things that capture the audience's attention.");
                    System.out.println("ENDING: Stage Genius");
                    player.displayStats();
                } 
                
                //ENDING all-rounder
                else if (player.getTalent() >= 70 && player.getPopularity() >= 50) 
                {
                    System.out.println("Dang you're talented and popular!");
                    System.out.println("You debut as the all-rounder of the group!");
                    System.out.println("You become the backbone and support of the group and loved by fans!");
                    System.out.println("ENDING: All-Rounder Multi-genius King");
                    player.displayStats();
                } 
                
                //ENDING unfortunate
                else 
                {
                    System.out.println("You just miss the final lineup by one spot.");
                    System.out.println("Boohoo. That's life for ya.");
                    System.out.println("Improve your skills.");
                    System.out.println("ENDING: Maybe next time?");
                    player.displayStats();
                }
            }
        }
        
        inputReader.close();
}
    
	private static void gameStart()
	{
        // Game introduction
        System.out.println("Welcome to a rip off of BOYS PLANET (rip off cause I ran out of time and rushed the choices so they don't match the show :( ");
        System.out.println("Go start your journey to debut!!!");
	}

}
