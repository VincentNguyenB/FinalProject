
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	
	
	
	public static void main(String[] args) throws FileNotFoundException 
	{
		
		//System.out.println("Hello, Hai");
		
		
		CharacterCreationMenu newCharacter = new CharacterCreationMenu();	//initialize character creation menu
		newCharacter.start();												//goes to character creation
		
		Player thePlayer = newCharacter.getPlayer();						//initialize player character.
																			//will be used in everything
		
		MapMenu playerMap = new MapMenu(thePlayer);							//creates the map
		SaveMenu save = new SaveMenu();										//initialize save menu
		String directory = "\\Users\\aweso\\Documents\\gameSave.txt";		//directory temp
		
		int option = 0;														//holds input
		Scanner scan = new Scanner(System.in);								//reads input
		
		while(option != 4)													//mock-up menu
		{
			System.out.println("What do you want to do: \n");
			System.out.println("1) Move");
			System.out.println("2) Check stats");
			System.out.println("3) Load existing file");
			System.out.println("4) Save and Exit");
			
			option = scan.nextInt();
			
			switch (option)
			{
				case 1:
				{
					playerMap.movement(thePlayer);							//Move around map
					
					break;
				}
				case 2:
				{
					thePlayer.printStats();									//print stats
					
					break;
				}
				case 3:
				{
					save.loading(directory, thePlayer);									//saves data
					
					break;
				}
				case 4:
				{
					save.saving(thePlayer);									//saves data
					
				}

			}

			
		}
		
		
		
		
		scan.close();
	}
		
	
}
