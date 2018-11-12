abstract class Parent
{
	Parent()
	{
		System.out.println("Parent's default constructor");
	}
	//parent constructor will be called prior to child's

	abstract void method();

}

class MyAbstract extends Parent
{
	MyAbstract()
	{
			System.out.println("Child's default constructor");
	}

	public void method()
	{
		System.out.println("Hi from Child class");
	}

	public static void main(String args[])
	{
		Parent o = new MyAbstract();
		o.method();
		//new Parent().method(); error! abstract classes and interfaces cannot be instantiated

	}
}