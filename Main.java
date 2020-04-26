package nogi;

import java.util.Scanner;

public class Main 
{
	public static void main(String [] args)
	  {
			Gra g = new Gra(3);
		
			//wypiszKilkaTestowychKolejek(g);
			//wypiszKilkaTestowychKolejek(g);
			//wypiszKilkaTestowychKolejek(g);
			//wypiszKilkaTestowychKolejek(g);
		
		
			Scanner in = new Scanner(System.in);
			String s;
			

			
			for(;;)
			{
				g.wypiszTestowoPlansze();
				g.wypiszDostepneScianki();
				g.wypiszKtoryGracz();
				

				s = in.nextLine();
				
				switch(s)
				{
					case "1":
						g.uruchomKostke("zielony");
						break;
					case "2":
						g.uruchomKostke("czarny");
						break;
					case "3":
						g.uruchomKostke("rozowy");
						break;
					case "4":
						g.uruchomKostke("niebieski");
						break;
					case "5":
						g.uruchomKostke("zolty");
						break;
					case "6":
						g.uruchomKostke("fioletowy");
						break;
					case "7":
						g.uruchomKostke("pomaranczowy");
						break;
					case "8":
						g.uruchomKostke("bialy");
						break;
				}
				
				
				s = in.nextLine();
				
				switch(s)
				{
					case "1":
						g.uruchomRycerzaBialaScianka("zielony");
						break;
					case "2":
						g.uruchomRycerzaBialaScianka("czarny");
						break;
					case "3":
						g.uruchomRycerzaBialaScianka("rozowy");
						break;
					case "4":
						g.uruchomRycerzaBialaScianka("niebieski");
						break;
					case "5":
						g.uruchomRycerzaBialaScianka("zolty");
						break;
					case "6":
						g.uruchomRycerzaBialaScianka("fioletowy");
						break;
					case "7":
						g.uruchomRycerzaBialaScianka("pomaranczowy");
						break;
				
				}
				
				g.wypiszZamek();
			}
			
			
			
	  }
	
	
	public static void wypiszKilkaTestowychKolejek(Gra g)
	{
		
		
		//g.wypiszAktywneKostki();
		g.wypiszTestowoPlansze();
		g.wypiszDostepneScianki();
		//g.wypiszNieAktywneKostki();
		g.wypiszKtoryGracz();
		g.uruchomKostke("zielony");
		g.uruchomRycerzaBialaScianka("zielony");
		
		//g.wypiszAktywneKostki();
		g.wypiszTestowoPlansze();
		g.wypiszDostepneScianki();
		//g.wypiszNieAktywneKostki();
		g.wypiszKtoryGracz();
		//g.wypiszTestowoPlansze();
		g.uruchomKostke("czarny");
		g.uruchomRycerzaBialaScianka("czarny");
		
		//g.wypiszAktywneKostki();
		g.wypiszTestowoPlansze();
		g.wypiszDostepneScianki();
		//g.wypiszNieAktywneKostki();
		g.wypiszKtoryGracz();
		//g.wypiszTestowoPlansze();
		g.uruchomKostke("rozowy");
		g.uruchomRycerzaBialaScianka("rozowy");
		
		//g.wypiszAktywneKostki();
		g.wypiszTestowoPlansze();
		g.wypiszDostepneScianki();
		//g.wypiszNieAktywneKostki();
		g.wypiszKtoryGracz();
		//g.wypiszTestowoPlansze();
		g.uruchomKostke("niebieski");
		g.uruchomRycerzaBialaScianka("niebieski");
		
		//g.wypiszAktywneKostki();
		g.wypiszTestowoPlansze();
		g.wypiszDostepneScianki();
		//g.wypiszNieAktywneKostki();
		g.wypiszKtoryGracz();
		//g.wypiszTestowoPlansze();
		g.uruchomKostke("zolty");
		g.uruchomRycerzaBialaScianka("zolty");
		
		//g.wypiszAktywneKostki();
		g.wypiszTestowoPlansze();
		g.wypiszDostepneScianki();
		//g.wypiszNieAktywneKostki();
		g.wypiszKtoryGracz();
		//g.wypiszTestowoPlansze();
		g.uruchomKostke("bialy");
		g.uruchomRycerzaBialaScianka("zolty");
		
		//g.wypiszAktywneKostki();
		g.wypiszTestowoPlansze();
		g.wypiszDostepneScianki();
		//g.wypiszNieAktywneKostki();
		g.wypiszKtoryGracz();
		//g.wypiszTestowoPlansze();
		g.uruchomKostke("fioletowy");
		g.uruchomRycerzaBialaScianka("fioletowy");
		
		//g.wypiszAktywneKostki();
		g.wypiszTestowoPlansze();
		g.wypiszDostepneScianki();
		//g.wypiszNieAktywneKostki();
		g.wypiszKtoryGracz();
		//g.wypiszTestowoPlansze();
		g.uruchomKostke("pomaranczowy");
		g.uruchomRycerzaBialaScianka("pomaranczowy");
		
		g.wypiszTestowoPlansze();
		g.wypiszDostepneScianki();
		//g.wypiszNieAktywneKostki();
		g.wypiszKtoryGracz();
		
		
	}
}
