Social Security

```
public class Social
{
   private int total;
   private String socialID;
   
   public Social(String a)
   {
     total = 0;  
     socialID = a;
   }
   
	public void chopAndAdd(String a)
	{
    socialID = a;
    if (socialID.length() != 11 || socialID.indexOf('-') != 3 || socialID.lastIndexOf('-') != 6)
    {
      total = -1; 
    }
    else
    {
      String first = socialID.substring(0, socialID.indexOf('-'));
      String second = socialID.substring(socialID.indexOf('-') + 1, socialID.lastIndexOf('-'));  
      String third = socialID.substring(socialID.lastIndexOf('-') + 1, socialID.length());

      total = Integer.parseInt(first) + Integer.parseInt(second) + Integer.parseInt(third);  
    }
	}
   
   //complete the toString method (See sample output)
	public String toString()
	{
		return "SS# " + socialID + " has a total of " + total; 
	}
}
```
