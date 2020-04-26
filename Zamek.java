package nogi;

import java.util.ArrayList;
import java.util.List;

public class Zamek 
{
	private List<Rycerz> pierwszySlot = new ArrayList<Rycerz>();
	private List<Rycerz> drugiSlot = new ArrayList<Rycerz>();
	private List<Rycerz> trzeciSlot = new ArrayList<Rycerz>();
	private List<Rycerz> czwartySlot = new ArrayList<Rycerz>();
	
	private Boolean czyPelny;
	
	private int nastepnyWolny;
	
	public Zamek()
	{
		czyPelny = false;
		nastepnyWolny = 1;
	}
	
	public void dodajRycerza(Rycerz rycerz)
	{
		switch(nastepnyWolny)
		{
			case 1:
				pierwszySlot.add(rycerz);
				nastepnyWolny=2;
				break;
			case 2:
				pierwszySlot.add(rycerz);
				nastepnyWolny=3;
				break;
			case 3:
				pierwszySlot.add(rycerz);
				nastepnyWolny=4;
				break;
			case 4:
				pierwszySlot.add(rycerz);
				nastepnyWolny=0;
				break;
		}
		
		/*if(pierwszySlot.isEmpty()==true)
		{
			pierwszySlot.add(rycerz);
			nastepnyWolny=2;
		}
		if(drugiSlot.isEmpty()==true)
		{
			drugiSlot.add(rycerz);
			nastepnyWolny=3;
		}
		if(trzeciSlot.isEmpty()==true)
		{
			trzeciSlot.add(rycerz);
			nastepnyWolny=4;
		}
		if(czwartySlot.isEmpty()==true)
		{
			czwartySlot.add(rycerz);
		}*/
	}
	
	public void dodajRycerzyWarunkowo(Rycerz rycerz)
	{
		if(nastepnyWolny == 1)
		{
			pierwszySlot.add(rycerz);
		}
		if(nastepnyWolny == 2)
		{
			drugiSlot.add(rycerz);
		}
		if(nastepnyWolny == 3)
		{
			trzeciSlot.add(rycerz);
		}
		if(nastepnyWolny == 4)
		{
			czwartySlot.add(rycerz);
		}
	}
	
	public int zwrocPunktyZaSlot(int slot)
	{
		switch(slot)
		{
			case 1:
				return 0;
			case 2:
				return 5;
			case 3:
				return 3;
			case 4:
				return 2;
		}
		return 999;
	}
	
	public int zwrocNastepnyWolny()
	{
		return nastepnyWolny;
	}
	
	
	public void wypiszZamek()
	{
		if(pierwszySlot.isEmpty() == false)
		{
			System.out.println("Pierwszy slot");
			for(int i=0; i<pierwszySlot.size(); i++)
			{
				System.out.println(pierwszySlot.get(i).zwrocKolor());
			}
			
			System.out.println("Drugi slot");
			for(int i=0; i<drugiSlot.size(); i++)
			{
				System.out.println(drugiSlot.get(i).zwrocKolor());
			}
			
			System.out.println("Trzeci slot");
			for(int i=0; i<trzeciSlot.size(); i++)
			{
				System.out.println(trzeciSlot.get(i).zwrocKolor());
			}
			
			System.out.println("Czwarty slot");
			for(int i=0; i<czwartySlot.size(); i++)
			{
				System.out.println(czwartySlot.get(i).zwrocKolor());
			}
		}
		
	}
	
	public List<Rycerz> zwrocSlot(int idx)
	{
		switch(idx)
		{
		case 1:
			return pierwszySlot;
		case 2:
			return drugiSlot;
		case 3:
			return trzeciSlot;
		}
		return czwartySlot;

	}
	
}
