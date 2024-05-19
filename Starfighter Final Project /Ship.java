Ship

```
import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;

	public Ship()
	{
		this(0,0,50,50,0);

		try { URL url = getClass().getResource("ship.jpg"); image = ImageIO.read(url); } 
		catch(Exception e) { System.out.println("Exception caught: " + e); }
	}

	public Ship(int x, int y)
	{
	   //add code here
		super(x, y);
		speed = 0;

		try { URL url = getClass().getResource("ship.jpg"); image = ImageIO.read(url); } 
		catch(Exception e) { System.out.println("Exception caught: " + e); }
	}

	public Ship(int x, int y, int s)
	{
	   //add code here
		super(x, y);
		speed = s;

		try { URL url = getClass().getResource("ship.jpg"); image = ImageIO.read(url); } 
		catch(Exception e) { System.out.println("Exception caught: " + e); }
	}

	public Ship(int x, int y, int w, int h, int s)
	{
		//add code here
		super(x, y, w, h);
		speed = s; 
		
		try { URL url = getClass().getResource("ship.jpg"); image = ImageIO.read(url); } 
		catch(Exception e) { System.out.println("Exception caught: " + e); }
	}

	public void setSpeed(int s)
	{
	   //add more code
		speed = s;
	}

	public int getSpeed()
	{
	   //continue coding
  	return speed;
	}
	
	public void move(String direction)
	{
		//add code here
    //think about ALL your global variables and how you can use them to "move"
    //keep your parameter in mind as well
		if ((direction.equals("LEFT")) && (getX() > 1))
		{ setX(getX() - speed); }

		if ((direction.equals("RIGHT")) && (getX() < 750))
		{ setX(getX() + speed); }

		if (direction.equals("UP"))
		{ setY(getY() + speed); }

		if (direction.equals("DOWN"))
		{ setY(getY() - speed); }
	}

	public void changeBackground() 
	{
		try {
			URL url = getClass().getResource("blackBackground.jpg");
			image = ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}

	// change to flicker when damage || touching alien
	public void changeToFlicker() 
	{
		try {
			URL url = getClass().getResource("flicker.jpg");
			image = ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}

	// change back to default ship
	public void changeToDefault() 
	{
		try {
			URL url = getClass().getResource("ship.jpg");
			image = ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}

	// Part of a PowerUp
	public void upgradeShip() 
	{	
		try {
			URL url = getClass().getResource("shipUpgrade.jpg");
			image = ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}

	public boolean isShipBeamed(List<Beam> beam, Lives lives, Graphics window)
	{
		boolean check = false; 
    for (int j = beam.size()-1; j >= 0; j--)
		{
      if ((Math.abs(getX() - beam.get(j).getX()) < 50) && (Math.abs(getY() - beam.get(j).getY()) <50))
			{
       	beam.remove(j);
				lives.removeALife();
				return true;
      }
    }	
		return false;
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() + " " + getSpeed();
	}
}
```
