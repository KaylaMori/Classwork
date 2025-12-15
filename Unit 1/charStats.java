// Trainee class
public class charStats {
	
	//Attributes
    private String name;
    private int age;
    private int talent;
    private int popularity;
    private String skill;
    

    //Constructor
    public charStats(String name1, int age1, int talent1, int popularity1, String skill1) 
    {
        name = name1;
        age = age1;
        talent = talent1;
        popularity = popularity1;
        skill = skill1;
    }
    

    
    public String getName() 
    {
        return name;
    }
    
    public int getAge() 
    {
        return age;
    }
    
    public int getTalent() 
    {
        return talent;
    }
    
    public int getPopularity() 
    {
        return popularity;
    }
    
    public String getSkill() 
    {
        return skill;
    }
    
    
    

    public void setName(String name1) 
    {
        name = name1;
    }
    
    public void setAge(int age1) 
    {
        age = age1;
    }
    
    public void setTalent(int talent1) 
    {
        talent = talent1;
    }
    
    public void setPopularity(int popularity1) 
    {
        popularity = popularity1;
    }
    
    public void setSkill(String skill1) 
    {
        skill = skill1;
    }
    
    
    
    // Display trainee stats when called
    public void displayStats() 
    {
        System.out.println("TRAINEE PROFILE");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Specialty: " + skill);
        System.out.println("Talent Score: " + talent + "/100");
        System.out.println("Popularity: " + popularity + "/100");
    }
}
