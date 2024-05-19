Sound

```
public class Sound
{
	private int[] samples;
	
   public Sound( int[] vals )
	{
		samples = vals; 
	}
	
	public int limitAmplitude(int limit)
	{	
		int t_change = 0; 
		int buffer = samples.length; 

		for (int i = 0; i < buffer; i++)
			{
				if (samples[i] > limit)
				{
					samples[i] = limit; 
					t_change++; 
				}
				else if (samples[i] < -limit)
				{
					samples[i] = -limit; 
					t_change++; 
				}
				else
				{
					continue; 
				}
			}
		return t_change; 
	}
	
	public void trimSilenceFromBeginning()
	{
		int index = 0; 
		int buffer = samples.length; 

		while (samples[index] == 0)
		{
			index++; 
		}

		int[] n_array = new int[buffer-index];
		for (int k = 0; k < n_array.length; k++)
		{
			n_array[k] = samples[k+index]; 
		}
		samples = n_array;
	}
	
	public String toString()
	{
		String s = "";

		for (int i : samples)
		{
			s += i + " "; 
		}
		return s;
	}
}
```
