Doggies

```
import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		pups = new Dog[size]; 
	}
	
	public void set(int spot, int age, String name)
	{	
		Dog obj = new Dog(age, name); 
		if (spot < pups.length)
		{
			pups[spot] = obj; 	
		}
	}

	public String getNameOfOldest()
	{
   	String name = "";
		for (int k = 1; k < pups.length; k++)
		{
			if (pups[k-1].getAge() < pups[k].getAge())
			{
				name = pups[k].getName(); 
			}
			else
			{
				name = pups[k-1].getName(); 
			}
		}
		return name; 
	}
 
  public String getNameOfYoungest()
	{
		String name = ""; 
		for (int k = 1; k < pups.length; k++)
		{
			if (pups[k-1].getAge() > pups[k].getAge())
			{
				name = pups[k].getName(); 
			}
			else
			{
				name = pups[k-1].getName(); 
			}
		}
		return name; 
	}

   //this method is done for  you
	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}
```
