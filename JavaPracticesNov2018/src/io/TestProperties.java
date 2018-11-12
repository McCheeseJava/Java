package io;
import java.util.Properties;
import java.util.Enumeration;

public class TestProperties
{
	public static void main (String args[])
	{
		Properties props = System.getProperties();
		Enumeration prop_names = props.propertyNames();

		while ( prop_names.hasMoreElements()  )
		{
			String prop_name = (String) prop_names.nextElement();
			String property_value = props.getProperty (prop_name);

			System.out.println( prop_name + " == " + property_value );
		}

	}

}
