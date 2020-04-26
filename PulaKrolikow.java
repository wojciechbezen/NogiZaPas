package nogi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PulaKrolikow 
{
	private List<Krolik> kroliki = new ArrayList<Krolik>();
	
	public PulaKrolikow()
	{
		kroliki.add(new Krolik(1));
		kroliki.add(new Krolik(1));
		kroliki.add(new Krolik(1));
		kroliki.add(new Krolik(2));
		kroliki.add(new Krolik(2));
		Collections.shuffle(kroliki);
	}
	
	public List<Krolik> zwrocPule()
	{
		return kroliki;
	}
}
