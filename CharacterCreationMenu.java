
import java.util.Scanner;

public class CharacterCreationMenu {

	
	private Player createdPlayer;
		
	//setters	
	public void setPlayer(Player p)
	{
		createdPlayer = p;
	}
	
	//getters
	public Player getPlayer()
	{
		return createdPlayer;
	}
		
	
	//other methods
	public void start(Scanner scan)
	{
		String name = "";
		String playerClass = "";
		int difficulty = 1;
		
		//Scanner scan = new Scanner(System.in);

		
		System.out.println("Please enter name: ");
		name = scan.next();
		
		
		System.out.println("Please type in the class name for your character: \n");
		System.out.println("1) Warrior (Health up | speed down)");
		System.out.println("2) Mage (Attack up | accuracy down)");
		System.out.println("3) Archer (Accuracy up | health down)");
		System.out.println("Class name: ");
		
		playerClass = scan.next();
		
		
		System.out.println("Please type in number for difficulty: \n");
		System.out.println("1) Easy ");
		System.out.println("2) Medium ");
		System.out.println("3) Hard ");
		System.out.println("Difficulty of choice: ");
		
		difficulty = scan.nextInt();
		
		Player createdPlayer = new Player(name, difficulty);
		
		
		switch(playerClass)
		{
			case "warrior":
			{
				
			}
			case "Warrior":
			{
				createdPlayer.setCurrentHealth(60);
				createdPlayer.setMaxHealth(60);
				
				createdPlayer.setSpeed(8);
				
				break;
			}
			case "mage":
			{
				
			}
			case "Mage":
			{
				createdPlayer.setAttack(15);
				
				createdPlayer.setAccuracy(60);
				
				break;
			}
			case "archer":
			{
				
			}
			case "Archer":
			{
				createdPlayer.setAccuracy(90);
				
				createdPlayer.setCurrentHealth(45);
				createdPlayer.setMaxHealth(45);
				
				break;
			}
			default:
			{
				
			}
		}
		
		setPlayer(createdPlayer);
		//scan.close();
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
		
		//CharacterCreationMenu letsgo = new CharacterCreationMenu();
		//letsgo.start();
		
		
		
		
		
		
	}
	
	
	
	
}
