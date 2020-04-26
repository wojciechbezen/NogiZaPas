package nogi;

import java.util.List;

public class Gra 
{
	private int liczbaRund;
	private int ktoryGracz;
	private int liczbaGraczy;
	
	private Boolean czyKoniecGry;
	private Boolean czyKoniecGryDwajRycerze;
	private Boolean czyUzywanaBialaScianka;
	private String wynikBialejScianki;
	private String kolorKosciBialejScianki;
	
	private List<Tarcza> tarcze = new PulaTarcz().zwrocPule();
	private List<ZetonSmoka> zetonySmoka = new PulaZetonowSmoka().zwrocPule();
	private List<Kostka> kostki = new PulaKosci().zwrocPule();
	
	private Plansza plansza = new Plansza();
	
	private Gracz gracz1 = new Gracz(1, tarcze.get(0));
	private Gracz gracz2 = new Gracz(2, tarcze.get(1));
	private Gracz gracz3 = new Gracz(3, tarcze.get(2));
	private Gracz gracz4 = new Gracz(3, tarcze.get(3));
	
	private Zamek zamek = new Zamek();
	
	public Gra(int liczbaGraczy)
	{
		liczbaRund = 0;
		this.liczbaGraczy = liczbaGraczy;
		ktoryGracz = 1;
		rzucAktywneKostki();
		czyUzywanaBialaScianka = false;
		czyKoniecGry = false;
		czyKoniecGryDwajRycerze =false;
	}
	
	public void zwiekszRunde()
	{
		liczbaRund++;
	}
	
	public int zwrocIndexKostkiDanegoKoloru(String kolor)
	{
		System.out.println("Gra.zwrocIndexKotskiDanegoKoloru() - start");
		for(int i = 0; i < kostki.size(); i++)
		{
			System.out.println("$$$$$" + kostki.get(i).zwrocKolor() +" &&& " + kolor + "=" + i + "=$$$$$");
			if(kostki.get(i).zwrocKolor() == kolor)
			{
				return i;
			}
		}
		if(czyUzywanaBialaScianka==true)
		{
			for(int i = 0; i < kostki.size(); i++)
			{
				System.out.println("#####" + kostki.get(i).zwrocKolor() +" &&& " + kolor + "=" + i + "=#####");
				if(kostki.get(i).zwrocKolor() == kolorKosciBialejScianki)
				{
					return i;
				}
			}
		}
		return 1111111;
	}
	
	public void rzucAktywneKostki()
	{
		for(int i=0; i<kostki.size(); i++)
		{
			if(kostki.get(i).zwrocCzyAktywna() == true)
			{
				kostki.get(i).rzucKostke();
			}
		}
	}
	
	public void aktywujKostki()
	{
		
		System.out.println("Gra.aktywujKostki() - start");
		
		
		for(int i=0; i < kostki.size(); i++)
		{
			if(kostki.get(i).zwrocKolor() != "bialy")
			{
				int idxRycerza = plansza.zwrocIndexRycerzaDanegoKoloru(kostki.get(i).zwrocKolor(),czyUzywanaBialaScianka,kolorKosciBialejScianki);
				if(plansza.zwrocRycerza(idxRycerza).zwrocCzyJestWGrze()==true)
				{
					kostki.get(i).aktywujKostke();
				}
			}
		}
		kostki.get(zwrocIndexKostkiDanegoKoloru("bialy")).aktywujKostke();
		
		
		System.out.println("Gra.aktywujKostki() - koniec");
	}
	
