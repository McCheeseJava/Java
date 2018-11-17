/*
 * SchedAlertDaemon.java
 *
 * Created on March 20, 2005, 6:03 PM
 */


import java.io.*;
import javax.mail.MessagingException;
import java.text.*;
import java.util.*;

/**
 *
 * @author Owner
 */
public class SchedAlertDaemon
{

    private String arr[];
    //private File fileName;
    private Date now = new Date();

   Locale currentLocale = new Locale("en");
DateFormat dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, currentLocale); 
Date date = new Date();
   String fileName = dateFormatter.format(date);


    /** Creates a new instance of SchedAlertDaemon */
    public SchedAlertDaemon()
    {}

     public void readEngineersFromFile()
     {
		 String emailSubjectTxt = "a friendly reminder: your LT starting in 10 minutes";
		 String emailMsgTxt     = "This is an automated email. Please do not respond to this sender.\nThis is just a friendly reminder to please log in to LT in 10 minutes.\n\nRegards,\nJavaApps";
		 String emailFromAddress= "LTAlertDaemon@Sun.COM";
		 String time;
		 SendMailUsingAuthentication smtpMailSender = new SendMailUsingAuthentication();

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

				 time = DateFormat.getTimeInstance(DateFormat.SHORT).format(now)  ;

				 System.out.println("test :  " + arr[1] + "  " + time);


                 if (  arr[1].equals("11") && time.equals("10:50 AM") )
                 {
					 smtpMailSender.postMail(arr[0], emailSubjectTxt, emailMsgTxt, emailFromAddress);
				 }

				 if (  arr[1].equals("12") && time.equals("11:50 AM") )
				 {
					 smtpMailSender.postMail(arr[0], emailSubjectTxt, emailMsgTxt, emailFromAddress);
				 }

				 if (  arr[1].equals("1") && time.equals("12:50 PM") )
				 {
					 smtpMailSender.postMail(arr[0], emailSubjectTxt, emailMsgTxt, emailFromAddress);
				 }

				 if (  arr[1].equals("2") && time.equals("1:50 PM") )
				 {
					 smtpMailSender.postMail(arr[0], emailSubjectTxt, emailMsgTxt, emailFromAddress);
				 }

				 if (  arr[1].equals("3") && time.equals("2:50 PM") )
				 {
					 smtpMailSender.postMail(arr[0], emailSubjectTxt, emailMsgTxt, emailFromAddress);
				 }

				 if (  arr[1].equals("4") && time.equals("3:50 PM") )
				 {
					 smtpMailSender.postMail(arr[0], emailSubjectTxt, emailMsgTxt, emailFromAddress);
				 }

				 if (  arr[1].equals("5") && time.equals("4:50 PM") )
				 {
					 smtpMailSender.postMail(arr[0], emailSubjectTxt, emailMsgTxt, emailFromAddress);
				 }

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
     
     
     public static void main(String args[])
     {
     	SchedAlertDaemon daemon = new SchedAlertDaemon();
        daemon.readEngineersFromFile();
        
      }




}
