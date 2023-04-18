Title: Text-based Rpg

Ideas: 
  Text-based rather visual
  Only the player
  Random elements
  Enemies
  items/buffs
  Decisions 
  Save function
  Save items
  Save stats
  Inventory for items/heroes
  Level up:
    Every space is a random event or no event at all
  Object:
    Complete all the spaces based on difficulty
  Control:
    Console based on map

Reward system: Shop and lucky draws

MainMenu
CharacterCreationMenu
MapMenu
ShopMenu
BattleMenu







So our game consists of five different menus to interact with. First there’s the main menu where the player can start a new game and create their character or continue with an already existing file. Secondly we have the map menu where the player must move around the map to progress the game. The map consists of a grid where the player can choose one of four different directions to move and every time they do they will either find an item, fight enemies, or encounter an event that affects their stats. Third is the battle menu where the player must defeat the enemy or end the game if they lose. The fourth menu will be the options where the player can check their stats or their items or to save their game and exit. The fifth menu will be the shop where you can purchase items. The game will consist of moving spaces and surviving until a set amount of spaces is landed on in which the player will be rewarded every time, and every time they do the game becomes more difficult with stronger enemies and more bad events.
For Java classes, our game will have an abstract class called the Player. Then this Player class will have three concrete child classes for the warrior, mage, and archer class. We will also have an abstract class for the enemies to which every enemy in the game will have their own class. For reading and writing files, we will implement a save feature where the game save’s the progress of the player’s character as well as their stats and items. The random element in our game will be the enemies you encounter as well as the rewards you get for completing a map. Exception handling will occur in the save feature to make sure a file can be found. For data structures we will implement a queue in the battle system to determine the order in which you and the enemies take turns attacking each other. Whoever has the higher agility will attack first in the order. Each time an unit is out of the queue, it will be put back in line, unless the unit is dead in which case they won’t be out back in the queue anymore.

For the work each of us will do. One person will work on the map and the character creation while the other will work on the main menu and shop menu. Because of the complexity of the battle menu, both members will work on that together.













