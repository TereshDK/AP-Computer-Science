Boss

```
import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Boss extends MovingThing
{
	private int speed;
	private Image image;

	public Boss()
	{
		this(0,0,30,30,0);

		try { URL url = getClass().getResource("boss.jpg"); image = ImageIO.read(url); }
		catch(Exception e) { System.out.println("Exception caught: " + e); }
	}

	public Boss(int x, int y)
	{
		//add code here
		super(x, y);
		speed = 0;

		try { URL url = getClass().getResource("boss.jpg"); image = ImageIO.read(url); }
		catch(Exception e) { System.out.println("Exception caught: " + e); }
	}

	public Boss(int x, int y, int s)
	{
		//add code here
		super(x, y);
		speed = s;

		try { URL url = getClass().getResource("boss.jpg"); image = ImageIO.read(url); }
		catch(Exception e) { System.out.println("Exception caught: " + e); }
	}

	public Boss(int x, int y, int w, int h, int s)
	{
		//add code here
		super(x, y, w, h);
		speed = s;
		
    try { URL url = getClass().getResource("boss.jpg"); image = ImageIO.read(url); }
		catch(Exception e) { System.out.println("Exception caught: " + e); }
	}

	public void setSpeed(int s)
	{
		speed = s;
	}

	public int getSpeed()
	{
		return speed;
	}

   public void move(String direction)
	{
		if (direction.equals("SIDE"))
		{
			if (getX() < 0)
			{ setX(getX() + speed); }
			
			if (getX() > 770)
			{ setX(getX() - speed); }
		}
	}
   
	public void draw( Graphics window )
	{
   window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() + getSpeed();
  }
}
```
