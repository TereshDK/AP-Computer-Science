Letter Count

```
public class LetterCount
{
	private String[] wordRay;

	public LetterCount(String[] sent)
	{
		wordRay = sent; 
	}

	public int countWords( int value )
	{
		int count = 0; 
		for (String k : wordRay)
		{
			if (k.length() > value)
			{
				count++; 
			}
		}
		return count; 
  }
   
   public String toString( )
	{
		String store = ""; 
		for (String k : wordRay)
		{
			store += k + " ";
		}
		return store; 
  }
}
```
