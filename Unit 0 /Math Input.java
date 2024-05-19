Math Input

```
import java.util.Scanner;  

class Main 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("\nEnter two Integers: ");
    int i = sc.nextInt(); 
    int j = sc.nextInt();
    
    System.out.println("\n" + i + " + " + j + " = " + (i + j));
    System.out.println(i + " - " + j + " = " + (i - j));
    System.out.println(i + " * " + j + " = " + (i * j)); 
    System.out.println(i + " / " + j + " = " + (i / j));
    System.out.println(i + " % " + j + " = " + (i % j)); 
  }
}
```
