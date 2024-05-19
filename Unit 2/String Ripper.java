String Ripper 

```
public class Main 
{
  public static String getFirstChunk(String a) 
  {
    return a.substring(0, a.indexOf('@'));
  }

  public static void main(String args[]) 
  {
    System.out.println(getFirstChunk("elephants@are@big"));
    System.out.println(getFirstChunk("computer@science"));
    System.out.println(getFirstChunk("dogs@are@smarter@than@cats"));
    System.out.println(getFirstChunk("chickens@are@kewl"));
  
    /*
      return elephants
      return computer
      return dogs
      return chicken
    */
  }
}
```
