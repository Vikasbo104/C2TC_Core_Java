package ExceptionHandling;

public class App_New 
{
	void validate(int age)
	{
		try {
			if(age<18)
			{
				throw new ArithmeticException("They are NOT Eligible for C2TC");
				// CODE - renter - validate - new input
			}
			else
			{
				System.out.println("They are eligible for C2TC");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
	
		App_New obj = new App_New();
		obj.validate(10);
		
		System.out.println("Welcome to C2TC "); // YES
		
	}

}
