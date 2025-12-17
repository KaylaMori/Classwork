// Character stats Class
public class charStats {
	
	//Attributes
    private String name;
    private int age;
    private int talent;
    private int popularity;
    private String skill;
    

    /*
     *When called, generates new charStats object with updated name, age, talent, popularity, skill
     */
    public charStats(String name1, int age1, int talent1, int popularity1, String skill1) 
    {
        name = name1;
        age = age1;
        talent = talent1;
        popularity = popularity1;
        skill = skill1;
    }
    

    /*
     * Returns the name 
     */
    public String getName() 
    {
        return name;
    }
    
    /*
     * Returns the age
     */
    public int getAge() 
    {
        return age;
    }
    
    /*
     * Returns the talent
     */
    public int getTalent() 
    {
        return talent;
    }
    
    /*
     * Returns the popularity
     */
    public int getPopularity() 
    {
        return popularity;
    }
    
    /*
     * Returns the skill
     */
    public String getSkill() 
    {
        return skill;
    }
    
    
    
    /*
	 * Changes charStats objects name as a new name 
	 */
    public void setName(String newName) 
    {
        name = newName;
    }
    
    /*
	 * Changes charStats objects age as a new age 
	 */
    public void setAge(int newAge) 
    {
        age = newAge;
    }
    
    /*
	 * Changes charStats objects talent as a new talent 
	 */
    public void setTalent(int newTalent) 
    {
        talent = newTalent;
    }
    
    /*
	 * Changes charStats objects popularity as a new popularity 
	 */
    public void setPopularity(int newPopularity) 
    {
        popularity = newPopularity;
    }
    
    /*
	 * Changes charStats objects skill as a new skill 
	 */
    public void setSkill(String newSkill) 
    {
        skill = newSkill;
    }
    
    
    /*
     *Display trainee stats when called
     */
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
