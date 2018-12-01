package array2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Array2
{
	public static void main(String args[])
	{
		char data[] = new char[6];
		data[0] = 'a';
		System.out.println(data[0]);
	     File originalFile = new File("signature.jpg");
	        String encodedBase64 = null;
	        try {
	            FileInputStream fileInputStreamReader = new FileInputStream(originalFile);
	            byte[] bytes = new byte[(int)originalFile.length()];
	            fileInputStreamReader.read(bytes);
	            encodedBase64 = new String(Base64.encodeBase64(bytes));
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}

}
