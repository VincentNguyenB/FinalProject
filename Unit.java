


public abstract class Unit {

	//General
	private String name;
	private int level;
	
	
	//Plater Statistics
	private int currentHealth;
	private int maxHealth; 
	private int currentMana;
	private int maxMana;
	private int attack;
	private int speed;
	private int accuracy;
	private int experience;
	private int gold;
	
	
	
	public Unit(String name, int difficulty)
	{
		this.name = name;
		this.level = 1;
		
		/*
		this.currentHealth = 50;
		this.maxHealth = 50;
		this.currentMana = 20;
		this.maxMana = 20;
		this.attack = 10;
		this.speed = 10;
		this.accuracy = 75;
		this.expereince = 0;
		*/
	}
	
	
	
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setLevel(int l)
	{
		level = l;
	}
	
	public void setCurrentHealth(int h)
	{
		currentHealth = h;
	}
	
	public void setMaxHealth(int h)
	{
		maxHealth = h;
	}
	
	public void setCurrentMana(int m)
	{
		currentMana = m;
	}
	
	public void setMaxMana(int m)
	{
		maxMana = m;
	}
	
	public void setAttack(int a)
	{
		attack = a;
	}
	
	public void setSpeed(int s)
	{
		speed = s;
	}
	
	public void setAccuracy(int a)
	{
		accuracy = a;
	}
	
	public void setExperience(int e)
	{
		experience = e;
	}
	
	public void setGold(int g)
	{
		gold = g;
	}
	
	

	//---------------
	
	public String getName()
	{
		return name;
	}
	
	public int getLevel()
	{
		return level;
	}
	
	public int getCurrentHealth()
	{
		return currentHealth;
	}
	
	public int getMaxHealth()
	{
		return maxHealth;
	}
	
	public int getCurrentMana()
	{
		return currentMana;
	}
	
	public int getMaxMana()
	{
		return maxMana;
	}
	
	public int getAttack()
	{
		return attack;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	public int getAccuracy()
	{
		return accuracy;
	}
	
	public int getExperience()
	{
		return experience;
	}
	
	public int getGold()
	{
		return gold;
	}
	
	
	
	public boolean isDead()
	{
		
		if(getCurrentHealth() == 0)
		{
			return true;
		}
		
		return false;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		

		
		
		
	}
	
	
	
	
}
