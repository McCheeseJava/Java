package constructors2;
public class Child extends Parent 
{
	private int z;

	public Child(int z) 
	{
		super (4, 4);
		this.z = z;
	}

	public void print()
        {
                System.out.println(" " + x + " " + y + " " + z);
        }


}
