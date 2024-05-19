Bullets

```
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class Bullets
{
	private List<Ammo> ammo;

	public Bullets()
	{
    //initalize ammo
		ammo = new ArrayList<Ammo>();
	}

	public void add(Ammo al)
	{
    //add al to list
		ammo.add(al);
	}

	public void drawAll( Graphics window )
	{
    //draw each ammo in the list
		for (Ammo drawBullets : ammo)
		{ drawBullets.draw(window); }
	}

	public void moveAll()
	{
    //move each ammon in the list
		for (Ammo moveBullets : ammo)
		{ moveBullets.move("UP"); } 
	}
	
	public void cleanUp()
	{
    //for every ammo in the list
    //if the ammo is out of bounds
    //remove it
		for (int j = ammo.size()-1; j >= 0; j--)
		{
			if (ammo.get(j).getY() < 0)
			{ ammo.remove(j); }
		}
	}

	public List<Ammo> getList()
	{
		return ammo;
  }

	public String toString()
	{
		return "" + ammo;
	}
}
```
