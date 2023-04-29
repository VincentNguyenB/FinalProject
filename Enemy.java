


public class Enemy extends Unit{


	
	
	
	public Enemy(String name, int difficulty)
	{
		super(name, difficulty);
		
		
		setCurrentHealth(50);
		setMaxHealth(50);
		setCurrentMana(20);
		setMaxMana(20);
		setAttack(10);
		setSpeed(10);
		setAccuracy(75);
		setExperience(0);
		
		
	}
	
	public void printStats()
	{
		
		System.out.println(getName() + "'s Stats: \n");
		System.out.println("Level: " + getLevel());
		System.out.println("Health: " + getCurrentHealth());
		System.out.println("Mana: " + getCurrentMana());
		System.out.println("Attack: " + getAttack());
		System.out.println("Speed: " + getSpeed());
		System.out.println("Accuracy: " + getAccuracy());
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
