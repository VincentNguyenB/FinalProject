import java.util.Comparator;

public class SpeedComparator implements Comparator<Unit> {


	
	public int compare(Unit a, Unit b)
	{
		//int com = 0;
		
		if(a.getSpeed() > b.getSpeed())
		{
			return 1;
		}
		else if(a.getSpeed() < b.getSpeed())
		{
			return -1;
		}
		
		return 0;
		
	}
	


	public int compareTo(Unit o) {
		// TODO Auto-generated method stub
		return 0;
	}

	

	
	
	
}
