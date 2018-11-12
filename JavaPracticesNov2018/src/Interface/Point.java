package Interface;
public class Point implements Shape, Color
{
	public double area()
	{
		return 9.9;
	}

	public double volume()
	{
		return 9.9;
	}

	public String myColor()
	{
		return "red";
	}

	public static void main (String args[]) 
	{
		Point myPoint = new Point();
		System.out.println(myPoint.area());
		System.out.println(myPoint.volume() + " " + myPoint.myColor() );
	}

}
		
