package pokemon.model;

public class Haunter extends Pokemon implements Ghost
{
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
