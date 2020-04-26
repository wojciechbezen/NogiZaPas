package nogi;

import java.util.ArrayList;
import java.util.List;

public class PulaKosci 
{
	private List<Kostka> kostki = new ArrayList<Kostka>();
	
	
	private Kostka zielona = new Kostka("zielony", 
			new Scianka("zielony","3",false), new Scianka("zielony","2",true), 
			new Scianka("zielony","6",false), new Scianka("zielony","2",true), 
			new Scianka("bialy","2",false), new Scianka("zielony","cofnij",false));
	
	private Kostka zolta = new Kostka("zolty", 
			new Scianka("zolty","1",false), new Scianka("zolty","3",false), 
			new Scianka("zolty","cofnij",false), new Scianka("zolty","3",false), 
			new Scianka("bialy","2",false), new Scianka("zolty","5",true));
	
	private Kostka czarna = new Kostka("czarny", 
			new Scianka("czarny","5",false), new Scianka("czarny","3",false), 
			new Scianka("czarny","2",false), new Scianka("bialy","3",false), 
			new Scianka("czarny","cofnij",false), new Scianka("czarny","6",false));
	
	private Kostka niebieska = new Kostka("niebieski", 
			new Scianka("niebieski","1",false), new Scianka("niebieski","3",true), 
			new Scianka("niebieski","1",false), new Scianka("niebieski","4",false), 
			new Scianka("niebieski","cofnij",false), new Scianka("niebieski","5",false));
	
	private Kostka pomaranczowa = new Kostka("pomaranczowy", 
			new Scianka("pomaranczowy","2",false), new Scianka("pomaranczowy","4",false), 
			new Scianka("pomaranczowy","5",false), new Scianka("pomaranczowy","3",true), 
			new Scianka("bialy","4",false), new Scianka("pomaranczowy","1",false));
	
	private Kostka rozowa = new Kostka("rozowy", 
			new Scianka("rozowy","4",false), new Scianka("rozowy","6",false), 
			new Scianka("rozowy","3",false), new Scianka("rozowy","1",true), 
			new Scianka("bialy","1",false), new Scianka("rozowy","cofnij",false));
	
	private Kostka fioletowa = new Kostka("fioletowy", 
			new Scianka("fioletowy","1",false), new Scianka("fioletowy","2",false), 
			new Scianka("fioletowy","6",false), new Scianka("fioletowy","cofnij",false), 
			new Scianka("bialy","3",false), new Scianka("fioletowy","4",true));
	
	private Kostka biala = new Kostka("bialy", 
			new Scianka("bialy","2",false), new Scianka("bialy","naprzod",false), 
			new Scianka("bialy","3",false), new Scianka("bialy","1+1",true), 
			new Scianka("bialy","cofnij",false), new Scianka("bialy","5",false));
	
	
	public PulaKosci()
	{
		kostki.add(zielona);
		kostki.add(pomaranczowa);
		kostki.add(rozowa);
		kostki.add(czarna);
		kostki.add(fioletowa);
		kostki.add(zolta);
		kostki.add(niebieska);
		kostki.add(biala);
	}
	
	public void wypiszPule()
	{
		for(int i=0; i<kostki.size(); i++)
		{
			kostki.get(i).wypiszKostke();
			System.out.println("-------------------------");
		}
	}
	
	public List<Kostka> zwrocPule()
	{
		return kostki;
	}
	
	public void usunKostke(int i)
	{
		kostki.remove(i);
	}
}




