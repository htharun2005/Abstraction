abstract class Softdrinks
{
	void Taste()
	{
		System.out.println("Coke Taste");
	}
	abstract void Price();
	abstract void Sugar();
	abstract void Acids();
	void Flavour()
	{
		System.out.println("Flavour");
	}
	void Fat()
	{
		System.out.println("Fat Contents");
	}
}

class Coke extends Softdrinks
{
	@Override
	void Price()
	{
		System.out.println("Coke Price");
	}
	@Override
	void Sugar()
	{
		System.out.println("Coke Sugar Content");
	}
	@Override
	void Flavour()
	{
		System.out.println("Coke Flavour");
	}
	@Override
	void Acids()
	{
		System.out.println("Coke Acids");
		}
	
}
class Mainannomous {
	public static void main(String[] args) {
		Coke c =new Coke();
		c.Price();
		c.Taste();
		c.Sugar();
		c.Fat();
		c.Acids();
		c.Flavour();
	}

}
