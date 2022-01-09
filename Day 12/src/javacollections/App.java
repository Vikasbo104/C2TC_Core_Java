package javacollections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class App 
{

	void Display(List<String> list)
	{
		ListIterator<String> obj = list.listIterator();
		while(obj.hasNext())
		{
			System.out.println("Elements is: "+obj.next());
		}
	}

	public static void main(String[] args) 
	{
	
		List<String> obj1 = new LinkedList<>();
		obj1.add("Amit");
		obj1.add("Chaitanya");
		obj1.add("Trupti");
		obj1.add("Akshay");
		obj1.add("Guru");
		
		App app = new App();
		
		obj1.sort(null);
		app.Display(obj1);
		
		System.out.println("####################");
	
		Collections.reverse(obj1);
		app.Display(obj1);
	

	}

}
