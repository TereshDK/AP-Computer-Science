Vowel Box

```
public class Main
{
   public static void makeBox( String s)
   {
    String vowels = "AEIOUaeiou";
    for (int j = 0; j < vowels.length(); j++)
    {
      for (int i = 0; i < s.length(); i++)
      {
        if (s.charAt(i) == vowels.charAt(j))
        {
          System.out.println(s); 
        }
        else
        {
          continue; 
        }
      }
   }
}

   public static void main ( String[] args )
   {
      makeBox("hippo");
      makeBox("abcd");
      makeBox("Mississippi");
      makeBox("x");
      makeBox("chicken");
   }
}
```
