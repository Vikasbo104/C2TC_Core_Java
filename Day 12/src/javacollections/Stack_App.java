package javacollections;

import java.util.Iterator;
import java.util.LinkedList;

import java.util.List;


public class Stack_App
{
	void Display(List<String> list)
	{
		Iterator<String> obj = list.iterator();
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
	System.out.println(obj1);
	
		Stack_App app = new Stack_App();
		app.Display(obj1);
		
	}

}
