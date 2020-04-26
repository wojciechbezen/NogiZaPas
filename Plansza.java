package nogi;

import java.util.List;

public class Plansza 
{
	private Smok smok = new Smok();
	
	
	private List<Krolik> kroliki = new PulaKrolikow().zwrocPule();
	private List<Rycerz> rycerze = new PulaRycerzy().zwrocPule();
	
	private Pole[] pola = new Pole[36];
	
	public Plansza()
	{
	
		for(int i = 0; i < 36; i++)
		{
			pola[i] = new Pole(i);
		}
		
		pola[16].postawKrolika(kroliki.get(0));
		pola[20].postawKrolika(kroliki.get(1));
		pola[24].postawKrolika(kroliki.get(2));
		pola[29].postawKrolika(kroliki.get(3));
		pola[35].postawKrolika(kroliki.get(4));
		
		for(int i = 0; i < rycerze.size(); i++)
		{
			pola[9].postawRycerza(rycerze.get(i).zwrocKolor());
		}
		
	}
		
	public void wypiszTestowo()
	{
		for(int i = 0; i < 36; i++)
		{
			pola[i].wypiszTestowo();
		}
	}
	
	public void ruszSmoka(int ilePol)
	{
		for(int i=0; i < ilePol; i++)
		{
			if(smok.zwrocObecnePole() > -1)
			{
				pola[smok.zwrocObecnePole()].zdjemijSmoka();
			}
			smok.przesun();
			pola[smok.zwrocObecnePole()].postawSmoka();
			if(pola[smok.zwrocObecnePole()].zwrocCzyJestJakisRycerz() == true) // zatrzymanie na rycerzu
			{
				break;
			}
		}
	}
	
	public int zwrocIndexRycerzaDanegoKoloru(String kolor, Boolean czyUzywanaBialaScianka, String kolorKosciBialejScianki)
	{
		for(int i = 0; i < rycerze.size(); i++)
		{
			System.out.println("@@@@@" + rycerze.get(i).zwrocKolor() +" &&& " + kolor + "=" + i + "=@@@@@");
			if(rycerze.get(i).zwrocKolor() == kolor)
			{
				return i;
			}
			//System.out.println("@@@@@" + rycerze.get(i).zwrocKolor() +" &&& " + kolor + "=" + i + "=@@@@@");
		}
		
		
		if(czyUzywanaBialaScianka==true)
		{
			for(int i = 0; i < rycerze.size(); i++)
			{
				System.out.println("#####" + rycerze.get(i).zwrocKolor() +" &&& " + kolor + "=" + i + "=#####");
				if(rycerze.get(i).zwrocKolor() == kolorKosciBialejScianki)
				{
					return i;
				}
			}
		}
		return 112233;
	}
	
	public void ruszRycerzaOLiczbePol(int ilePol, String kolor, Boolean czyUzywanaBialaScianka, String kolorKosciBialejScianki)
	{
		int idx = zwrocIndexRycerzaDanegoKoloru(kolor,czyUzywanaBialaScianka, kolorKosciBialejScianki);
		if((rycerze.get(idx).zwrocObecnePole() < 36) && (rycerze.get(idx).zwrocObecnePole() > 0))
		{
			pola[rycerze.get(idx).zwrocObecnePole()].zdejmijRycerza(kolor);
			rycerze.get(idx).przesun(ilePol);
			if(rycerze.get(idx).zwrocObecnePole() < 36)
			{
				pola[rycerze.get(idx).zwrocObecnePole()].postawRycerza(kolor);
			}
		}
		
	}
	
	public void ruszRycerzaNaprzod()
	{
		
	}
	
	public void ruszRycerzaCofnij()
	{
		
	}
	
	public void ruszRycerza1plus1()
	{
		
	}
	
	public Rycerz zwrocRycerza(int idx)
	{
		return rycerze.get(idx);
	}
	
	public Pole zwrocPole(int idx)
	{
		return pola[idx];
	}
	
	public Smok zwrocSmoka()
	{
		return smok;
	}
}
