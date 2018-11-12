/*
 * SchedAlertDaemon.java
 *
 * Created on March 20, 2005, 6:03 PM
 */


import java.io.*;
import javax.mail.MessagingException;

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
		 String emailSubjectTxt = "a friendly reminder: your LT starting in 10 minutes";
		 String emailMsgTxt     = "This is an automated email. Please do not respond to this sender.\nThis is just a friendly reminder to please log in to LT in 10 minutes";
		 String emailFromAddress= "LTAlertDaemon";
		 SendMailUsingAuthentication smtpMailSender = new SendMailUsingAuthentication();

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
                 smtpMailSender.postMail(arr[0], emailSubjectTxt, emailMsgTxt, emailFromAddress);
                 line = in.readLine();
             }

             in.close();

         }

         catch (IOException e)
         {
             System.out.println("file not found");
             e.printStackTrace();

         }

         catch (MessagingException e)
         {
			 System.out.println("Messaging exception occured!");
			 e.printStackTrace();
		 }


     }

}