	//dokonczyc ruszanie trzeba !!!!!!!!!!!!!!!!
	public void ruszRycerza(String wynikKostki, String kolorKostki)
	{
		int ilePol=0;
		switch(wynikKostki)
		{
			case "1":
				ilePol=1;
				plansza.ruszRycerzaOLiczbePol(ilePol, kolorKostki, czyUzywanaBialaScianka,kolorKosciBialejScianki);
				break;				
			case "2":
				ilePol=2;
				plansza.ruszRycerzaOLiczbePol(ilePol, kolorKostki, czyUzywanaBialaScianka,kolorKosciBialejScianki);
				break;
			case "3":
				ilePol=3;
				plansza.ruszRycerzaOLiczbePol(ilePol, kolorKostki, czyUzywanaBialaScianka,kolorKosciBialejScianki);
				break;
			case "4":
				ilePol=4;
				plansza.ruszRycerzaOLiczbePol(ilePol, kolorKostki, czyUzywanaBialaScianka,kolorKosciBialejScianki);
				break;
			case "5":
				ilePol=5;
				plansza.ruszRycerzaOLiczbePol(ilePol, kolorKostki, czyUzywanaBialaScianka,kolorKosciBialejScianki);
				break;
			case "6":
				ilePol=6;
				plansza.ruszRycerzaOLiczbePol(ilePol, kolorKostki, czyUzywanaBialaScianka,kolorKosciBialejScianki);
				break;
				
				
				
			case"1+1":
					
				break;
				
			case"cofnij":
				int idxRycerz = plansza.zwrocIndexRycerzaDanegoKoloru(kolorKostki, czyUzywanaBialaScianka,kolorKosciBialejScianki);
				int poleRycerz = plansza.zwrocRycerza(idxRycerz).zwrocObecnePole();
				if(poleRycerz > 9)
				{
					for(int i=poleRycerz-1; i > 8; i--)
					{
						ilePol--;
						if(plansza.zwrocPole(i).zwrocCzyJestJakisRycerz()==true)
						{
							plansza.ruszRycerzaOLiczbePol(ilePol, kolorKostki, czyUzywanaBialaScianka,kolorKosciBialejScianki);
							break;
						}
					}
				}
				break;
				
			case"naprzod":
				idxRycerz = plansza.zwrocIndexRycerzaDanegoKoloru(kolorKostki, czyUzywanaBialaScianka,kolorKosciBialejScianki);
				poleRycerz = plansza.zwrocRycerza(idxRycerz).zwrocObecnePole();
					for(int i=poleRycerz+1; i < 36; i++)
					{
						ilePol++;
						if((plansza.zwrocPole(i).zwrocCzyJestJakisRycerz()==true) && (i < 35))
						{
							plansza.ruszRycerzaOLiczbePol(ilePol, kolorKostki, czyUzywanaBialaScianka,kolorKosciBialejScianki);
							break;
						}
					}
				break;
					
			}
		smokZjada();
	}
	
	public void ruszSmoka()
	{
		
		if((liczbaRund > 0) && (liczbaRund < 8))
		{
			plansza.zwrocPole(plansza.zwrocSmoka().zwrocObecnePole()).zdjemijSmoka();
		}
		if(liczbaRund < 8)
		{
			plansza.ruszSmoka(zetonySmoka.get(liczbaRund).zwrocWartosc()); // ruch
		}
		plansza.zwrocPole(plansza.zwrocSmoka().zwrocObecnePole()).postawSmoka();
		smokZjada();//zjedzenie rycerza jesli jest mozliwosc

		liczbaRund ++;//zwiekszenie liczby rund
		
		System.out.println("Gra.ruszSmoka()");
	}
	
	public void smokZjada()
	{
		System.out.println("Gra.smokZjada() - start");
		int idx = plansza.zwrocSmoka().zwrocObecnePole();
		if((idx > 0) && (kolorKosciBialejScianki != "bialy")&& (plansza.zwrocPole(idx).zwrocLiczbeRycerzy()==1))
		{
			System.out.println("Gra.smokZjada() - w trakcie");
			String kolor = plansza.zwrocPole(idx).zwrocKolorSamotnegoRycerza();
			System.out.println(kolor);
			int idxRycerz = plansza.zwrocIndexRycerzaDanegoKoloru(kolor,czyUzywanaBialaScianka,kolorKosciBialejScianki);
			if(czyUzywanaBialaScianka==true)
			{
				idxRycerz = plansza.zwrocIndexRycerzaDanegoKoloru(kolorKosciBialejScianki,czyUzywanaBialaScianka,kolorKosciBialejScianki);
			}
			plansza.zwrocPole(idx).zdejmijRycerza(kolor);
			plansza.zwrocRycerza(idxRycerz).wylaczRycerzaZGry();
			kostki.get(zwrocIndexKostkiDanegoKoloru(kolor)).deaktywujKostke();
		}
		System.out.println("Gra.smokZjada() - koniec");
	}
	
