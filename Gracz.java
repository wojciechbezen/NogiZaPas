package nogi;

import java.util.ArrayList;
import java.util.List;

public class Gracz 
{
	private int numerGracza;
	private int punkty;
	private Tarcza tarcza;
	private List<Krolik> kroliki = new ArrayList<Krolik>();
	
	public Gracz(int numerGracza, Tarcza tarcza)
	{
		this.numerGracza = numerGracza;
		this.punkty=0;
		this.tarcza = tarcza;
	}
	
	public void wypiszTestowo()
	{
		System.out.println(numerGracza + "-" + punkty + "-" + tarcza.zwrocKolor1() + "-" + tarcza.zwrocKolor2() 
							+ "-" + tarcza.zwrocKolor3());
	}
	
	public void dodajPunkty(int pkt)
	{
		punkty = punkty + pkt;
	}
	
	public void dodajKrolika(Krolik k)
	{
		kroliki.add(k);
	}
	
	public List<Krolik> zwrocKroliki()
	{
		return kroliki;
	}
	
	public Tarcza zwrocTarcze()
	{
		return tarcza;
	}
}

