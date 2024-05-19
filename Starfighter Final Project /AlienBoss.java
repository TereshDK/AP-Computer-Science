Alien Boss

```
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienBoss
{
	private List<Boss> alienBoss;
	private int size;

	public AlienBoss(int size)
	{
		alienBoss = new ArrayList<Boss>();
		this.size = size; 
	}

	public void add(Boss boss)
	{ 
		for (int j = 0; j < size; j++)
		{ alienBoss.add(boss); }
	}

	public void drawAll( Graphics window )
	{
		for (Boss boss : alienBoss)
		{ boss.draw(window); }
	}

	public void moveAll()
	{
		for (Boss boss : alienBoss)
		{ boss.move("SIDE"); }
	}
	
	public boolean isCollision(Ship ship) 
	{
		for (int j = 0; j < alienBoss.size(); j++)
		{
			Boss boss = alienBoss.get(j);
			if (((ship.getX() <= boss.getX() + boss.getWidth()) && (ship.getX() + 8 >= boss.getX())) &&
				((ship.getY() <= boss.getY() + boss.getHeight()) && (ship.getY() - 8 >= boss.getY()))) 
			{
				return true;
			}
		}
		return false;
	}

	public void removeBoss()
	{
	  for (int j = alienBoss.size()-1; j >= 0; j--)
		{
			alienBoss.remove(j);
		}
	}
	
	public Boss getBoss()
	{
		return alienBoss.get(0);
	}

	public String toString()
	{
		return "" + alienBoss;
	}
}
```
