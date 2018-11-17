package file3;
/*
 * Model.java
 *
 * Created on March 3, 2006, 1:36 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
//package pullq.model;

import java.util.*;
import java.io.*;
import java.text.*;

/**
 *
 * @author hn
 */
public class Model {

    /** Creates a new instance of Model */

    private String engName;
    private String caseNum;
    private String sev;
    private File myFile  = new File (".", DateFormat.getDateInstance(DateFormat.DEFAULT, new Locale("en") ).format(new Date()));
    private File tmpFile = new File (".", ("tmpfile") );

    public Model() {
		try{
			myFile.createNewFile();
			tmpFile.createNewFile();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
    }

    public void setEngName(String engName){
        this.engName = engName;
    }

    public void setCaseNum(String caseNum){
         this.caseNum = caseNum;
    }

    public void setSev(String sev){
         this.sev = sev;
         recordData();
    }


    public String getEngName(){
        return engName;
    }

    public String getCaseNum(){
         return caseNum;
    }

    public String getSev(){
         return sev;
    }

     private void recordData(){

        BufferedReader br = null;
        BufferedWriter bw = null;
        BufferedWriter tmpbw = null;
        boolean repeat = false;

        LinkedList list = new LinkedList();
        list.add(0, engName);
        list.add(1, caseNum);
        list.add(2, sev);

        try{
			br = new BufferedReader(  new InputStreamReader(new FileInputStream(myFile)) );
			bw    = new BufferedWriter(new FileWriter( myFile, true));
            tmpbw = new BufferedWriter(new FileWriter(tmpFile));

			String arr[];
			String line = null;

			if ( (line = br.readLine() ) == null){
				System.out.println("inside if....with " + getEngName());
				bw.write(list.get(0) + ":" + list.get(1) + ":" + list.get(2));
				bw.newLine();
				line = null;
				br.close();
			}

			else{
				System.out.println("inside else....with " + getEngName());
				br = new BufferedReader(  new InputStreamReader(new FileInputStream(myFile)) );
				while ( (line = br.readLine() ) != null){
					arr = line.split(":");
					System.out.println("arr[0]: " + arr[0] + " arr[1]: " + arr[1]);
					System.out.println("list.get(0): " + list.get(0) + " list.get(1): " + list.get(1) );
		    		if (  (  arr[0].equals(list.get(0))   )  && (  arr[1].equals(list.get(1))   )  ){
						repeat = true;
				    }

				}//while
				if (repeat == false){
					System.out.print("  " + list.get(0) + ":" + list.get(1) + ":" + list.get(2) );
					tmpbw.write(list.get(0) + ":" + list.get(1) + ":" + list.get(2));
					tmpbw.newLine();
					tmpbw.close();
				    append(tmpFile, myFile);
				}

		   }//else


		}//try

	    catch (IOException ioe) {
			ioe.printStackTrace();
		}

		finally{
			try{
				bw.close();
				br.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}

	}//recordData()


	private void append(File src, File dst) throws IOException {

        System.out.println("inside append...");
  		BufferedReader copyin = null;
        BufferedWriter copyout= null;

   	    String record = null;
   	    try{
			copyin  = new BufferedReader(new InputStreamReader(new FileInputStream(src)) );
			copyout = new BufferedWriter(new FileWriter(dst, true));

    		int len;
		    while (  (record = copyin.readLine() ) != null ) {
				System.out.println("inside append's while...");
				copyout.write(record);
				copyout.newLine();

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

    public static void main(String args[])
    {
		Model a = new Model();
		a.setEngName("Test");
		a.setCaseNum("12345678");
		a.setSev("2");
	}

}
