package nogi;

public class Pole 
{
	private int numerPola;
	private int liczbaRycerzy;
	
	//int graficzneX; // to potem sie przyda
	//int graficzneY; // to potem sie przyda
	
	private Boolean czyJestKrolik;
	private Krolik krolik;
	
	private Boolean czyJestJakisRycerz;
	
	private Boolean czyJestZielonyRycerz;
	private Boolean czyJestPomaranczowyRycerz;
	private Boolean czyJestRozowyRycerz;
	private Boolean czyJestCzarnyRycerz;
	private Boolean czyJestFioletowyRycerz;
	private Boolean czyJestNiebieskiRycerz;
	private Boolean czyJestZoltyRycerz;
	
	private Boolean czyJestSmok; // do grafiki sie przyda chyba
	
	public Pole(int numerPola)
	{
		czyJestJakisRycerz = false;
		czyJestZielonyRycerz = false;
		czyJestPomaranczowyRycerz = false;
		czyJestRozowyRycerz = false;
		czyJestCzarnyRycerz = false;
		czyJestFioletowyRycerz = false;
		czyJestNiebieskiRycerz = false;
		czyJestZoltyRycerz = false;
		czyJestSmok = false;
		czyJestKrolik = false;
		
		this.numerPola = numerPola;
	}
	
	public Boolean zwrocCzyJestJakisRycerz()
	{
		return czyJestJakisRycerz;
	}
	
	public void postawKrolika(Krolik k)
	{
		krolik = k;
		czyJestKrolik = true;
	}
	
	public Boolean zwrocCzyJestKrolik()
	{
		return czyJestKrolik;
	}
	
	public void postawSmoka()
	{
		czyJestSmok = true;
	}
	
	public void zdjemijSmoka()
	{
		czyJestSmok = false;
	}
	
	public String zwrocKolorSamotnegoRycerza()
	{
		if(czyJestZielonyRycerz == true)
		{
			return "zielony";
		}
		if(czyJestPomaranczowyRycerz == true)
		{
			return "pomaranczowy";
		}
		if(czyJestRozowyRycerz == true)
		{
			return "rozowy";
		}
		if(czyJestCzarnyRycerz == true)
		{
			return "czarny";
		}
		if(czyJestFioletowyRycerz == true)
		{
			return "fioletowy";
		}
		if(czyJestNiebieskiRycerz == true)
		{
			return "niebieski";
		}
		if(czyJestZoltyRycerz == true)
		{
			return "zolty";
		}
		
		System.out.println("Pole.zwrocKolorSamotnegoRycerza()");
		return "XXX";
	}
	
	public void policzRycerzy()
	{
		liczbaRycerzy = 0;
		if(czyJestZielonyRycerz == true)
		{
			liczbaRycerzy++;
		}
		if(czyJestPomaranczowyRycerz == true)
		{
			liczbaRycerzy++;
		}
		if(czyJestRozowyRycerz == true)
		{
			liczbaRycerzy++;
		}
		if(czyJestCzarnyRycerz == true)
		{
			liczbaRycerzy++;
		}
		if(czyJestFioletowyRycerz == true)
		{
			liczbaRycerzy++;
		}
		if(czyJestNiebieskiRycerz == true)
		{
			liczbaRycerzy++;
		}
		if(czyJestZoltyRycerz == true)
		{
			liczbaRycerzy++;
		}
		if(liczbaRycerzy > 0)
		{
			czyJestJakisRycerz = true;
		}
		if(liczbaRycerzy == 0)
		{
			czyJestJakisRycerz = false;
		}
	}
	
	public int zwrocLiczbeRycerzy()
	{
		return liczbaRycerzy;
	}
	
	public Boolean zwrocCzyJestSmok()
	{
		return czyJestSmok;
	}
	
	public Boolean zwrocCzyJestRycerz(String kolor)
	{
		switch(kolor)
		{
			case "zielony":
				return czyJestZielonyRycerz;
			case "pomaranczowy":
				return czyJestPomaranczowyRycerz;
			case "rozowy":
				return czyJestRozowyRycerz;
			case "czarny":
				return czyJestCzarnyRycerz;
			case "fioletowy":
				return czyJestFioletowyRycerz;
			case "niebieski":
				return czyJestNiebieskiRycerz;
			case "zolty":
				return czyJestZoltyRycerz;
		}
		
		return false;
	}
	
	public int zwrocNumerPola()
	{
		return numerPola;
	}
	
	public void postawRycerza(String kolor)
	{
		switch(kolor)
		{
			case "zielony":
				czyJestZielonyRycerz = true;
				break;
			case "pomaranczowy":
				czyJestPomaranczowyRycerz = true;
				break;
			case "rozowy":
				czyJestRozowyRycerz = true;
				break;
			case "czarny":
				czyJestCzarnyRycerz = true;
				break;
			case "fioletowy":
				czyJestFioletowyRycerz = true;
				break;
			case "niebieski":
				czyJestNiebieskiRycerz = true;
				break;
			case "zolty":
				czyJestZoltyRycerz = true;
				break;
		}
	}
	
	public void zdejmijRycerza(String kolor)
	{
		switch(kolor)
		{
			case "zielony":
				czyJestZielonyRycerz = false;
				break;
			case "pomaranczowy":
				czyJestPomaranczowyRycerz = false;
				break;
			case "rozowy":
				czyJestRozowyRycerz = false;
				break;
			case "czarny":
				czyJestCzarnyRycerz = false;
				break;
			case "fioletowy":
				czyJestFioletowyRycerz = false;
				break;
			case "niebieski":
				czyJestNiebieskiRycerz = false;
				break;
			case "zolty":
				czyJestZoltyRycerz = false;
				break;
		}
	}
	
	public Krolik zbierzKrolika()
	{
		czyJestKrolik = false;
		return krolik;
	}
	
	
	
	
	
	
	
	public void wypiszTestowo()
	{
		policzRycerzy();
		/*System.out.println(numerPola + "-" + liczbaRycerzy + "-" + czyJestKrolik + "-" + czyJestJakisRycerz + "-" + 
							czyJestZielonyRycerz + "-" + czyJestPomaranczowyRycerz + "-" + czyJestRozowyRycerz + "-" + 
							czyJestCzarnyRycerz + "-" + czyJestFioletowyRycerz + "-" + czyJestNiebieskiRycerz + "-" + 
							czyJestZoltyRycerz + "-" + czyJestSmok);*/
		
		String txt = "["+numerPola+"]" + "["+liczbaRycerzy+"]";
		if(czyJestKrolik)
		{
			txt = txt + "[Kr]";
		}
		if(czyJestJakisRycerz)
		{
			txt = txt + "[Jakis]";
		}
		if(czyJestZielonyRycerz)
		{
			txt = txt + "[Zielony]";
		}
		if(czyJestPomaranczowyRycerz)
		{
			txt = txt + "[Pomaranczowy]";
		}
		if(czyJestRozowyRycerz)
		{
			txt = txt + "[Rozowy]";
		}
		if(czyJestCzarnyRycerz)
		{
			txt = txt + "[Czarny]";
		}
		if(czyJestFioletowyRycerz)
		{
			txt = txt + "[Fioletowy]";
		}
		if(czyJestNiebieskiRycerz)
		{
			txt = txt + "[Niebieski]";
		}
		if(czyJestZoltyRycerz)
		{
			txt = txt + "[Zolty]";
		}
		if(czyJestSmok)
		{
			txt = txt + "[SMOK]";
		}
		
		System.out.println(txt);
		
	}
	
}

