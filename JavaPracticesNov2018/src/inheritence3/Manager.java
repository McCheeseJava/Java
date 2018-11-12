package inheritence3;
public class Manager extends Employee
{
	protected String department;
	protected String name = "Mamoon";
	

	public String getDetails()
	{
		return "Name: " + name + "\n" + "Salary: " + 
 			salary +  "\n" + "Manager of: " + department;
	}

        public String print()
	{
		return super.getDetails();
	}

        public static void main (String args[])
	{
		Manager obj = new Manager();
  		System.out.println( obj.getDetails());
		System.out.println( obj.print());

                if (obj instanceof Manager)
			System.out.println("success");
		else	
			System.out.println("failure");

		if (obj instanceof Employee)
			System.out.println("success");
		else
			System.out.println("failure");
	}
}
