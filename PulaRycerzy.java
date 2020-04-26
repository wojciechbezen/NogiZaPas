package nogi;

import java.util.ArrayList;
import java.util.List;

public class PulaRycerzy 
{
	private List<Rycerz> rycerze = new ArrayList<Rycerz>();
	
	public PulaRycerzy()
	{
		rycerze.add(new Rycerz("zielony", 9, true));
		rycerze.add(new Rycerz("pomaranczowy", 9, true));
		rycerze.add(new Rycerz("rozowy", 9, true));
		rycerze.add(new Rycerz("czarny", 9, true));
		rycerze.add(new Rycerz("fioletowy", 9, true));
		rycerze.add(new Rycerz("zolty", 9, true));
		rycerze.add(new Rycerz("niebieski", 9, true));
	}
	
	public List<Rycerz> zwrocPule()
	{
		return rycerze;
	}
	

}
