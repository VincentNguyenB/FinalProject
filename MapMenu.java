
//import java.io.IOException;
import java.util.Scanner;

public class MapMenu {

	
	private int xCoor = 1;				//horizontal coordinate
	private int yCoor = 1;				//vertical coordinate
	
	private int difficulty = 1;			//idk
	
	private int mapWidth = 3;			//Establishes map dimensions
	private int mapLength = 3;			//Width = x, Length = y
	
	//-------------------------------
	
	MapMenu(Player player)
	{
		setXCoor(1);					//Starts player at (1,1), 
		setYCoor(1);					//
		
		
		switch(player.getDifficulty())	//determine map dimensions
		{
			case 1:
			{
				setMapWidth(3);
				setMapLength(3);
				System.out.println("Generated map is a 3x3 grid \n");
				movementMessage();
				player.spacesLeft();
				
				break;
			}
			case 2:
			{
				setMapWidth(4);
				setMapLength(4);
				System.out.println("Generated map is a 4x4 grid \n");
				movementMessage();
				player.spacesLeft();
				
				break;
			}
			case 3:
			{
				setMapWidth(5);
				setMapLength(5);
				System.out.println("Generated map is a 5x5 grid \n");
				movementMessage();
				player.spacesLeft();
				
				break;
			}
			default:
			{
				
			}
		
			//movementMessage();
		
		}
		
		
		
	}
	
	
	
	
	
	
	
	//getters
	public void setXCoor(int x)
	{
		xCoor = x;
	}
	
	public void setYCoor(int y)
	{
		yCoor = y;
	}
	
	public void setDifficulty(int d)
	{
		difficulty = d;
	}
	
	public void setMapWidth(int w)
	{
		mapWidth = w;
	}
	
	public void setMapLength(int l)
	{
		mapLength = l;
	}
	
	//setters
	public int getXCoor()
	{
		return xCoor;
	}
	
	public int getYCoor()
	{
		return yCoor;
	}
	
	public int getDifficulty()
	{
		return difficulty;
	}
	
	public int getMapWidth()
	{
		return mapWidth;
	}
	
	public int getMapLength()
	{
		return mapLength;
	}
	
	
	//Other methods
	public void movement(Player player)			//moves the player in a direction
	{
		
		String direction = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter in the direction you wish to travel to. \n");	//needs input validation
		System.out.println("-North ");
		System.out.println("-South ");
		System.out.println("-East ");
		System.out.println("-West ");
		
		direction = scan.next();
		
		//clearScreen();		//Doesn't work
		
		switch(direction)
		{
			case "north":
			{
				
				
			}
			case "North":
			{
				if(checkWall(getYCoor() + 1, player) == false)
				{
					setYCoor(getYCoor() + 1);
				}
				break;
			}
			case "south":
			{
				
				
			}
			case "South":
			{
				if(checkWall(getYCoor() - 1, player) == false)
				{
					setYCoor(getYCoor() - 1);
				}
				break;
			}
			case "east":
			{
				
				
			}
			case "East":
			{
				if(checkWall(getXCoor() + 1, player) == false)
				{
					setXCoor(getXCoor() + 1);
				}
				break;
			}
			case "west":
			{
				
				
			}
			case "West":
			{
				if(checkWall(getXCoor() - 1, player) == false)
				{
					setXCoor(getXCoor() - 1);
				}
				break;
			}
			default:
			{
				System.out.println("huh ? \n");		//lol what is this
			}
		
		}
		
		
		movementMessage();
		
		player.isNewSpace(getXCoor(), getYCoor());
		player.spacesLeft();
		
		if(player.mapComplete() == true)
		{
			newWave(player);
			
			
			
		}
		
		//scan.close();
		
	}
	
	
	public boolean checkWall(int value, Player player)		//punish the player if they try to go out of bound
	{														//of the map's established dimensions
		
		
		if(value <= 0 || value > getMapWidth() || value > getMapLength())
		{
			System.out.println("You've hit a wall, idiot. \n");
			System.out.println("You've taken 5 damage. \n");
			
			player.setCurrentHealth(player.getCurrentHealth() - 5);
			
			return true;
		}
		
		
		return false;
		
	}
	
	public void movementMessage()			//each time the player moves, they will be notified
	{										//where they are on the map.
		
		System.out.println("You are now at coordinate (" 
							+ getXCoor() + ", " 
							+ getYCoor() + ").");
		
	}
	
	public static void clearScreen()		//doesn't work, I hate java
	{  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	}  
	
	public void newWave(Player player)
	{
		
		player.resetMap();
		System.out.println("You have completed wave" + (player.getWaveCount()));  
		System.out.println("Starting wave" + (player.getWaveCount() + 1));  
		
		setXCoor(1);
		setYCoor(1);
		
	}
	
	
	
	
	
	public static void main(String[] args) 								//to remove
	{
		
		
		Player testWarrior = new Player("Bob", 1);
		
		MapMenu playerMap = new MapMenu(testWarrior);
				
		boolean dog = true;
		
		while(dog == true)
		{
			
			playerMap.movement(testWarrior);
			
			
		}
		
		
		
		
		
		
		
		//System.out.print("\033[H\033[2J");  
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
