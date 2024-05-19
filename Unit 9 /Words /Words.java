Words

```
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Words
{
	private ArrayList<Word> words = new ArrayList<Word>();

	public Words()
	{
  	setWords("");
	}

	public Words(String wordList)
	{
		setWords(wordList); 
	}
    
   public void setWords(String wordList)
	{
		Word obj = new Word(); 
		String[] arr = wordList.split(" "); 
		for (String item : arr)
		{
			obj = new Word(item); 
			words.add(obj); 
		}
	}

	public int countWordsWithXChars(int size)
	{
		int count = 0;

		for (int i = 0; i < words.size(); i++)
		{
			if (words.get(i).getLength() == size)
			{
				count++; 
			}
		}

		return count;
	}
	
	public int removeWordsWithXChars(int size)
	{
		int total = 0; 
		for (int i = words.size() - 1; i >= 0; i--)
		{
			if (words.get(i).getLength() == size)
			{
				total += words.get(i).getVowels(); 
				words.remove(i); 
			}
		}
		
		return total;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;

		for (int i = 0; i < words.size(); i++)
		{
			if (words.get(i).getVowels() == numVowels)
			{
				count++; 
			}
		}

		return count;
	}
	
	public String toString()
	{
	   return ""+words;
	}
}
```
