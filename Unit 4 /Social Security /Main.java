Main 

```
public class Main
{
  public static void main( String args[] )
  {
    Social ss = new Social(""); 
       
    System.out.println("\n");
    ss.chopAndAdd("456-56-2345");
    System.out.println(ss);
    
    System.out.println("\n");
    ss.chopAndAdd("121-12-1200");  
    System.out.println(ss);

    System.out.println("\n");
    ss.chopAndAdd("102-2-1212");
    System.out.println(ss);

    System.out.println("\n");
    ss.chopAndAdd("000-00-0000");
    System.out.println(ss);

    System.out.println("\n");
    ss.chopAndAdd("000-00-000");
    System.out.println(ss);
    
    System.out.println("\n");
    ss.chopAndAdd("175-99 5656");
    System.out.println(ss);
  }
}
```
