package nogi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PulaZetonowSmoka 
{
	private List<ZetonSmoka> zetonySmoka = new ArrayList<ZetonSmoka>();
	
	public PulaZetonowSmoka()
	{
		zetonySmoka.add(new ZetonSmoka(3));
		zetonySmoka.add(new ZetonSmoka(4));
		zetonySmoka.add(new ZetonSmoka(5));
		zetonySmoka.add(new ZetonSmoka(5));
		zetonySmoka.add(new ZetonSmoka(6));
		zetonySmoka.add(new ZetonSmoka(6));
		zetonySmoka.add(new ZetonSmoka(7));
		zetonySmoka.add(new ZetonSmoka(8));
		Collections.shuffle(zetonySmoka);
		
	}
	
	public List<ZetonSmoka> zwrocPule()
	{
		return zetonySmoka;
	}
}

