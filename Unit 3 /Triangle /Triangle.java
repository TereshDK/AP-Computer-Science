Triangle

```
public class Triangle
{
	private int sideA, sideB, sideC;
	private double perimeter;

	public Triangle(int a, int b, int c)
	{
    sideA = a; 
    sideB = b; 
    sideC = c; 
	  perimeter = a + b + c; 
  }

	public void calcPerimeter()
	{
    perimeter = sideA + sideB + sideC; 
    System.out.println("Perimeter: " + perimeter); 
	}

	public double getArea()
	{
    double s = perimeter / 2;   
    double area = Math.sqrt(s*(s - sideA)*(s - sideB)*(s - sideC)); 
    return area; 
	}
   
   public void setSideA(int a)
	{
    sideA = a; 
	}
   
   public void setSideB(int b)
	{
    sideB = b; 
	}
   
   public void setSideC(int c)
	{
    sideC = c; 
	}
   
   public String toString()
   {
     return "SideA = " + sideA + "," + " SideB = " + sideB + "," + " SideC = " + sideC;   
   }  
}
```