	public void uruchomKostke(String kolor)
	{
		int idx = zwrocIndexKostkiDanegoKoloru(kolor);
		String wynikScianki = kostki.get(idx).zwrocScianke(kostki.get(idx).zwrocWyrzuconyNumer()).zwrocWynik();
		String kolorScianki = kostki.get(idx).zwrocScianke(kostki.get(idx).zwrocWyrzuconyNumer()).zwrocKolor();
		if(kolorScianki != "bialy") // opcja prostsza, scianka nie jest biala
		{
			int idxRycerz = plansza.zwrocIndexRycerzaDanegoKoloru(kolor,czyUzywanaBialaScianka,kolorKosciBialejScianki);
			int poleRycerza = plansza.zwrocRycerza(idxRycerz).zwrocObecnePole();
			//plansza.zwrocPole(poleRycerza).zdejmijRycerza(kolor);
			ruszRycerza(wynikScianki, kolorScianki); // ruch, trzeba dopisac 1+1, cofanie i przod
			
			if(kostki.get(idx).zwrocScianke(kostki.get(idx).zwrocWyrzuconyNumer()).zwrocStrzalki() == false)// sprawdzenie strzalek
			{
				kostki.get(idx).deaktywujKostke(); 
			}
			
			poleRycerza = plansza.zwrocRycerza(idxRycerz).zwrocObecnePole();
			//plansza.zwrocPole(poleRycerza).postawRycerza(kolor);
			
			if((poleRycerza < 36) && (poleRycerza > 0) && (plansza.zwrocPole(poleRycerza).zwrocCzyJestKrolik() == true)) //krolik na polu rozpatrzenie
			{
				switch(ktoryGracz)
				{
					case 1:
						gracz1.dodajKrolika(plansza.zwrocPole(poleRycerza).zbierzKrolika());
						break;
					case 2:
						gracz2.dodajKrolika(plansza.zwrocPole(poleRycerza).zbierzKrolika());
						break;
					case 3:
						gracz3.dodajKrolika(plansza.zwrocPole(poleRycerza).zbierzKrolika());
						break;
					case 4:
						gracz4.dodajKrolika(plansza.zwrocPole(poleRycerza).zbierzKrolika());
						break;
				}
			}
			
			if(poleRycerza > 35) // jak dotarl do zamku
			{
				plansza.zwrocRycerza(idxRycerz).wylaczRycerzaZGry();
				zamek.dodajRycerza(plansza.zwrocRycerza(idxRycerz));
			}
			
			smokZjada(); // jesli po ruchu na polu z ktorego sie rusza zostal jeden rycerz
			nastepnyGracz();
			rzucAktywneKostki();
		}
		else
		{
			czyUzywanaBialaScianka = true;
			wynikBialejScianki = wynikScianki;
			kolorKosciBialejScianki = kolor;
			System.out.println("Gra.uruchomKostke() --> kolorKosciBialejScianki " +	kolorKosciBialejScianki);
		}
		sprawdzCzyKoniecGry();
	}
	
