


public class Player extends Unit{

	private int difficulty;
	
	private int nextLevel;
	
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
	
	public void levelUp()
	{
		
		if(getExperience() == getNextLevel())
		{
			setLevel(getLevel() + 1);
			setExperience(0);
			setNextLevel(getNextLevel() + (10 * getLevel()));

			System.out.println(getName() + " has leveled up to level" + getLevel() + "\n");
			
			setMaxHealth(getMaxHealth() + (5 * getLevel()));
			setMaxMana(getMaxMana() + (5 * getLevel()));
			System.out.println("Health increased by " + 5 * getLevel());
			System.out.println("Mana increased by " + 5 * getLevel());
			
			setAttack(getAttack() + 2);
			setSpeed(getSpeed() + 2);
			setAccuracy(getAccuracy() + 2);
			
			
			System.out.println("Health and Mana fully restored!");
			setCurrentHealth(getMaxHealth());
			setCurrentMana(getMaxMana());
			
			
			
		}
	
	}
	
	public void gameOver()
	{
		
		if(isDead() == true)
		{
			
			System.out.println("Your health has dropped to 0.");
			System.out.println("Game Over...");
			
			System.exit(0);
		}
		
		
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
