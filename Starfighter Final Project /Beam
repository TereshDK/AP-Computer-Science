Beam

```
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Beam extends MovingThing
{
	private int speed;

	public Beam()
	{
		this(10,10,10,10,0);
	}

	public Beam(int x, int y)
	{
		super(x,y);
    speed = 0;
	}

	public Beam(int x, int y, int s)
	{
		super(x,y);
    speed = s;
	}
   
   public Beam(int x, int y, int w, int h, int s)
	{
    super(x,y,w,h);
    speed = s;
   }

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
   }

	public void draw( Graphics window )
	{   
    window.fillRect(getX(),getY(),getWidth(),getHeight());
	  window.setColor(Color.GREEN);   
	}
	
	
	public void move( String direction )
	{
  	if (direction.equals("DOWN"))
		{
			setY(getY() + speed);
		}
	}

	public boolean isCollision(Ship ship) 
	{
		if (((getX() <= ship.getX() + ship.getWidth()) && (getX() + 10 >= ship.getX())) &&
				((getY() <= ship.getY() + ship.getHeight()) && (getY() - 10 >= ship.getY()))) 
		{
			return true;
		}
		return false;
	}
	

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
```
