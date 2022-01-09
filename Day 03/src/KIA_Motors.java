
class Mumbai_Rules
{
	 int maxSpeed = 60;
	 Mumbai_Rules()
	 {
		 System.out.println("Speed is "+maxSpeed);
	 }
}
class Seltos extends Mumbai_Rules
{
	int maxSpeed = 180;
	Seltos()
	{
		super();
		System.out.println("Speed is "+maxSpeed);
	}
}
public class KIA_Motors 
{
	public static void main(String[] args) 
	{	
		Seltos obj = new Seltos();
	}
}
