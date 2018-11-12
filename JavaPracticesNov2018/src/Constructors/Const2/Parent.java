public class Parent
{
	protected int x;
	protected int y;

	public Parent(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	//public Parent() {}
	//if this line is deleted Test won't get build


	public void print()
	{
		System.out.println(" " + x + " " + y);
	}

	public void print2()
	{
		System.out.println("hi");
	}

}
