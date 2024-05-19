Triangle

```
public class Triangle
{
   public void createTriangle(int num, String letter)
	{
    // top triangles
  	for (int i = 1; i <= n; i++)
  	{
    	for (int j = 1; j <= i; j++)
    	{
      	System.out.print(letter);
    	}
    	System.out.print('\n');
  	}
   	// bottom triangle
  	for (int i = n; i >= 0; i--)
  	{
    	for (int j = 1; j <= i; j++)
    	{
      	System.out.print(letter);
    	}
    	System.out.print('\n'); 
  	}
	}
}
```
