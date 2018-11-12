package inheritence3;
public class Employee
{
	protected String name = "haroon";
	protected double salary;
	protected long   birthdate;

	protected String getDetails()
	{
		return "Name:  " + name + "\n" + "salary:   " +
			salary;
	}
}


