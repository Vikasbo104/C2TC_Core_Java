package ExceptionHandling;


class A
{
	
}
public class App 
{
	A obj;
	public static void main(String[] args) 
	{
			int brr[] = new int[4];
		try 
		{
			brr[9] = 50 /0;
		} 
		catch (ArithmeticException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException obj1)
		{
			obj1.printStackTrace();
		}
		catch(Exception obj)
		{
			obj.printStackTrace();
		}
		System.out.println("I am the last line of this pgm");
	
	}
}
