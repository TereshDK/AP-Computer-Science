Beamed

```
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class Beamed
{
	private List<Beam> beam;

	public Beamed()
	{
      beam = new ArrayList<Beam>();
	}

	public void add(Beam b)
	{
    beam.add(b);
	}

	public void drawAll( Graphics window )
	{
      for(Beam b : beam)
			{
        b.draw(window);
      }
	}

	public void moveAll()
	{
     for(Beam b : beam)
		 {
        b.move("DOWN");
    	}
	}

	public void cleanUp()
	{
    for(int j = beam.size()-1; j >= 0; j--)
		{
      if (beam.get(j).getY() > 600)
			{
        beam.remove(j);
      }
    }
	}
	
	public List<Beam> getList()
	{
		return beam;
   }

	public String toString()
	{
		return "" + beam;
	}
}
```
