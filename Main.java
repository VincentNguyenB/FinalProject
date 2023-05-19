
//import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	
	
	
	public static void main(String[] args) throws FileNotFoundException 
	{
		
		
		Scanner scan = new Scanner(System.in);								//reads input
		
		Player thePlayer = new Player("Bob", 1);						//initialize player character.
																		//will be used in everything
		String directory = System.getProperty("user.dir");
		String location = directory + "\\gameSave.txt";	
		//File newSave = new File(directory + "\\gameSave.txt");
		
		
		SaveMenu save = new SaveMenu();										//initialize save menu
		InGameMenu game = new InGameMenu();
	
		
		int option = 0;														//holds input
		
		while(option < 4 || option >= 0)													//mock-up menu
		{
			System.out.println("Epic Game \n");
			
			System.out.println("Type in the # of the option: \n");
			System.out.println("1) Start New Game");
			System.out.println("2) Load Existing File");
			System.out.println("3) Credits");
			System.out.println("4) Exit");
			
			option = scan.nextInt();
			
			switch (option)
			{
				case 1:
				{
					CharacterCreationMenu newCharacter = new CharacterCreationMenu();	//initialize character creation menu
					newCharacter.start(scan);											//goes to character creation
					
					thePlayer = newCharacter.getPlayer();						//initialize player character.
					
					
					
					game.gameMenu(thePlayer, scan, save);
					option = 4;
					
					break;
				}
				case 2:
				{
					save.loading(location, thePlayer);									//saves data
					game.gameMenu(thePlayer, scan, save);
					option = 4;
					break;
				}
				case 3:
				{
					game.credits();
					
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
