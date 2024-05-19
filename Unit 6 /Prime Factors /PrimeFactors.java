Prime Factors

```
public class PrimeFactors
{
    private String factors;
    private int n;
    
    public PrimeFactors(int a)
    {
      factors = "";
      n = a;
    }
    
    public String isPrime()
    {
      int count = 0; 

      for (int j = 1; j <= n; j++)
      {
        if (n % j == 0)
        {
          factors += j + " ";
          count++;
        }
      }

      if (count > 2)
      {
        return "NOT"; 
      }
      else
      {
        return "\b"; 
      }
    }     
    
    public String toString( )
    {
      return "The factors are " + factors;
    } 
}    
```
