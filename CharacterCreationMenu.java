
import java.util.Scanner;

public class CharacterCreationMenu {

	
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		
		String name = "";
		String playerClass = "";
		int difficulty = 1;
		
		Scanner scan = new Scanner(System.in);

		
		System.out.println("Please enter name: ");
		name = scan.next();
		
		
		System.out.println("Please type in the class for your character: \n");
		System.out.println("1) Warrior (Health up | speed down)\n");
		System.out.println("2) Mage (Attack up | health down)\n");
		System.out.println("3) Archer (Accuracy up | low attack)\n");
		System.out.println("Class number: \n");
		
		playerClass = scan.next();
		
		
		System.out.println("Please type in number for difficulty: \n");
		System.out.println("1) Easy \n");
		System.out.println("2) Medium \n");
		System.out.println("3) Hard \n");
		System.out.println("Difficulty of choice: \n");
		
		difficulty = scan.nextInt();
		
		
		if(playerClass == "warrior" || playerClass == "Warrior")
		{
			Warrior thePlayer = new Warrior(name, difficulty);
		}
		else if(playerClass == "mage" || playerClass == "Mage")
		{
			Mage thePlayer = new Mage(name, difficulty);
		}
		else if(playerClass == "archer" || playerClass == "Archer")
		{
			Archer thePlayer = new Archer(name, difficulty);
		}
		

		
		
		
	}
	
	
	
	
}
