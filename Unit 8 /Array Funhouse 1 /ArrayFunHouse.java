Array Funhouse

```
import java.util.Arrays;
public class ArrayFunHouse
{
	public static int getTotal(int[] numArray, int start, int stop)
	{
		int total = 0; 
		
		for (int obj = start; (obj <= stop) && (obj < numArray.length); obj++)
		{
			total += numArray[obj]; 
		}
		
		return total; 
	}

	public static int getCount(int[] numArray, int val)
	{
		int count = 0;
		for (int obj : numArray) 
		{
			if (obj == val) 
			{
				count++;
			}
		}
		return count;
	}
   
   public static int[] removeVal(int[] nArray, int val)
	{
		int n_buffer = nArray.length - getCount(nArray, val); 
		int[] copy = new int[n_buffer];

		int next = 0; 
		for (int obj = 0; obj < nArray.length; obj++)
		{
			if (nArray[obj] != val)
			{
				copy[next] = nArray[obj]; 
				next++; 
			}
		}
		return copy; 
	}
}
```
