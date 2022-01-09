
class Parent_Super
{
	void disp()
	{
		System.out.println("I am from Parent_SUper class");
	}
}
class Parent_One
{
	void disp()
	{
		System.out.println("I am from Parent_ONE class");
	}
}
class Parent_Two extends Parent_One
{
	void disp()
	{
		System.out.println("I am from Parent_TWO class");
	}
}


public class App extends Parent_One
{
	public static void main(String[] args) 
	{
		Parent_One obj = new Parent_One();
		obj.disp();

	}

}
