package nogi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PulaTarcz 
{
	private List<Tarcza> tarcze = new ArrayList<Tarcza>();
	
	public PulaTarcz()
	{
		tarcze.add(new Tarcza("niebieski","fioletowy","zolty"));
		tarcze.add(new Tarcza("niebieski","zielony","rozowy"));
		tarcze.add(new Tarcza("rozowy","pomaranczowy","zolty"));
		tarcze.add(new Tarcza("czarny","fioletowy","rozowy"));
		tarcze.add(new Tarcza("czarny","zielony","zolty"));
		tarcze.add(new Tarcza("zielony","pomaranczowy","fioletowy"));
		tarcze.add(new Tarcza("czarny","niebieski","pomaranczowy"));
		Collections.shuffle(tarcze);
	}
	
	public List<Tarcza> zwrocPule()
	{
		return tarcze;
	}
}
