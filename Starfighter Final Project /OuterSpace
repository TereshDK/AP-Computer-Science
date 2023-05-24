Outer Space

```
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	/* uncomment and comment as necessary as you add functionality to your project*/

	//private Alien alienOne;
	//private Alien alienTwo;

	// objects
	private Ship ship; 
	private AlienHorde horde;
	private Bullets bullets;
	private Lives lives; 
	private GameOver endGame; 
	private Beamed beamed; 
	private Alien alien;
	private SpeedBoost speedBoost;
	private AlienBoss alienBoss;
	private Boss boss;
	
	// 
	private boolean checkStatus;
	private boolean checkSpeed;
	private boolean isEndGame;
	private int cnt_shots;
	private int flicks;
	private int time; 
	
	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		// instance 
		keys 			 = new boolean[5];
		ship 			 = new Ship(600, 400, 50, 50, 1);
		horde 		 = new AlienHorde(20); 
		bullets		 = new Bullets();
		lives 		 = new Lives(4);
		beamed  	 = new Beamed();
		speedBoost = new SpeedBoost();
		alienBoss	 = new AlienBoss(1);
		boss 			 = new Boss(400, 100, 100, 100, 1);
		
		checkStatus = false;
		checkSpeed 	= false;
		isEndGame 	= false;
		cnt_shots = 0;
		time = 0;
		
		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }
   
	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shot of the current screen and save it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
    //this sets the background for the graphics window
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,getWidth(),getHeight());
		
		//add code to move Ship, Alien, etc.-- Part 1	
		if ((lives.getLives() >= 1) || (!(horde.alienInvasion())))
		{
    	if (keys[0] == true)
			{ ship.move("LEFT"); }
		
			if (keys[1] == true)
			{ ship.move("RIGHT"); }

			if (keys[3] == true)
			{ ship.move("UP"); }

			if (keys[2] == true)
			{ ship.move("DOWN"); }
		
			if (keys[4] == true) 
			{
				if (cnt_shots % 50 == 0) 
				{
				bullets.add(new Ammo(ship.getX() + 25, ship.getY(), 10, 10, 5));
				}
				cnt_shots++;
			}	
		}
      
	//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship -- Part 3
		horde.removeDeadOnes(bullets.getList()); 

		// check for collisions, activate ship flickering
		if ((horde.isCollision(ship)) || (ship.isShipBeamed(beamed.getList(), lives, graphToBack) == true) || alienBoss.isCollision(ship))
		{
			checkStatus = true;
		}
		
		int beamAtRand = (int)(Math.random() * 100);
		if ((beamAtRand == 13) && ((lives.getLives() > 0) || !(horde.alienInvasion())) && (horde.getList().size() > 0))
		{
			alien = horde.getRandAlien();
			beamed.add(new Beam(alien.getX(), alien.getY()-9, 10, 10, 1));
		}

		int getRandPower = (int)(Math.random() * 300);
		if ((getRandPower == 13) && ((lives.getLives() > 0) || !(horde.alienInvasion())) && (horde.getList().size() > 0))
		{
			speedBoost.add(new Speed(430, 300, 30, 30, 0));
		}

		if (speedBoost.collectSpeedPower(ship) != -1)
		{
			time++; 
			if (time == 700)
			{
				ship.setSpeed(1);
			}
		}
		
		if ((!horde.alienInvasion()) && (horde.getList().size() == 0) && (lives.getLives() > 0) && (time != 750))
		{
			time = 0;
			alienBoss.add(boss);
			beamAtRand = (int)(Math.random() * 100);
			if (beamAtRand == 13)
			{
				boss = alienBoss.getBoss();
				beamed.add(new Beam(boss.getX(), boss.getY()+boss.getWidth()+2, 15, 15, 1));
				beamed.add(new Beam(boss.getX()-5, boss.getY()+boss.getWidth()+2, 15, 15, 1));
				beamed.add(new Beam(boss.getX()+5, boss.getY()+boss.getWidth()+2, 15, 15, 1));
			}
		}
		
		// flickering
		if (checkStatus == true)
		{
			flicks++;
			if (flicks % 2 == 0)
			{
				ship.changeBackground();
				ship.draw(graphToBack);
			}

			if (flicks % 5 == 0)
			{
				ship.changeToFlicker();
				ship.draw(graphToBack);
			}

			if (flicks == 31)
			{
				ship.changeToDefault();
				ship.draw(graphToBack);
				checkStatus = false;
				flicks = 0;
			}
		}
	
		if ((lives.getLives() > 0) && (!(horde.alienInvasion()))) 
		{
			//horde.moveAll();
			//bullets.moveAll();
			//beamed.moveAll();
			//speedBoost.drawAll(graphToBack);
			//speedBoost.moveAll();

			// draw ship
			ship.draw(graphToBack);
			// draw alienHorde
			horde.drawAll(graphToBack); 
			horde.moveAll();
			// draw ship bullets 
			bullets.drawAll(graphToBack);
			bullets.moveAll(); 
			bullets.cleanUp();
			// draw lives
			lives.drawAll(graphToBack);
			// draw alien beam
			beamed.drawAll(graphToBack);
			beamed.moveAll();
			beamed.cleanUp();
			// draw speed power-up
			speedBoost.drawAll(graphToBack);
			speedBoost.moveAll();
			speedBoost.cleanUp();
			// draw alien boss
			alienBoss.drawAll(graphToBack);
			alienBoss.moveAll();
		} 
		else 
		{				
			endGame = new GameOver(300, 200, 230, 230);
				
			isEndGame = true;
			System.out.println("Game Over");

			bullets.cleanUp();
			beamed.cleanUp();
			
			horde.removeAllAliens();
			ship.changeBackground();
			ship.draw(graphToBack);
			lives.removeALife();
			
			if (isEndGame == true)
			{
				endGame.draw(graphToBack);
				
				keys[0] = false;
				keys[1] = false;
				keys[2] = false;
				keys[3] = false;
				keys[4] = false;
			}
		}

		/*
		// draw ship
		ship.draw(graphToBack);
		// draw alienHorde
		horde.drawAll(graphToBack); 
		horde.moveAll();
		// draw ship bullets 
		bullets.drawAll(graphToBack);
		bullets.moveAll(); 
		bullets.cleanUp();
		// draw lives
		lives.drawAll(graphToBack);
		// draw alien beam
		beamed.drawAll(graphToBack);
		beamed.moveAll();
		beamed.cleanUp();
		// draw speed power-up
		speedBoost.drawAll(graphToBack);
		speedBoost.moveAll();
		speedBoost.cleanUp();
		// draw alien boss
		alienBoss.drawAll(graphToBack);
		alienBoss.moveAll();
		*/
		
		twoDGraph.drawImage(back, null, 0, 0);
    back = null;
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			cnt_shots = 0;
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
      //method needs to be implemented 
      //because class implements KeyListner
	}

   public void run()
   {
   	try
   	{
   		while (true)
   		{
   		  Thread.currentThread();
				Thread.sleep(5);
        repaint();
      }
      } catch(Exception e)
      {
				System.out.println("Exception caught: " + e); 
      }
  	}
}
```
