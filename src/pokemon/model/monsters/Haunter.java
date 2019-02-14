package pokemon.model.monsters;

import pokemon.model.types.*;

public class Haunter extends Gastly implements Ghost, Poison
{
	public Haunter()
	{
		super(93, "Haunter");
	}
	
	public Haunter(String name)
	{
		super(92, name);
	}
	
	public Haunter(int number, String name)
	{
		super(number, name);
	}
	public void nightmare()
	{
		System.out.println("");
	}
	
	public void lick()
	{
		System.out.println("");
	}
	
	public void curse()
	{
		System.out.println("A terrible curse has fallen upon you!");
	}
	
}
