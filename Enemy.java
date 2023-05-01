
//import java.util.Random;

public class Enemy extends Unit{

	
	//private Boolean flying = false;
	
	
	
	
	public Enemy(String name, int difficulty)
	{
		super(name, difficulty);
		
		generateStats(name, difficulty);
		
		
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
	
	
	public void generateStats(String name, int difficulty)
	{
		
		//int dog = (int) (Math.random() * (30 - 10) + 10);
		
		//(int) ((Math.random() * (15 - 10) + 10) * (difficulty * 2))
		
		//balancing for later 
		int health = (int) ((Math.random() * (15 - 10) + 10) * (difficulty * 2));
		int mana = (int) ((Math.random() * (10 - 5) + 5) * (difficulty * 2));
		int attack = (int) ((Math.random() * (4 - 2) + 2) + (difficulty * 2));
		int speed =  (int) ((Math.random() * (10 - 5) + 5) + (difficulty * 2));
		int accuracy =  (int) ((Math.random() * (70 - 50) + 50) + (difficulty * 2));
		int exp =   (int) ((Math.random() * (10 - 5) + 5) + (difficulty * 2));
		
		setCurrentHealth(health);
		setMaxHealth(health);
		setCurrentMana(mana);
		setMaxMana(mana);
		setAttack(attack);
		setSpeed(speed);
		setAccuracy(accuracy);
		setExperience(exp);
		
		
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
