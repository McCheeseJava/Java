import java.util.Properties;

    public class Sysproperties {
        public static void main(String args[]) {
            Properties p = System.getProperties();
            p.list(System.out);
        }
    }
