abstract class Softdrinks
{
	void taste()
	{
		System.out.println("taste");
	}
	abstract void Amount();
	abstract void Sugar();
	void fat()
	{
		System.out.println("Fat Contents");
	}
}

class Coke extends Softdrinks
{
	@Override
	void Amount()
	{
		System.out.println("Amount");
	}
	@Override
	void Sugar()
	{
		System.out.println("Sugar");
	}
	
}
class Mainannomous {
	public static void main(String[] args) {
		Coke c =new Coke();
		c.Amount();
		c.taste();
		c.Sugar();
		c.fat();
	}

}
