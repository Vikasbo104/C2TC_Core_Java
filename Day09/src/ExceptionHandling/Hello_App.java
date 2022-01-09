package ExceptionHandling;

import java.io.IOException;

public class Hello_App 
{

	void m1() 
	{
		System.out.println("No exception in this method");
	}
	
	
	void m2() throws IOException
	{
		throw new IOException("Device Error or exception may happen");
	}
	
	// Bhavesh
	void m3() throws ArithmeticException, IOException, ClassNotFoundException
	{
		throw new ArithmeticException("Arithmetic exception may happen");
		
	}
	
	public static void main(String[] args) 
	{
	

	}

}
