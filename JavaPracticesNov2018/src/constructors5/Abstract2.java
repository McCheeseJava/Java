package constructors5;
abstract class Parent2
{
	Parent2()
	{
		System.out.println("Parent's default constructor");
	}
	//parent constructor will be called prior to child's

	abstract void method();

}

class MyAbstract2 extends Parent2
{
	MyAbstract2()
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