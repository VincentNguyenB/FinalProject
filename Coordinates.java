
//import java.util.Random;

public class Coordinates{

	
	private int xPos = 0;
	private int yPos = 0;
	
	
	
	
	public Coordinates()				//empty spaces except (1,1)
	{
		setX(0);
		setY(0);
		
	}
	
	public Coordinates(int x, int y)	//designated space
	{
		setX(x);
		setY(y);
		
	}
	
	public void setX(int x)
	{
		xPos = x;
	}
	
	public void setY(int y)
	{
		yPos = y;
	}
	
	public int getX()
	{
		return xPos;
	}
	
	public int getY()
	{
		return yPos;
	}
	
	
	public static void main(String[] args) 
	{
		
		
	}

	
	
	
	
	
	
}
