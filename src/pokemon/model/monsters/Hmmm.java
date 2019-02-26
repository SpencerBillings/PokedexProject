package pokemon.model.monsters;

import pokemon.model.Pokemon;
import pokemon.model.types.*;

public class Hmmm extends Pokemon implements Normal
{
	public Hmmm()
	{
		super(-1, "Hmmm");
	}
	
	public Hmmm(String name)
	{
		super(-1, name);
	}
	
	public Hmmm(int number, String name)
	{
		super(number, name);
	}
	
	public void scratch()
	{
		System.out.print("Hmmmmmm");
	}
}
