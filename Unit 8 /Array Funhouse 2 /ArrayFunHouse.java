Array Funhouse

```
import java.lang.System;
import java.lang.Math;

public class ArrayFunHouseTwo
{
	public static boolean goingUp(int[] nArray)
	{
		int count = 0; 
		for (int obj = 1; obj < nArray.length; obj++)
		{
			if (nArray[obj-1] < nArray[obj])
			{
				count++; 
			}
		}
		if (count == nArray.length-1)
		{
			return true; 
		}
		return false; 
	}

	public static boolean goingDown(int[] nArray)
	{
	int count = 0; 
	for (int obj = 1; obj < nArray.length; obj++)
		{
			if (nArray[obj-1] > nArray[obj])
			{
				count++; 
			}
		}
		if (count == nArray.length-1)
		{
			return true; 
		}
		return false; 
	}
    
	public static int[] getCountValuesBiggerThanX(int[] nArray, int count, int x)
	{
	int[] sect = new int[count]; 
	int next = 0; 

	for (int obj = 0; (obj < nArray.length) && (next <= count); obj++)
		{
			if (nArray[obj] > x)
			{
				sect[next] = nArray[obj]; 
				next++;
				if (next == count)
				{
					break; 
				}
			}
		}
		return sect;
	}
}
```
