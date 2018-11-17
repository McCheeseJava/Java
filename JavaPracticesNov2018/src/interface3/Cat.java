package interface3;
public class Cat extends Animal implements Pet
{
	public void eat()
	{
		System.out.println("my cat is eating.");
	}

	public void shower()
	{
		System.out.println("my cat is showering.");
	}

	public static void main (String args[])
	{
		Cat myCat = new Cat();
		myCat.eat();
		myCat.shower();
		myCat.sleep();
	}

}
