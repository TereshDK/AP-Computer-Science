Dog

```
public class Dog
{
  private int age;
  private String name;
	
  public Dog( )  
  {
    name = "spot"; 
    age = 1;
  }
 	
  public Dog( String n )  
  {
    age = 1; 
    name = n; 
  }
  
  public Dog( String n, int a )  
  {
    this.name = n; 
    this.age = a; 
  }
  
  public void increaseAgeByOne()
  {
    age++;		  
  }

  public int getDogYears( int peopleYears )
  {
    return age * peopleYears; 
  }

  public int getAge()    
  {
    return age;
  }

  public String getName()    
  {
    return name; 
  }
	
  public String toString()    
  {
    return "Dog: " + name + ", Age: " + age; 
  }	
} 
```
