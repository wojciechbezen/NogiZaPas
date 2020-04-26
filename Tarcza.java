package nogi;

public class Tarcza 
{
	private String kolor1;
	private String kolor2;
	private String kolor3;
	private Boolean czyZakryta;
	
	public Tarcza(String kolor1, String kolor2, String kolor3)
	{
		this.kolor1=kolor1;
		this.kolor2=kolor2;
		this.kolor3=kolor3;
		czyZakryta = true;
	}
	
	public String zwrocKolor1()
	{
		return kolor1;
	}
	
	public String zwrocKolor2()
	{
		return kolor2;
	}
	
	public String zwrocKolor3()
	{
		return kolor3;
	}
	
	public void zakryjLubOdkryj()
	{
		if(czyZakryta == true)
		{
			czyZakryta = false;
		}
		else
		{
			czyZakryta = true;
		}
	}
	
	public Boolean zwrocCzyZakryta()
	{
		return czyZakryta;
	}
}
