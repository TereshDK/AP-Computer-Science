Speed Boost

```
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class SpeedBoost 
{
	private List<Speed> speedBoost;

	public SpeedBoost() 
	{
		speedBoost = new ArrayList<Speed>();
	}
	
	public void add(Speed speedObj) 
	{
		speedBoost.add(speedObj);
	}

	public void drawAll(Graphics window) 
	{
		for (Speed speedObj : speedBoost)
		{
			speedObj.draw(window);
		}
	}

	public void moveAll() 
	{
		for (Speed speedObj : speedBoost) 
		{
			speedObj.move("DOWN");
		}
	}

	public void cleanUp() 
	{
		for (int j = speedBoost.size() - 1; j >= 0; j--) 
		{
			if (speedBoost.get(j).getY() > 620) 
			{
				speedBoost.remove(j);
			}
		}
	}

	public int collectSpeedPower(Ship ship) 
	{
		for (int j = speedBoost.size() - 1; j >= 0; j--) 
		{
			Speed sb = speedBoost.get(j);
			if (Math.abs(sb.getX() - ship.getX()) < 46 && Math.abs(sb.getY() - ship.getY()) < 46) 
			{
				ship.setSpeed(2);
				speedBoost.remove(j);
				return sb.getPowerType();
			}
		}
		return -1;
	}

	public List<Speed> getList()
	{
		return speedBoost;
	}
	
	public String toString() 
	{
		return "" + speedBoost;
	}
}
```
