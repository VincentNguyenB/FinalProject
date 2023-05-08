


public class Player extends Unit{

	private int difficulty;
	
	private int nextLevel;
	
	private Coordinates[][] xySpaces = new Coordinates[5][5];		//THE COORDNIATE PLANE SET
	
	private int waveCount = 0;
	
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
		setGold(0);
		
		resetMap();
		
		
	}
	
	
	
	
	public void setDifficulty(int d)
	{
		difficulty = d;
	}
	
	public void setNextLevel(int nl)
	{
		nextLevel = nl;
	}
	
	public void setxySpaces(int x, int y)
	{
		
		if(x == 0 || y == 0)
		{
			xySpaces[x][y].setX(x);
			xySpaces[x][y].setY(y);
		}
		else
		{
			xySpaces[x - 1][y - 1].setX(x);
			xySpaces[x - 1][y - 1].setY(y);
		}
		
		
	}
	
	public void setWaveCount(int i)
	{
		waveCount = i;
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
	
	public Coordinates[][] getXYSpaces()
	{
		return xySpaces;
	}
	
	public int getWaveCount()
	{
		return waveCount;
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
		
		if(getExperience() >= getNextLevel())
		{
			
			setExperience(getExperience() - getNextLevel());
			setLevel(getLevel() + 1);
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
	
	public void isNewSpace(int x, int y)
	{
		
		if(xySpaces[x - 1][y - 1].getX() != x && xySpaces[x -1][y - 1].getY() != y)	//if space is new space
		{
			
			xySpaces[x - 1][y - 1].setX(x);
			xySpaces[x - 1][y - 1].setY(y);
			
		}
		
		
	}
	
	public boolean mapComplete()
	{
		
		boolean empty = false;

		for(int i = 0; i < (getDifficulty() + 1); i++)
		{
			for(int j = 0; j < (getDifficulty() + 1); j++)
			{
				if(xySpaces[i][j].getX() == 0)
				{
					empty = true;
				}
			}
		}
		
		
		if(empty == false)		//all spaces have been met
		{
			setWaveCount(getWaveCount() + 1);
			return true;
			
		}
		
		
		return false;
		
		
	}
	
	public void resetMap()
	{
		
		for(int i = 0; i < xySpaces.length; i++)
		{
			for(int j = 0; j < xySpaces[0].length; j++)
			{
				
				xySpaces[i][j] = new Coordinates();
				
			}
		}
		
		xySpaces[0][0].setX(1);
		xySpaces[0][0].setY(1);
		
		
		
		
		
	}
	
	public void spacesLeft()
	{
		int empty = 0;
		
		for(int i = 0; i <= (getDifficulty() + 1); i++)
		{
			for(int j = 0; j <= (getDifficulty() + 1); j++)
			{
				if(xySpaces[i][j].getX() == 0)
				{
					empty++;
				}
			}
		}
		
		
		
		System.out.println("You have " + empty + " spaces left to explore.");
		
	}
	

	
	
	public static void main(String[] args) 
	{
		
		Player bob = new Player("bob", 1);
		
		//when printing, i = 0, getDifficulty() + 1
		
		
		//Player john = bob;
		//copy constructor works!
		//ONLY PRINTING
		/*
		System.out.println("X spaces: ");
		for(int i = 0; i <= (bob.getDifficulty() + 1); i++)
		{
			System.out.println(bob.getXSpaces()[i]);
		}
		
		System.out.println("Y spaces: ");
		for(int j = 0; j <= (bob.getDifficulty() + 1); j++)
		{
			System.out.println(bob.getYSpaces()[j]);
		}
		*/
		
		
	}
	
	
	
	
}
