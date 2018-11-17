package file3;
import java.io.*;
import java.text.*;
import java.util.*;

public class Append{

	public void append(File src, File dst) throws IOException {

  		BufferedReader copyin = null;
        BufferedWriter copyout= null;


   	    // Transfer bytes from in to out
   	    //int[] buf = new int[4096];
   	    int len;
   	    try{
			copyin = new BufferedReader(  new InputStreamReader(new FileInputStream(src)) );
			copyout = new BufferedWriter(new FileWriter(dst));

            while ((len = copyin.read()) > 0) {
				copyout.write(len);
			}
		}

		catch (IOException e){
   	        e.printStackTrace();
		}

		finally{
			try{
				copyin.close();
				copyout.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}


    }


    public static void main(String args[]){
		 File myFile = new File (".", DateFormat.getDateInstance(DateFormat.DEFAULT, new Locale("en") ).format(new Date()));
	     File tmpFile = new File (".", ("tmpfile") );

	     Append a = new Append();
	     try{
			 a.append(tmpFile, myFile);
		 }
		 catch(Exception e){
			 e.printStackTrace();
		 }
	}
}