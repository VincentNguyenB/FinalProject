//import java.util.LinkedList;
import java.util.*;

public class BattleMenu implements Comparator<Unit> {

	
	
	
	BattleMenu()
	{
		
	}
	
	public void encounter(Player player)					//use this to initiate fight
	{
		
		
		//Enemy[] enemyEncounter = generateEnemy(player);		//generates 1-3 enemies
		Enemy[] enemyEncounter = generateEnemySingle(player);
		
		
		battleOrder(player, enemyEncounter);				//starts order
		
		
	}
	
	public Enemy[] generateEnemySingle(Player player)
	{
		Enemy e1 = new Enemy("Enemy A", player.getDifficulty());
		
		Enemy[] enemyWave = {e1};
		return enemyWave;
		
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
		
		//boolean cat = true;
		int wholeRound = 1;
		
		turnOrder.offer(player);				//establish initial order 
		for(int i = 0; i < e.length; i++)
		{
			turnOrder.offer(e[i]);
			wholeRound++;						//counts everyone who will get a turn in a single round.
		}
		
		
		//singles
		while(wholeRound != 1)					
		{
			int currentwholeRound = wholeRound;
			
			for(int j = 0; j < currentwholeRound; j++)
			{
				
				if(turnOrder.peek() == player)
				{
					turnOrder.poll();
					playerAction(player, e);
					
					if(player.getCurrentHealth() > 0)
					{
						//turnOrder.offer(player);
						
					}
					else
					{
						player.gameOver();
						
					}
					
				}
				else
				{
					turnOrder.poll();
					enemyAction(player, e);
					
					if(e[0].getCurrentHealth() > 0)
					{
						//turnOrder.offer(e[0]);
					}
					else
					{
						System.out.println(e[0].getName() + " has been defeated!");
						
						System.out.println(player.getName() + " obtained " + e[0].getGold() + " gold.");
						System.out.println(player.getName() + " obtained " + e[0].getExperience() + " exp.");
						
						player.setExperience(player.getExperience() + e[0].getExperience());
						player.setGold(player.getGold() + e[0].getGold());
						
						wholeRound--;
					}
					
				}
				
				
			}			//end of for loop
			
			turnOrder.offer(player);				//establish initial order 
			for(int i = 0; i < e.length; i++)
			{
				turnOrder.offer(e[i]);
			}
			
			
		}	//end of wholeRound while loop
		
		
		
		
		
				
		
	}
	
	public void playerAction(Player player, Enemy ...e)
	{
		
		int option = 0;														//holds input
		Scanner scan = new Scanner(System.in);								//reads input
		
		
		System.out.println("Health: " + player.getCurrentHealth() 
									+ "/" + player.getMaxHealth());
		System.out.println("Mana: " + player.getCurrentMana() 
		+ "/" + player.getMaxMana() + "\n \n");
		
		System.out.println(e[0].getName() + "'s Health: " + e[0].getCurrentHealth() 
		+ "/" + e[0].getMaxHealth());
		
		System.out.println("Select action:");
		System.out.println("1) Attack (" + player.getAccuracy() + " % accuracy)");
		
		option = scan.nextInt();
		
		switch(option)
		{
			case 1:
			{
				
				attack(player, e);
				break;
			}
			case 2:
			{
				
				//items method
				break;
			}
			case 3:
			{
				
				//spells method
				break;
			}
			case 4:
			{
				
				//run method
			}

		}
		
		
	}
	
	public void attack(Player attacker, Enemy...defender )
	{
		
		int die = (int) ((Math.random() * (100 - 1) + 1));
		
		
		if(attacker.getAccuracy() >= die)
		{
			System.out.println(attacker.getName() + " dealt " + attacker.getAttack() + " damage to "
					+ defender[0].getName() + ".");
			defender[0].setCurrentHealth(defender[0].getCurrentHealth() - attacker.getAttack());
			
		}
		else
		{
			System.out.println(attacker.getName() + " missed!");
			
		}
		
	}
	
	public void enemyAttack(Player defender, Enemy...attacker )
	{
		
		int die = (int) ((Math.random() * (100 - 1) + 1));
		
		
		if(attacker[0].getAccuracy() >= die)
		{
			System.out.println(attacker[0].getName() + " dealt " + attacker[0].getAttack() + " damage to "
					+ defender.getName() + ".");
			defender.setCurrentHealth(defender.getCurrentHealth() - attacker[0].getAttack());
			
		}
		else
		{
			System.out.println(attacker[0].getName() + " missed!");
			
		}
		
	}
	
	
	public void enemyAction(Player player, Enemy ...e)
	{
		
		int die = (int) ((Math.random() * (6 - 1) + 1));
		
		if(die > 1)
		{
			enemyAttack(player, e);
		}
		else
		{
			System.out.println(e[0].getName() + " does nothing!");
		}
		
		
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
