package properties;
import java.io.FileInputStream;
import java.util.Properties;

public class MyProperties {
    public static void main(String[] args)
        throws Exception {

        // set up new properties object
        // from file "myProperties.txt"
        FileInputStream propFile =
            new FileInputStream( "/Users/anassiry/eclipse-workspace/JavaPracticesNov2018/src/properties/myProperties.txt");
        Properties p =
            new Properties(System.getProperties());
        
        p.load(propFile);

        // set the system properties
        System.setProperties(p);
        // display new properties
        System.getProperties().list(System.out);
    }
}