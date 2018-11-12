



 public class PassByValue
 {

	 public int intIt( int i )
	 {
		 return ++i;
	 }

	 public boolean boolIt( boolean b )
	 {
		 b = true;
		 return b;
	 }

	 public char charIt( char c )
	 {
		 return (char) (c + '1');

	 }

  	 public static void main (String args[])
  	 {

		 PassByValue o = new PassByValue();

		 int i = 0;
		 System.out.println(o.intIt(i));
		 System.out.println(i);

		 char c = 'A';
		 System.out.println(o.charIt( c ));
		 System.out.println(c);

		 boolean b = false;
		 System.out.println(o.boolIt(b));
		 System.out.println(b);

		 System.out.println(o.hashCode());
		 System.out.println(o.hashCode());
		 System.out.println(o.hashCode());




	 }

  }
