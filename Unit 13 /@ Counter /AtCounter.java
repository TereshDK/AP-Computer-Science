At Counter

```
public class AtCounter
{
   private String[][] atMat;

	public AtCounter(int rows, int cols)
	{

    atMat = new String[rows][cols];
		int rand = 0; 
		
    for(int r = 0; r < rows; r++)
		{
      for(int c = 0; c < cols; c++) 
			{
       rand = (int)(Math.random() * 2);     
				
       if (rand == 0)
			 { atMat[r][c] = "@"; }
       else
			 { atMat[r][c] = "-"; } 
      }
		}
	}

	public int countAts(int r, int c)
	{
		int cnt = 0; 
		
		if ((r > -1) && (r < atMat.length) && (c > -1) && (c < atMat[0].length) && (atMat[r][c].equals("@")))
		{
			atMat[r][c] = "-"; 
			cnt += 1 + countAts(r+1, c) + countAts(r-1, c) + countAts(r, c+1) + countAts(r, c-1); 
		}
		
		return cnt;   
  }

	public String toString()
	{
		String gridOut = ""; 
		for (String[] r : atMat)
		{
			for (String c : r)
			{
				gridOut += c + " "; 
			}
			gridOut += "\n"; 
		}
		return ""+gridOut; 
	}
}
```
