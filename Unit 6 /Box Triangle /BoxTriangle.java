Box Triangle

```
public class BoxTriangle
{
       
    public void printBox( String word )
    {
      for (int i = 0; i < word.length(); i++)
        {
          System.out.println(word); 
        }
    } 

       
    public void printTriangle( String word )
    {
       String get = "";
       for (int j = 0; j < word.length(); j++)
         { 
           get = get + word.charAt(j); 
           System.out.println(get);
         }
    }    
} 
```
