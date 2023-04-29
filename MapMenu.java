
//import java.io.IOException;
import java.util.Scanner;

public class MapMenu {

	
	private int xCoor = 1;
	private int yCoor = 1;
	
	private int difficulty = 1;
	
	private int mapWidth = 3;
	private int mapLength = 3;
	
	//-------------------------------
	
	MapMenu(Player player)
	{
		setXCoor(1);
		setYCoor(1);
		
		
		switch(player.getDifficulty())
		{
			case 1:
			{
				setMapWidth(3);
				setMapLength(3);
				System.out.println("Generated map is a 3x3 grid \n");
				movementMessage();
				
				break;
			}
			case 2:
			{
				setMapWidth(4);
				setMapLength(4);
				System.out.println("Generated map is a 4x4 grid \n");
				movementMessage();
				
				break;
			}
			case 3:
			{
				setMapWidth(5);
				setMapLength(5);
				System.out.println("Generated map is a 5x5 grid \n");
				movementMessage();
				
				break;
			}
			default:
			{
				
			}
		
			//movementMessage();
		
		}
		
		
		
	}
	
	
	
	
	
	
	//-------------------------------
	
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
	
	public void createMap()
	{
		
		
		
		
	}
	
	public void movement(Player player)
	{
		
		String direction = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter in the direction you wish to travel to. \n");
		System.out.println("-North ");
		System.out.println("-South ");
		System.out.println("-East ");
		System.out.println("-West ");
		
		direction = scan.next();
		
		//clearScreen();
		
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
				System.out.println("huh ? \n");
			}
		
		}
		
		
		movementMessage();
		
		//scan.close();
		
	}
	
	
	public boolean checkWall(int value, Player player)
	{
		
		
		if(value <= 0 || value > getMapWidth() || value > getMapLength())
		{
			System.out.println("You've hit a wall, idiot. \n");
			System.out.println("You've taken 5 damage. \n");
			
			player.setCurrentHealth(player.getCurrentHealth() - 5);
			
			return true;
		}
		
		
		return false;
		
	}
	
	public void movementMessage()
	{
		
		System.out.println("You are now at coordinate (" 
							+ getXCoor() + ", " 
							+ getYCoor() + ").");

		
	}
	
	public static void clearScreen()
	{  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	}  
	
	
	
	
	
	public static void main(String[] args) 
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
