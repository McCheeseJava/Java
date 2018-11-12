/*
 * SchedAlertDaemon.java
 *
 * Created on March 20, 2005, 6:03 PM
 */


import java.io.*;

/**
 *
 * @author Owner
 */
public class SchedAlertDaemon
{

    private String arr[];
    private File fileName;

    /** Creates a new instance of SchedAlertDaemon */
    public SchedAlertDaemon()
    {}

     public void readEngineersFromFile()
     {
         fileName = CreateFile.getFileName();
         System.out.println("Reading file: " + fileName);

         try
         {

             BufferedReader in = new BufferedReader( new FileReader(fileName) );
             String line;
             line = in.readLine();
             while (line != null)
             {
                 arr = line.split(":");
                 System.out.println(arr[0] + " " + arr[1]);
                 line = in.readLine();
             }

             in.close();

         }

         catch (IOException e)
         {
             System.out.println("file not found");
             e.printStackTrace();

         }


     }

}
