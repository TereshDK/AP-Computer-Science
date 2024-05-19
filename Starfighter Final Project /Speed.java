Speed

```
import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class Speed extends MovingThing 
{
	private int speed;
	private Image image;

	public Speed() 
	{
		this(10, 10, 10, 10, 0);

		try {
			URL url = getClass().getResource("Speed.jpg");
			image = ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("Exception caught: " + e);
		}
	}

	public Speed(int x, int y) 
	{
		super(x, y);
		speed = 0;

		try {
			URL url = getClass().getResource("Speed.jpg");
			image = ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("Exception caught: " + e);
		}
	}

	public Speed(int x, int y, int s) 
	{
		super(x, y);
		speed = s;

		try {
			URL url = getClass().getResource("Speed.jpg");
			image = ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("Exception caught: " + e);
		}
	}

	public Speed(int x, int y, int w, int h, int s) 
	{
		super(x, y, w, h);
		speed = s;
		
		try {
			URL url = getClass().getResource("Speed.jpg");
			image = ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("Exception caught: " + e);
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

	public int getPowerType() 
	{
		return 1;
	}

	public void draw(Graphics window) 
	{
		window.drawImage(image, getX(), getY(), getWidth(), getHeight(), null);
	}

	public void move(String direction) 
	{
		if (direction.equals("DOWN"))
		{
			setY(getY() + speed);
		}
	}

	public String toString() 
	{
		return super.toString() + getSpeed();
	}
}
```