	public void uruchomRycerzaBialaScianka(String kolor)
	{
		if(czyUzywanaBialaScianka)
		{
			int idxRycerz = plansza.zwrocIndexRycerzaDanegoKoloru(kolor,czyUzywanaBialaScianka,kolorKosciBialejScianki);
			int poleRycerza = plansza.zwrocRycerza(idxRycerz).zwrocObecnePole();
			int idx = zwrocIndexKostkiDanegoKoloru(kolorKosciBialejScianki);
			//plansza.zwrocPole(poleRycerza).zdejmijRycerza(kolor);
			ruszRycerza(wynikBialejScianki, kolor); // ruch, trzeba dopisac 1+1, cofanie i przod
			
			if(kostki.get(idx).zwrocScianke(kostki.get(idx).zwrocWyrzuconyNumer()).zwrocStrzalki() == false)// sprawdzenie strzalek
			{
				kostki.get(idx).deaktywujKostke(); 
			}
			
			poleRycerza = plansza.zwrocRycerza(idxRycerz).zwrocObecnePole();
			//plansza.zwrocPole(poleRycerza).postawRycerza(kolor);
			
			if((poleRycerza < 36) && (poleRycerza > 0) &&  (plansza.zwrocPole(poleRycerza).zwrocCzyJestKrolik() == true)) //krolik na polu rozpatrzenie
			{
				switch(ktoryGracz)
				{
					case 1:
						gracz1.dodajKrolika(plansza.zwrocPole(poleRycerza).zbierzKrolika());
						break;
					case 2:
						gracz2.dodajKrolika(plansza.zwrocPole(poleRycerza).zbierzKrolika());
						break;
					case 3:
						gracz3.dodajKrolika(plansza.zwrocPole(poleRycerza).zbierzKrolika());
						break;
					case 4:
						gracz4.dodajKrolika(plansza.zwrocPole(poleRycerza).zbierzKrolika());
						break;
				}
			}
			
			if(poleRycerza > 35) // jak dotarl do zamku
			{
				plansza.zwrocRycerza(idxRycerz).wylaczRycerzaZGry();
				zamek.dodajRycerza(plansza.zwrocRycerza(idxRycerz));
			}
			
			smokZjada(); // jesli po ruchu na polu z ktorego sie rusza zostal jeden rycerz
			nastepnyGracz();
			rzucAktywneKostki();
			czyUzywanaBialaScianka = false;
		}
		sprawdzCzyKoniecGry();
	}
	
	
	public void nastepnyGracz()
	{
		ktoryGracz++;
		if(ktoryGracz > liczbaGraczy)
		{
			ktoryGracz = 1;
		}
		if(policzAktywneKostki() < 2)
		{
			System.out.println("policzAktywneKostki() < 2");
			
			ruszSmoka();
			
			aktywujKostki();
			
			
		}
	}
	
	public int zwrocKtoryGracz()
	{
		return ktoryGracz;
	}
	
	public int policzAktywneKostki()
	{
		int liczba=0;
		for(int i=0; i<kostki.size(); i++)
		{
			if(kostki.get(i).zwrocCzyAktywna() == true)
			{
				liczba++;
			}
		}
		return liczba;
	}
	
	public int policzRycerzyNaPlanszy()
	{
		int liczba=0;
		
		for(int i=0; i<36; i++)
		{
			plansza.zwrocPole(i).policzRycerzy();
			liczba = liczba + plansza.zwrocPole(i).zwrocLiczbeRycerzy();
		}

		return liczba;
	}
	
