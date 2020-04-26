package nogi;

public class Rycerz 
{
	
	private String kolor;
	private int obecnePole;
	private Boolean czyJestWGrze;
	
	public Rycerz(String kolor, int obecnePole, Boolean czyZyje)
	{
		this.kolor = kolor;
		this.obecnePole = obecnePole;
		this.czyJestWGrze = czyZyje;
	}
	
	public void wylaczRycerzaZGry()
	{
		czyJestWGrze = false;
		obecnePole=-1;
	}
	
	public Boolean zwrocCzyJestWGrze()
	{
		return czyJestWGrze;
	}
	
	public String zwrocKolor()
	{
		return kolor;
	}
	
	public int zwrocObecnePole()
	{
		return obecnePole;
	}
	
	public void przesun(int numer)
	{
		obecnePole = obecnePole + numer;
		if(obecnePole > 35)
		{
			obecnePole = 36;
		}
	}
}
