Main 

```
public class StringsFunhouse 
{
  public int sameFirstLetter(String a, String b) 
  {
    return (a.charAt(0) == b.charAt(0)) ? 1 : -1; 
  }

  public boolean vowelOrDigit(String str) 
  {
    String vow_dig = "AEIOUaeiou123456789";
    return (vow_dig.indexOf(str.charAt(0)) != -1) ? true : false; 
  }

  public String firstLastVowel(String str) 
  {
    // Check if first character or last character of str is vowel
    String vowels = "AEIUOaeiuo";
    return (vowels.indexOf(str.charAt(0)) != -1 || vowels.indexOf(str.charAt(str.length() - 1)) != -1) ? "yes" : "no"; 
  }

  public boolean firstRepeats(String a)
   {
     return a.indexOf(a.charAt(0), 1) != -1; 
   }
}
```
