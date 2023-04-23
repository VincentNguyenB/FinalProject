
import java.util.Scanner;

public class MapMenu {

	
	private int xCoor = 0;
	private int yCoor = 0;
	
	private int difficulty = 1;
	
	private int mapWidth = 3;
	private int mapLength = 3;
	
	//-------------------------------
	
	MapMenu(Player player)
	{
		setXCoor(0);
		setYCoor(0);
		
		if(player.getDifficulty() == 1)
		{
			setMapWidth(3);
			setMapLength(3);
		}
		else if(player.getDifficulty() == 2)
		{
			setMapWidth(4);
			setMapLength(4);
		}
		else if(player.getDifficulty() == 3)
		{
			setMapWidth(5);
			setMapLength(5);
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
	
	public void movement()
	{
		System.out.println("enter in the direction you wish to travel to");
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		
				
		System.out.println("You start off at position (0,0)");
		
		
		
		
		
		
		
		//System.out.print("\033[H\033[2J");  
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
