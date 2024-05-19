Main

```
public class Main
{
  public static void main( String[] args )
  {	
	Dog d = new Dog("rover"); 
		
	System.out.println( d.getDogYears( 7 ) );
	
    d.increaseAgeByOne();
	d.increaseAgeByOne();
		
    System.out.println( d.getDogYears( 11 ) );
	System.out.println( d.getName() );
	
    d.increaseAgeByOne();
	d.increaseAgeByOne();
	d.increaseAgeByOne();
	d.increaseAgeByOne();
	
    System.out.println( d.getDogYears( 8 ) );
		
    Dog g = new Dog("bob", 3); 
    
	System.out.println( g.getName() );
	System.out.println( g.getDogYears( 5 ) );
	System.out.println( g )			
  }
}
```

