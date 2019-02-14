package pokemon.model.monsters;

import pokemon.model.types.*;

public class Meowth extends Pokemon implements Normal
{
	public Meowth()
	{
		super(52, "Mewoth");
	}
	
	public Meowth(String name)
	{
		super(52, name);
	}
	
	public Meowth(int number, String name)
	{
		super(number, name);
	}

	public void rocketMotto()
	{
		System.out.println("To protect the world from devastation!\n To unite all peoples within our nation!\n To denounce the evils of truth and love!\n To extend our reach to the stars above!\n Jessie!\n James!\n Team Rocket blasts off at the speed of light!\n Surrender now, or prepare to fight!\n Meowth! That's right!");
	}
	
	public void scratch()
	{
		System.out.println("");
	}
}
