Word

```
public class Word
{
	private String word;
   private static String vowels = "AEIOUaeiou";   

   public Word()
	{
		word = ""; 
	}
	
	public Word(String wrd)
	{
		word = wrd; 
	}

	public void setWord(String wrd)
	{
		word = wrd; 
	}

	public int getVowels()
	{
		int count = 0;
		boolean check; 

		for (int i = 0; i < word.length(); i++)
		{
			check = (vowels.indexOf(word.charAt(i)) != -1); 
			if (check == true)
			{
				count++; 
			}
		}

		return count;
	}
	
   public int getLength()
	{
		return word.length(); 
	}

   public String toString()
	{
	   return ""+word;
	}
}
```
