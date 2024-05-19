Alien Horde

```
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
    //initalize ArrayList
    //and fill with size amount of aliens (75 pixels apart) 
    //if your row is full (out of bounds of screen)
    //move down a row (75 pixels)
    //starting point is 25, 50
    //first add aliens with speed of 0 to make sure you spacing is good
		aliens = new ArrayList<Alien>(); 
		int x = 25;
		int y = 50;

		for (int j = 0; j < size; j++)
		{
			aliens.add(new Alien(x, y, 30, 30, 1));
			x += 75;
			if (x >= 770)
			{
				x = 25;
				y += 75;
			}
		}
		
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawAll( Graphics window )
	{
    //make sure you draw all aliens in the list 
		for (Alien drawAlien : aliens)
		{ drawAlien.draw(window); }
	}

	public void moveAll()
	{
    //make sure you move all aliens in the list 
		for (Alien moveAlien : aliens)
		{ moveAlien.move("DOWN"); }
	}

  public void removeDeadOnes(List<Ammo> shots)
	{
    //Part 3
    //for every shot in the list
    //check if you've hit any alien in the list
    //(do the coordinates of the shot fall between the boundarises of the alien)
    //if they do then remove the alien and the shot
    //make sure you break out of the loop if this happens
		
		boolean check = false;
		
    for (int j = shots.size()-1; j >= 0; j--)
		{
    	for (int k = 0; k < aliens.size(); k++)
			{
        if (shots.get(j).isCollision(aliens.get(k)))
				{
          aliens.remove(k);
					check = true;
          break;
        }
    }
    	if( check == true)
			{
        shots.remove(j);
				check = false;
      }
		}
		//
	}

	// check if alien crossed border
	public boolean alienInvasion() 
	{
		for (Alien alien : aliens) 
		{
			if (alien.getY() > 650) 
			{
				return true;
			}
		}
		return false;
	}
	
	public int isLifeLost(Ship ship)
	{
    for(int j = aliens.size()-1; j >= 0; j--)
		{
    	if ((Math.abs(aliens.get(j).getX() - ship.getX()) < 25) && 
					(Math.abs(aliens.get(j).getY() - ship.getY()) < 25))
			{
        return -1;
      }
  	}
   	return 0; 
	}

	public boolean isCollision(Ship ship) 
	{
		for (int j = 0; j < aliens.size(); j++)
		{
			Alien alien = aliens.get(j);
			if (((ship.getX() <= alien.getX() + alien.getWidth()) && (ship.getX() + 8 >= alien.getX())) &&
				((ship.getY() <= alien.getY() + alien.getHeight()) && (ship.getY() - 8 >= alien.getY()))) 
			{
				return true;
			}
		}
		return false;
	}

	public void removeAllAliens()
	{
	  for (int j = aliens.size()-1; j >= 0; j--)
		{
			aliens.remove(j);
		}
	}

	public Alien getRandAlien()
	{
		// 0 <---> alienSize-1
		int rand = (int)(Math.random() * aliens.size()); 
		return aliens.get(rand);
	}

	public List<Alien> getList()
	{
		return aliens;
	}
	
	public String toString()
	{
		return "" + aliens;
	}
}
```
