Lives

```
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class Lives
{
	private List<Life> t_lives;
	private int lifeSize;
	private int hitSize;
	
	public Lives(int size) 
	{
		hitSize = 0;
		lifeSize = size;
		t_lives = new ArrayList<Life>();
		
		for (int j = 0; j < lifeSize; j++) 
		{ t_lives.add(new Life((78 * j) + 20, 520, 40, 40, 0)); }
	}

	public void add(Life life) 
	{
		t_lives.add(life);
	}

	public void restore() 
	{
		boolean allLives = true;
		for (Life life : t_lives) {
			if (life.checkForLife() == false) 
			{
				allLives = false;
				life.restoreLife();
				break;
			}
		}
		if (allLives == true) 
		{
			Life life = t_lives.get(t_lives.size() - 1);
			t_lives.add(new Life(life.getX() + 78, 520, 40, 40, 0));
		}
		lifeSize++;
	}

	public Life findBrokenLife() 
	{
		for (int j = t_lives.size() - 1; j >= 0; j--) 
		{
			Life life = t_lives.get(j);
			if (life.checkForLife() == true) 
			{
				return life;
			}
		}
		return null;
	}

	public void drawAll(Graphics window) 
	{
		for (Life life : t_lives) 
		{
			life.draw(window);
		}
	}

	public int getLives() 
	{
		return lifeSize - hitSize;
	}

	public void removeALife() 
	{
		hitSize++;
		findBrokenLife().lifeLost();
	}

	public String toString() {
		return "" + t_lives;
	}
}
```
