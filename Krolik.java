package nogi;

public class Krolik 
{
	private int punkty;
	private Boolean czyZakryty;
	
	public Krolik(int punkty)
	{
		this.punkty = punkty;
		czyZakryty = true;
	}
	
	public int zwrocPunkty()
	{
		return punkty;
	}
	
	public void zakryjLubOdkryj()
	{
		if(czyZakryty == true)
		{
			czyZakryty = false;
		}
		else
		{
			czyZakryty = true;
		}
	}
	
	public Boolean zwrocCzyZakryty()
	{
		return czyZakryty;
	}
	
}