	public void punktowanieZaZamek()
	{
		Rycerz r;
		Tarcza t;
		
		List<Rycerz> slotZamku = zamek.zwrocSlot(1);
		for(int i=0; i<slotZamku.size(); i++)
		{
			r=slotZamku.get(i);
			
			t=gracz1.zwrocTarcze();
			if((r.zwrocKolor() == t.zwrocKolor1()) || (r.zwrocKolor() == t.zwrocKolor2()) || (r.zwrocKolor() == t.zwrocKolor3()))
			{
				gracz1.dodajPunkty(0);
			}
			
			t=gracz2.zwrocTarcze();
			if((r.zwrocKolor() == t.zwrocKolor1()) || (r.zwrocKolor() == t.zwrocKolor2()) || (r.zwrocKolor() == t.zwrocKolor3()))
			{
				gracz2.dodajPunkty(0);
			}
			
			t=gracz3.zwrocTarcze();
			if((r.zwrocKolor() == t.zwrocKolor1()) || (r.zwrocKolor() == t.zwrocKolor2()) || (r.zwrocKolor() == t.zwrocKolor3()))
			{
				gracz3.dodajPunkty(0);
			}
			
			t=gracz4.zwrocTarcze();
			if((r.zwrocKolor() == t.zwrocKolor1()) || (r.zwrocKolor() == t.zwrocKolor2()) || (r.zwrocKolor() == t.zwrocKolor3()))
			{
				gracz4.dodajPunkty(0);
			}
			
		}
		
		slotZamku = zamek.zwrocSlot(2);
		for(int i=0; i<slotZamku.size(); i++)
		{
			r=slotZamku.get(i);
			
			t=gracz1.zwrocTarcze();
			if((r.zwrocKolor() == t.zwrocKolor1()) || (r.zwrocKolor() == t.zwrocKolor2()) || (r.zwrocKolor() == t.zwrocKolor3()))
			{
				gracz1.dodajPunkty(5);
			}
			
			t=gracz2.zwrocTarcze();
			if((r.zwrocKolor() == t.zwrocKolor1()) || (r.zwrocKolor() == t.zwrocKolor2()) || (r.zwrocKolor() == t.zwrocKolor3()))
			{
				gracz2.dodajPunkty(5);
			}
			
			t=gracz3.zwrocTarcze();
			if((r.zwrocKolor() == t.zwrocKolor1()) || (r.zwrocKolor() == t.zwrocKolor2()) || (r.zwrocKolor() == t.zwrocKolor3()))
			{
				gracz3.dodajPunkty(5);
			}
			
			t=gracz4.zwrocTarcze();
			if((r.zwrocKolor() == t.zwrocKolor1()) || (r.zwrocKolor() == t.zwrocKolor2()) || (r.zwrocKolor() == t.zwrocKolor3()))
			{
				gracz4.dodajPunkty(5);
			}
			
		}
		
		slotZamku = zamek.zwrocSlot(3);
		for(int i=0; i<slotZamku.size(); i++)
		{
			r=slotZamku.get(i);
			
			t=gracz1.zwrocTarcze();
			if((r.zwrocKolor() == t.zwrocKolor1()) || (r.zwrocKolor() == t.zwrocKolor2()) || (r.zwrocKolor() == t.zwrocKolor3()))
			{
				gracz1.dodajPunkty(3);
			}
			
			t=gracz2.zwrocTarcze();
			if((r.zwrocKolor() == t.zwrocKolor1()) || (r.zwrocKolor() == t.zwrocKolor2()) || (r.zwrocKolor() == t.zwrocKolor3()))
			{
				gracz2.dodajPunkty(3);
			}
			
			t=gracz3.zwrocTarcze();
			if((r.zwrocKolor() == t.zwrocKolor1()) || (r.zwrocKolor() == t.zwrocKolor2()) || (r.zwrocKolor() == t.zwrocKolor3()))
			{
				gracz3.dodajPunkty(3);
			}
			
			t=gracz4.zwrocTarcze();
			if((r.zwrocKolor() == t.zwrocKolor1()) || (r.zwrocKolor() == t.zwrocKolor2()) || (r.zwrocKolor() == t.zwrocKolor3()))
			{
				gracz4.dodajPunkty(3);
			}
			
		}
		
		slotZamku = zamek.zwrocSlot(4);
		for(int i=0; i<slotZamku.size(); i++)
		{
			r=slotZamku.get(i);
			
			t=gracz1.zwrocTarcze();
			if((r.zwrocKolor() == t.zwrocKolor1()) || (r.zwrocKolor() == t.zwrocKolor2()) || (r.zwrocKolor() == t.zwrocKolor3()))
			{
				gracz1.dodajPunkty(2);
			}
			
			t=gracz2.zwrocTarcze();
			if((r.zwrocKolor() == t.zwrocKolor1()) || (r.zwrocKolor() == t.zwrocKolor2()) || (r.zwrocKolor() == t.zwrocKolor3()))
			{
				gracz2.dodajPunkty(2);
			}
			
			t=gracz3.zwrocTarcze();
			if((r.zwrocKolor() == t.zwrocKolor1()) || (r.zwrocKolor() == t.zwrocKolor2()) || (r.zwrocKolor() == t.zwrocKolor3()))
			{
				gracz3.dodajPunkty(2);
			}
			
			t=gracz4.zwrocTarcze();
			if((r.zwrocKolor() == t.zwrocKolor1()) || (r.zwrocKolor() == t.zwrocKolor2()) || (r.zwrocKolor() == t.zwrocKolor3()))
			{
				gracz4.dodajPunkty(2);
			}
			
		}
		
	}
	
