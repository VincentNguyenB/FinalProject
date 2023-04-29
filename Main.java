
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	
	
	
	public static void main(String[] args) throws FileNotFoundException 
	{
		
		//System.out.println("Hello, Hai");
		
		
		CharacterCreationMenu newCharacter = new CharacterCreationMenu();
		newCharacter.start();
		
		Player thePlayer = newCharacter.getPlayer();
		
		MapMenu playerMap = new MapMenu(thePlayer);
		SaveMenu save = new SaveMenu();
		
		int option = 0;
		Scanner scan = new Scanner(System.in);
		
		while(option != 4)
		{
			System.out.println("What do you want to do: \n");
			System.out.println("1) Move");
			System.out.println("2) Check stats");
			System.out.println("3) Save and Exit");
			System.out.println("4) End Program");
			
			option = scan.nextInt();
			
			switch (option)
			{
				case 1:
				{
					playerMap.movement(thePlayer);
					
					break;
				}
				case 2:
				{
					thePlayer.printStats();
					
					break;
				}
				case 3:
				{
					save.saving(thePlayer);
					
					break;
				}
				case 4:
				{
					
					
				}

			}

			
		}
		
		
		
		
		scan.close();
	}
		
	
}
