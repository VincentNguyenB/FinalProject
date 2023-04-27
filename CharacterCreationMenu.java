
import java.util.Scanner;

public class CharacterCreationMenu {

		private String name = "";
		private String playerClass = "";
		private int difficulty = 1;
		
		
		
		
		
		
	public void setName(String n)
	{
		name = n;
	}
	
	public void SetPlayerClass(String c)
	{
		playerClass = c;
	}
	
	public void setDifficulty(int d)
	{
		difficulty = d;
	}
		
	//-----------------------
	
	public String getName()
	{
		return name;
	}
	
	public String getPlayerClass()
	{
		return playerClass;
	}
	
	public int getDifficulty()
	{
		return difficulty;
	}
	
	
	public void start()
	{
		String name = "";
		String playerClass = "";
		int difficulty = 1;
		
		Scanner scan = new Scanner(System.in);

		
		System.out.println("Please enter name: ");
		name = scan.next();
		
		
		System.out.println("Please type in the class for your character: \n");
		System.out.println("1) Warrior (Health up | speed down)");
		System.out.println("2) Mage (Attack up | accuracy down)");
		System.out.println("3) Archer (Accuracy up | health)");
		System.out.println("Class name: ");
		
		playerClass = scan.next();
		
		
		System.out.println("Please type in number for difficulty: \n");
		System.out.println("1) Easy ");
		System.out.println("2) Medium ");
		System.out.println("3) Hard ");
		System.out.println("Difficulty of choice: ");
		
		difficulty = scan.nextInt();
		
		
		
		switch(playerClass)
		{
			case "warrior":
			{
				
			}
			case "Warrior":
			{
				System.out.println("uh oh");
				
				Warrior thePlayer = new Warrior(name, difficulty);
				MapMenu map = new MapMenu(thePlayer);
				
				boolean dog = true;
				
				while(dog == true)
				{
					
					map.movement();
					
					
				}
				
				break;
			}
			case "mage":
			{
				
			}
			case "Mage":
			{
				Mage thePlayer = new Mage(name, difficulty);
				MapMenu map = new MapMenu(thePlayer);
				
				boolean dog = true;
				
				while(dog == true)
				{
					
					map.movement();
					
					
				}
				
				break;
			}
			case "archer":
			{
				
			}
			case "Archer":
			{
				Archer thePlayer = new Archer(name, difficulty);
				MapMenu map = new MapMenu(thePlayer);
				
				boolean dog = true;
				
				while(dog == true)
				{
					
					map.movement();
					
					
				}
				
				break;
			}
			default:
			{
				
			}
			
			
			
			
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
		
		//CharacterCreationMenu letsgo = new CharacterCreationMenu();
		//letsgo.start();
		
		
		
		
		
		
	}
	
	
	
	
}
