package nogi;

import java.util.Random;

public class Kostka 
{
	private Boolean czyAktywna;
	private Scianka scianki[] = new Scianka[6];
	private String kolor;
	private int wyrzuconyNumerScianki;
	
	Kostka(String kolor, Scianka scianka1, Scianka scianka2, Scianka scianka3, Scianka scianka4, Scianka scianka5, Scianka scianka6)
	{
		czyAktywna = true;
		this.scianki[0] = scianka1;
		this.scianki[1] = scianka2;
		this.scianki[2] = scianka3;
		this.scianki[3] = scianka4;
		this.scianki[4] = scianka5;
		this.scianki[5] = scianka6;
		this.kolor = kolor; 
		wyrzuconyNumerScianki = new Random().nextInt(6);
	}
	
	public Scianka zwrocScianke(int i)
	{
		return scianki[i];
	}
	
	public String zwrocKolor()
	{
		return kolor;
	}
	
	public void aktywujKostke()
	{
		czyAktywna = true;
	}
	
	public void deaktywujKostke()
	{
		czyAktywna = false;
	}
	
	public Boolean zwrocCzyAktywna()
	{
		return czyAktywna;
	}
	
	public void wypiszKostke()
	{
		System.out.println("--------------------");
		scianki[0].wypiszScianke();
		scianki[1].wypiszScianke();
		scianki[2].wypiszScianke();
		scianki[3].wypiszScianke();
		scianki[4].wypiszScianke();
		scianki[5].wypiszScianke();
	}
	
	public void wypiszScianke(int i)
	{
		System.out.println("[kol: " + kolor + "]");
		scianki[i].wypiszScianke();
	}
	
	public void rzucKostke()
	{
		wyrzuconyNumerScianki = new Random().nextInt(6);
	}
	
	public int zwrocWyrzuconyNumer()
	{
		return wyrzuconyNumerScianki;
	}
}
