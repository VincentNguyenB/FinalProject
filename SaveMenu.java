
import java.io.File;			//for files
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SaveMenu {
	
	
	private Player savePlayer;
	
	
	SaveMenu()
	{
		
		
	}
	
	
	
	
	public void saving(Player player) throws FileNotFoundException
	{
		String directory = "\\Users\\aweso\\Documents";
		
		File newSave = new File("\\Users\\aweso\\Documents\\gameSave.txt");
		
		
		if(!newSave.exists())
		{
			try 
			{
				newSave.createNewFile();
			} 
			catch (IOException e) 
			{
				System.out.println("An error has occured.");
				e.printStackTrace();
			}
		}
		
		
		PrintWriter pen = new PrintWriter(newSave);
		
		pen.print(player.getName());
		pen.print(" ");
		pen.print(player.getLevel());
		pen.print(" ");
		pen.print(player.getDifficulty());
		pen.print(" ");
		
		pen.print(player.getCurrentHealth());
		pen.print(" ");
		pen.print(player.getMaxHealth());
		pen.print(" ");
		pen.print(player.getCurrentMana());
		pen.print(" ");
		pen.print(player.getMaxMana());
		pen.print(" ");
		pen.print(player.getAttack());
		pen.print(" ");
		pen.print(player.getSpeed());
		pen.print(" ");
		pen.print(player.getAccuracy());
		pen.print(" ");
		pen.print(player.getExperience());
		pen.print(" ");
		pen.print(player.getNextLevel());
		
		System.out.println("Saving game, please don't turn off the device... ");
		

		pen.close();
		
	}
	
	public void loading(String saveFile, Player player) throws FileNotFoundException
	{
		
		File loadSave = new File(saveFile);		//direct to file location
		Scanner pen = new Scanner(loadSave);	//scanner for file location
		
		
		String line = pen.nextLine();
		Scanner lineReader = new Scanner(line);
		//lineReader.useDelimiter("\n");
		
		while (lineReader.hasNext())
		{
			
			
			//Actual loading
			player.setName(lineReader.next());
			player.setLevel(lineReader.nextInt());
			player.setDifficulty(lineReader.nextInt());
			
			player.setCurrentHealth(lineReader.nextInt());
			player.setMaxHealth(lineReader.nextInt());
			player.setCurrentMana(lineReader.nextInt());
			player.setMaxMana(lineReader.nextInt());
			player.setAttack(lineReader.nextInt());
			player.setSpeed(lineReader.nextInt());
			player.setAccuracy(lineReader.nextInt());
			player.setExperience(lineReader.nextInt());
			player.setNextLevel(lineReader.nextInt());
			
			/*
			//test print
			System.out.println(lineReader.next() + "'s Stats: \n");
			System.out.println("Level: " + lineReader.next());		//problem
			System.out.println("Difficulty: " + lineReader.nextInt());
			
			System.out.println("Current Health: " + lineReader.nextInt());
			System.out.println("Max Health: " + lineReader.nextInt());
			System.out.println("Current Mana: " + lineReader.nextInt());
			System.out.println("Max Mana: " + lineReader.nextInt());
			System.out.println("Attack: " + lineReader.nextInt());
			System.out.println("Speed: " + lineReader.nextInt());
			System.out.println("Accuracy: " + lineReader.nextInt());
			System.out.println("Current experience: " + lineReader.nextInt());
			System.out.println("EXP to next level: " + lineReader.nextInt());
			System.out.println("\n");
			*/
			
		}
		
		System.out.println("Loading complete!");
		
		
		pen.close();
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws FileNotFoundException 
	{
		//defualt save location
		//C:\Users\aweso\eclipse-workspace\VincentProject
		//String directory = "\\Users\\aweso\\eclipse-workspace\\VincentProject";
		
		//new location
		String directory = "\\Users\\aweso\\Documents\\gameSave.txt";
		
		Player test = new Player("Bob", 1);
		SaveMenu testSave = new SaveMenu();
		
		
		//testSave.loading(directory, test);
		
		
		
		//testSave.saving(test);
		//System.out.println("Saving, please wait... ");
		
		
	}
		
	
}
