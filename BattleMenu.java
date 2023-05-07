//import java.util.LinkedList;
import java.util.*;

public class BattleMenu implements Comparator<Unit> {

	
	
	
	BattleMenu()
	{
		
	}
	
	public void encounter(Player player)
	{
		
		
		Enemy[] enemyEncounter = generateEnemy(player);		//generates 1-3 enemies
		
		battleOrder(player, enemyEncounter);				//starts order
		
		
	}
	
	public Enemy[] generateEnemy(Player player)
	{
		
		int die = (int) ((Math.random() * (6 - 1) + 1));
		
		if(die == 1 || die == 2 || die == 3)
		{
			Enemy e1 = new Enemy("Enemy A", player.getDifficulty());
			
			Enemy[] enemyWave = {e1};
			return enemyWave;
		}
		else if(die == 4 || die == 5)
		{
			Enemy e1 = new Enemy("Enemy A", player.getDifficulty());
			Enemy e2 = new Enemy("Enemy B", player.getDifficulty());
			
			Enemy[] enemyWave = {e1, e2};
			return enemyWave;
		}
		else if(die == 6)
		{
			Enemy e1 = new Enemy("Enemy A", player.getDifficulty());
			Enemy e2 = new Enemy("Enemy B", player.getDifficulty());
			Enemy e3 = new Enemy("Enemy C", player.getDifficulty());
			
			Enemy[] enemyWave = {e1, e2, e3};
			return enemyWave;
		}
		
		return null;
		
	}
	
	public void battleOrder(Player player, Enemy ...e )	//make varags
	{
		
		//Queue<Unit> turnOrder = new PriorityQueue<Unit>(Collections.reverseOrder());
		
		
		PriorityQueue<Unit> turnOrder = new PriorityQueue<Unit>(new SpeedComparator());
		//create comparator to compare speeds	
		
		
		turnOrder.offer(player);				//establish initial order 
		for(int i = 0; i <= e.length; i++)
		{
			turnOrder.offer(e[i]);
		}
		
		
				
		
	}
	
	public void playerAction(Player player, Enemy ...e)
	{
		
		int option = 0;														//holds input
		Scanner scan = new Scanner(System.in);								//reads input
		
		
		System.out.println("Health: " + player.getCurrentHealth() 
									+ "/" + player.getMaxHealth());
		System.out.println("Health: " + player.getCurrentMana() 
		+ "/" + player.getMaxMana() + "\n");
		
		System.out.println("Select action:");
		System.out.println("1) Attack (" + player.getAccuracy() + " % accuracy)");
		System.out.println("2) Items");
		System.out.println("3) Spells");
		System.out.println("4) Run");
		
		switch(option)
		{
			case 1:
			{
				
				
				break;
			}
			case 2:
			{
				
				
				break;
			}
			case 3:
			{
				
				
				break;
			}
			case 4:
			{
				
				
			}

		}
		
		
	}
	
	public void attack(Unit attacker, Unit defender)
	{
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	@Override
	public int compare(Unit o1, Unit o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	
	
	public static void main(String[] args) 
	{
		
		Player player = new Player("Hai", 1);
		BattleMenu fight = new BattleMenu();
		
		fight.encounter(player);
		
		
		
		
		
	}

	

	

	
	
	
}
