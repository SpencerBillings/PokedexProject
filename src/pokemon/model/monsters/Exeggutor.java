package pokemon.model.monsters;

import pokemon.model.types.*;

public class Exeggutor extends Execute implements Grass, Dragon
{
	public Exeggutor()
	{
		super(103, "Exeggutor");
	}
	
	public Exeggutor(String name)
	{
		super(103, name);
	}
	
	public Exeggutor(int number, String name)
	{
		super(number, name);
	}
	
	public void dragonPulse()
	{
		System.out.println("");
	}
	
	public void leafBlade()
	{
		System.out.println("");
	}
	
	public void dragonRage()
	{
		System.out.println("");
	}
}
