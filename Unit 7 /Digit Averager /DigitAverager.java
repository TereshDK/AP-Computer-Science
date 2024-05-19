Digit Averager

```
public class digitAverager
{
   public double totalDigits( int n )
	{
    double average = 0; 
    int count = 0;
    
      while(n != 0)
      {
       average += n % 10;
       n = n / 10;
       count++;
      }

    average /= count; 
    return average;
  }
}
```
