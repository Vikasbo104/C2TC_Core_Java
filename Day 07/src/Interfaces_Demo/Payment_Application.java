package Interfaces_Demo;

interface WorldBank
{
	float rateofInterest();
}
interface RBI 
{
	float RBI_rateofInterest();
}

public class Payment_Application implements WorldBank, RBI
{
	public float rateofInterest() 
	{
		return 9.0f;
	}
	public float RBI_rateofInterest() 
	{
		return 9.10f;
	}
	public static void main(String[] args) 
	{
		WorldBank obj = new Payment_Application();
		RBI obj2 = new Payment_Application();
		
		System.out.println(obj.rateofInterest());   // 9.0f
		System.out.println(obj2.RBI_rateofInterest()); // 9.10f
	}
	

}
