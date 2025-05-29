abstract class Plane
{
	void takeoff()
	{
		System.out.println("Plane takeoff");
	}
	abstract void fly();
	void land()
	{
		System.out.println("Plane landing");
	}	
}
class cargoplane extends Plane
{
	@Override
	void fly ()
	{
		System.out.println("CargoPlane flew");
		}
}

class Mainplane {
	public static void main(String[] args) {
		cargoplane cp=new cargoplane();
		cp.takeoff();
		cp.land();
		cp.fly();
	}
}
