Pig Latin Converter List

```
import java.util.ArrayList;
public class PigLatinConverterList
{
   private String myLine;

   public PigLatinConverterList(String str)
   { 
      myLine = str; 
		  pigLatin(); 
   }
   
   public boolean isVowel(String ch)
   { 
     String vowel = "aeiouAEIOU"; 
     boolean check = (vowel.indexOf(ch.charAt(0)) != -1) ? true : false; 
     return check; 
   }
	
   public String toPig(String word)
   { 
		  String pigWord; 
     String ch = ""+word.charAt(0); 
     
     if (!isVowel(ch))
     {
      pigWord = word.substring(1) + word.charAt(0) + "ay";
      return pigWord; 
     }
     else
     {
       pigWord = word + "yay";
       return pigWord; 
     }
   }

   private ArrayList<String> getLineWords()
   { 
    ArrayList<String> lst = new ArrayList<String>(); 
    myLine += " "; 
		int space = myLine.indexOf(" "); 

		while (space != -1)
		{
			lst.add(myLine.substring(0, space));
			myLine = myLine.substring(space + 1); 
			space = myLine.indexOf(" "); 
		}
		return lst;
   }

   public void pigLatin()
   {   
			String s = getLineWords().toString(); 
		 	s = s.substring(1, s.length()-1);
		  String[] arr = s.split(", "); 

		  String pigLine = ""; 
		 	for (String k : arr)
			{
				pigLine += toPig(k) + " ";  
			}
		 myLine = pigLine; 
   }
   
   public String toString()
   { 
     return myLine;
   }
}
```
