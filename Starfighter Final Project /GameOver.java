GameOver

```
import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.lang.Math;
public class GameOver extends MovingThing
{
	private int speed;
	private Image image;

	public GameOver()
	{
		this(0,0,30,30);

		try {
			URL url = getClass().getResource("gameOver.jpg");
			image = ImageIO.read(url);
		} catch(Exception e) {
			System.out.println("Exception caught: " + e);
		}
	}

	public GameOver(int x, int y)
	{
		super(x,y);
    speed = 0;

		try {
			URL url = getClass().getResource("gameOver.jpg");
			image = ImageIO.read(url);
		} catch(Exception e) {
			System.out.println("Exception caught: " + e);
		}
	}

	public GameOver(int x, int y, int s)
	{
		super(x,y);
    speed = s;

		try {
			URL url = getClass().getResource("gameOver.jpg");
			image = ImageIO.read(url);
		} catch(Exception e) {
			System.out.println("Exception caught: " + e);
		}
	}

	public GameOver(int x, int y, int w, int h)
	{
		super(x,y,w,h);
    speed = 0;
		
    try {
			URL url = getClass().getResource("gameOver.jpg");
			image = ImageIO.read(url);
		} catch(Exception e) {
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

   public void move(String direction)
	{
    if (direction.equals("DOWN"))
		{
      setX(getX() + speed);
    }
		
    if ((getX() > 770) || (getX() < 0))
		{
      speed *= -1;
      setY(getY()+40);
    }
	}

	public void draw( Graphics window )
	{
      window.drawImage(image,getX(), getY(), getWidth(), getHeight(), null);
	}

	public String toString()
	{
		return super.toString() + getSpeed();
   }
}
```
