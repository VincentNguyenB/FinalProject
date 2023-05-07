


public class Player extends Unit{

	private int difficulty;
	
	private int nextLevel;
	
	
	public void setDifficulty(int d)
	{
		difficulty = d;
	}
	
	public void setNextLevel(int nl)
	{
		nextLevel = nl;
	}
	
	//--------------
	
	public int getDifficulty()
	{
		return difficulty;
	}
	
	public int getNextLevel()
	{
		return nextLevel;
	}
	
	
	
	public Player(String name, int difficulty)
	{
		super(name, difficulty);
		
		setDifficulty(difficulty);
		
		setCurrentHealth(50);
		setMaxHealth(50);
		setCurrentMana(20);
		setMaxMana(20);
		setAttack(10);
		setSpeed(10);
		setAccuracy(75);
		setExperience(0);
		setNextLevel(20);
		
		
	}
	
	public void printStats()
	{
		
		System.out.println(getName() + "'s Stats: \n");
		System.out.println("Level: " + getLevel());
		System.out.println("Current Health: " + getCurrentHealth());
		System.out.println("Max Health: " + getMaxHealth());
		System.out.println("Current Mana: " + getCurrentMana());
		System.out.println("Max Mana: " + getMaxMana());
		System.out.println("Attack: " + getAttack());
		System.out.println("Speed: " + getSpeed());
		System.out.println("Accuracy: " + getAccuracy());
		System.out.println("Current experience: " + getExperience());
		System.out.println("EXP to next level: " + getNextLevel());
		System.out.println("\n");
		

	}
	

	
	
	public static void main(String[] args) 
	{
		/*
		Warrior bob = new Warrior("bob", 1);
		
		Warrior john = bob;
		//copy constructor works!
		
		System.out.println(bob.getName());
		System.out.println(john.getName());
		*/
		
	}
	
	
	
	
}
