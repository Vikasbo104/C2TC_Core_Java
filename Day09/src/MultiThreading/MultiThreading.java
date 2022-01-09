package MultiThreading;
class Eclipse extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Eclipse Thread ID is "+Thread.currentThread().getId());
			try 
			{
				sleep(2000);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class MultiThreading 
{
	public static void main(String[] args) 
	{
		Eclipse obj1 = new Eclipse();
		obj1.start();
		
		Eclipse obj2 = new Eclipse();
		obj2.start();
	}
}
