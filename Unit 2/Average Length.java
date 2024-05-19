Average Length

```
import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);

    String input_1, input_2; 
    
    System.out.print("\nEnter two words seperated by a space: " );
    input_1 = sc.next(); 
    input_2 = sc.next();
    
    System.out.println("The average length of the words " + input_1 + " and " + input_2 + " is " +   ((input_1.length() + input_2.length())/2)); 
  }
}
```
