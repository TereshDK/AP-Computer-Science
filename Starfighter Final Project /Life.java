Life

```
import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.lang.Math;

public class Life extends MovingThing 
{
	private int speed = 0;	
	private Image image;
	private boolean checkLife;

	public Life() 
	{
		this(0, 0, 30, 30, 0);
		checkLife = true;
			
		try {
			URL url = getClass().getResource("heart.jpg");
			image = ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}

	public Life(int x, int y) 
	{
		super(x, y);
		checkLife = true;
		speed = 0;

		try {
			URL url = getClass().getResource("heart.jpg");
			image = ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}

	public Life(int x, int y, int s) 
	{
		super(x, y);
		checkLife = true;
		speed = s;

		try {
			URL url = getClass().getResource("heart.jpg");
			image = ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}

	public Life(int x, int y, int w, int h, int s) 
	{
		super(x, y, w, h);
		checkLife = true;
		speed = s;
	
		try {
			URL url = getClass().getResource("heart.jpg");
			image = ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
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
		if (direction.equals("DOWN")) 
		{
			setX(getX() + speed);
		}
		if (getX() > 770 || getX() < 0) 
		{
			speed *= -1;
			setY(getY() + 40);
		}
	}
	
	public void lifeLost() 
	{
		checkLife = false;
		
		try {
			URL url = getClass().getResource("blackBackground.jpg");
			image = ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("Excpeption: " + e);
		}
	}

	public void restoreLife() 
	{
		checkLife = true;
		
		try {
			URL url = getClass().getResource("heart.jpg");
			image = ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}

	public boolean checkForLife() 
	{
		return checkLife;
	}

	public void draw(Graphics window) 
	{
		window.drawImage(image, getX(), getY(), getWidth(), getHeight(), null);
	}

	public String toString() 
	{
		return super.toString() + "";
	}
}
```
