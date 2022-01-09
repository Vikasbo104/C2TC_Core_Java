import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputDemo 
{
	public static void main(String[] args) throws IOException 
	{
		
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your pincode");
		int x = Integer.parseInt(obj.readLine());
		

		
		System.out.println("Entered pincode is "+x);
		
		
		
		
	}

}
