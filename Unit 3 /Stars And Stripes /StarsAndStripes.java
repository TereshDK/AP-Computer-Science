Stars and Stripes

```
public class StarsAndStripes
{
   private String name;
   
   public StarsAndStripes(String one) 
   {
      name = one; 
      System.out.println("Lab3.1 - StarsAndStripes");
      printTwoBlankLines();
      
	  System.out.println("Written by "+ name);
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
   	  System.out.println("********************");
   }

   public void printTwentyDashes()
   {
   	  System.out.println("--------------------");
   }

   public void printTwoBlankLines()
   {
      System.out.println();
      System.out.println();
   }
   
   public void printASmallBox()
   {		
      printTwentyDashes(); 
      printTwentyStars();
      printTwentyDashes(); 
      printTwentyStars();
      printTwentyDashes();
      printTwentyStars();
      printTwentyDashes(); 
   }
 
   public void printABigBox()
   { 	
      printASmallBox();
      printASmallBox();
   }   
}
```
