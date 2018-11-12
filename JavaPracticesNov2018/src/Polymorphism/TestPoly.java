public class TestPoly
{
	public static void main (String[] args)
	{
		Employee e[] = new Employee[4];

		e[0] = new Employee();
		e[1] = new Manager();
		e[2] = new Supervisor();

		for (int i = 0; i < 3; i++)
		{
			e[i].getDetails();

			if (e[i] instanceof Manager)
			System.out.println(" " + e[i] + " is an instance of Manager");

			if (e[i] instanceof Supervisor)
			{
       		                 System.out.println(" " + e[i] + " is an instance of Supervisor");
		                 Supervisor s = (Supervisor) (e[i]);	
				 System.out.println(s.region);
			}

		}

	}

/*
So the point of Polymorphism is that you can have a generic 
function in the parent class that will work and suffice the needs of all the
other classes that are the childern of the parent class.

For instance, we need each class to print a common message at its
ending. instead of writing 10 different methods for the ten of our
classes we can just have one method in the parent class.

then by doing:

Parent object = new Child();
object.commonMethod();

we can print this message for each class that is derived from the parent class.
*/

} 
