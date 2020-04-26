package nogi;

public class Scianka 
{
	private String kolor;
	private String wynik;
	private Boolean strzalki;
	
	public Scianka(String kolor, String wynik, Boolean strzalki)
	{
		this.kolor = kolor;
		this.wynik = wynik;
		this.strzalki = strzalki;
	}
	
	public String zwrocWynik()
	{
		return wynik;
	}
	
	public String zwrocKolor()
	{
		return kolor;
	}
	
	public Boolean zwrocStrzalki()
	{
		return strzalki;
	}
	
	public void wypiszScianke()
	{
		System.out.println(kolor + "--" + wynik + "--" + strzalki);
	}
}