	public void punktowanieZaKroliki()
	{
		List<Krolik> k = gracz1.zwrocKroliki();
		if(k.isEmpty() == false)
		{
			for(int i=0; i<k.size(); i++)
			{
				gracz1.dodajPunkty(k.get(i).zwrocPunkty());
			}
		}
		
		k = gracz2.zwrocKroliki();
		if(k.isEmpty() == false)
		{
			for(int i=0; i<k.size(); i++)
			{
				gracz2.dodajPunkty(k.get(i).zwrocPunkty());
			}
		}
		
		k = gracz3.zwrocKroliki();
		if(k.isEmpty() == false)
		{
			for(int i=0; i<k.size(); i++)
			{
				gracz3.dodajPunkty(k.get(i).zwrocPunkty());
			}
		}
		
		k = gracz4.zwrocKroliki();
		if(k.isEmpty() == false)
		{
			for(int i=0; i<k.size(); i++)
			{
				gracz4.dodajPunkty(k.get(i).zwrocPunkty());
			}
		}
	}
	
	public Boolean zwrocCzyKoniecGry()
	{
		return czyKoniecGry;
	}
	
	public void sprawdzCzyKoniecGry()
	{
		if(zamek.zwrocNastepnyWolny()==0)
		{
			czyKoniecGry = true;
		}
		if(policzRycerzyNaPlanszy()==2)
		{
			czyKoniecGry = true;
			czyKoniecGryDwajRycerze = true;
		}
	}
	
	
	public void wypiszTestowoKostki()
	{
		System.out.println("----------KOSTKI----------");
		for(int i=0; i<kostki.size(); i++)
		{
			kostki.get(i).wypiszKostke();
		}
	}
	
	public void wypiszTestowoPlansze()
	{
		System.out.println("----------PLANSZA----------");
		//plansza.ruszRycerzaOLiczbePol(7,"zielony");
		//plansza.ruszSmoka(zetonySmoka.get(liczbaRund).zwrocWartosc());
		plansza.wypiszTestowo();
	}
	
	public void wypiszTestowoGraczy()
	{
		System.out.println("----------GRACZE----------");
		gracz1.wypiszTestowo();
		gracz2.wypiszTestowo();
		gracz3.wypiszTestowo();
	}
	
	public void wypiszAktywneKostki()
	{
		System.out.println("----------AKTYWNE KOSTKI----------");
		for(int i=0; i<kostki.size(); i++)
		{
			if(kostki.get(i).zwrocCzyAktywna() == true)
			{
				kostki.get(i).wypiszKostke();
			}
		}
		
	}
	
	public void wypiszNieAktywneKostki()
	{
		System.out.println("----------NIEAKTYWNE KOSTKI----------");
		for(int i=0; i<kostki.size(); i++)
		{
			if(kostki.get(i).zwrocCzyAktywna() == false)
			{
				kostki.get(i).wypiszKostke();
			}
		}
		
	}
	
	public void wypiszDostepneScianki()
	{
		System.out.println("----------DOSTEPNE SCIANKI AKTYWNYCH KOSTEK----------");
		for(int i=0; i<kostki.size(); i++)
		{
			if(kostki.get(i).zwrocCzyAktywna() == true)
			{
				kostki.get(i).wypiszScianke(kostki.get(i).zwrocWyrzuconyNumer());
			}
		}
	}
	
	public void wypiszKtoryGracz()
	{
		System.out.println("----------GRACZ "+ ktoryGracz +"----------");
	}
	
	public void wypiszZamek()
	{
		zamek.wypiszZamek();
	}
	
}
