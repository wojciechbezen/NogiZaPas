package nogi;

public class Smok 
{
	private int obecnePole;
	
	public Smok()
	{
		obecnePole = -1;
	}
	
	public int zwrocObecnePole()
	{
		return obecnePole;
	}
	
	public void przesun()
	{
		obecnePole++;
		if(obecnePole > 35)
		{
			obecnePole = 35;
		}
	}
}
