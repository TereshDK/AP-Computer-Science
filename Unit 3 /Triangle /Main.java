Main 

```
public class Main
{
	public static void main( String[] args )
	{
	  System.out.println("The Perimeter of a Triangle");
	  System.out.println("\n"); 
        
	  Triangle test = new Triangle(3, 3, 3);
      
    System.out.println(test);
    test.calcPerimeter();
	  System.out.println("Area = " + test.getArea() );      
    System.out.println("\n");
      
    test.setSideA(7);
    test.setSideB(8);
    test.setSideC(9);
      
    System.out.println(test);
    test.calcPerimeter();
	  System.out.println("Area = " + test.getArea() );      
    System.out.println("\n");
      
    test.setSideA(10);
    test.setSideB(9);
    test.setSideC(11);
      
    System.out.println(test);
    test.calcPerimeter();
	  System.out.println("Area = " + test.getArea() );		
	}
}
```
