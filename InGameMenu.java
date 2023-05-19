import java.io.FileNotFoundException;
import java.util.Scanner;

public class InGameMenu {

	
	InGameMenu()
	{
		
	}
	
	
	
	public void gameMenu(Player player, Scanner scan, SaveMenu save) throws FileNotFoundException
	{
		
		
																			//will be used in everything
		
		MapMenu playerMap = new MapMenu(player);							//creates the map
		
		String directory = System.getProperty("user.dir");
		String location = directory + "\\gameSave.txt";	
		int option = 0;														//holds input
		//Scanner scan = new Scanner(System.in);								//reads input
		
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
					playerMap.movement(player, scan);							//Move around map
					
					break;
				}
				case 2:
				{
					player.printStats();									//print stats
					
					break;
				}
				case 3:
				{
					save.loading(location, player);									//saves data
					
					break;
				}
				case 4:
				{
					save.saving(player);									//saves data
					
				}

			}

			
		}
		
		
		
		
	}
	
	public void credits()
	{
		System.out.println("Programmer: Vincent \n");
		System.out.println("-Character Creation");
		System.out.println("-Map system");
		System.out.println("-Battle system");
		System.out.println("Saving/Loading");
		
		System.out.println("\n \n");
		
		System.out.println("Programmer: Hai \n");
		System.out.println("-Main Menu");
		System.out.println("-Shop");
		System.out.println("-GUI");
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
