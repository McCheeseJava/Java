package inheritence;
public class Employee
{
	protected String name;
	protected double salary;
	protected long   birthdate;

	protected String getDetails()
	{
		return "Name:  " + name + "\n" + "salary:   " +
			salary;
	}
}


