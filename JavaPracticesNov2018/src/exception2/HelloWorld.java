package exception2;
public class HelloWorld
{
	public static void main (String args[])
	{
		int i = 0;
		
		String greetings [] = new String[3];
		greetings[0] = "Hello world!";
		greetings[1] = "No, I mean it!";
		greetings[2] = "HELLO WORLD!";

		while ( i < 4 )
		{
			try
			{
				System.out.println(greetings[i]);
				i++;
		        }

			catch  (ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Exception caught, ending program gracefully!");
				i = ( greetings.length + 1 );
			}


		}

	
	}

}

