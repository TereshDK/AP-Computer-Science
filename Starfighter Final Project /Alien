Alien

```
import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing
{
	private int speed;
	private Image image;

	public Alien()
	{
		this(0,0,30,30,0);

		try { URL url = getClass().getResource("alien.jpg"); image = ImageIO.read(url); }
		catch(Exception e) { System.out.println("Exception caught: " + e); }
	}

	public Alien(int x, int y)
	{
		//add code here
		super(x, y);
		speed = 0;

		try { URL url = getClass().getResource("alien.jpg"); image = ImageIO.read(url); }
		catch(Exception e) { System.out.println("Exception caught: " + e); }
	}

	public Alien(int x, int y, int s)
	{
		//add code here
		super(x, y);
		speed = s;

		try { URL url = getClass().getResource("alien.jpg"); image = ImageIO.read(url); }
		catch(Exception e) { System.out.println("Exception caught: " + e); }
	}

	public Alien(int x, int y, int w, int h, int s)
	{
		//add code here
		super(x, y, w, h);
		speed = s;
		
    try { URL url = getClass().getResource("alien.jpg"); image = ImageIO.read(url); }
		catch(Exception e) { System.out.println("Exception caught: " + e); }
	}

	public void setSpeed(int s)
	{
	   //add code
		speed = s;
	}

	public int getSpeed()
	{
	   //add code
		return speed;
	}

   public void move(String direction)
	{
	   //add code here
      //check that the alien is within the bounds of the screen (see Starfighter.java)
      //if alien is out of bounds change speed direction
      //and move the alien down a  row (40 pixels)
      //constantly change the x position of the alien by the speed
    if (direction.equals("DOWN"))
		{
    	setX(getX() + speed);
    }
		
    if ((getX() < 0) || (getX() > 770))
		{
			setY(getY() + 40);
      speed = -speed;
    }

	}
   
   /* The draw method is done for  you.
   This method will move the alien and update it's location on screen by
   constantly redrawing it. 
   */
	public void draw( Graphics window )
	{
   	move("DOWN");
    window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() + getSpeed();
  }
}
```
