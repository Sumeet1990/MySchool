package com.myschool.util;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class EmailUtility {
	
	
	public static void senEmail (String userName, String toMailId, Integer owner_id, String randamValue) {
		
	final String username = "sumurocks1990@gmail.com";
	final String password = "Sumit@1990";

	Properties props = new Properties();
	props.put("mail.smtp.auth", "true");
	props.put("mail.smtp.starttls.enable", "true");
	props.put("mail.smtp.host", "smtp.gmail.com");
	props.setProperty("mail.mime.address.strict", "false"); 
	props.put("mail.smtp.port", "587");

	Session session = Session.getInstance(props,
	  new javax.mail.Authenticator() {
		protected PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication(username, password);
		}
	  });
	try{
		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress("sumurocks1990@gmail.com"));
		message.setRecipients(Message.RecipientType.TO,
			InternetAddress.parse("sumurocks1989@gmail.com"));
		message.setSubject("Forgot Password");

		String email = "<td width=\"427\" valign=\"top\" style=\"padding:10px 10px;font-size:11px;font-family:verdana\">"
				+"		<p>Dear "+userName+",<br>"
				+"		    <br>Here are the login details for your Account.<br>"
				  +"      	    <br>"
					+"	    <strong>User ID: </strong>"+userName+"<br>"
						+"    <strong>To change your password: <a href=http://localhost:8090/shop/forgotPassword?type="+randamValue+"&owner_id="+owner_id+" >Click Here</a></strong><br>"
				        	+"    <br>"
						    +"Wishing  you a great Day ahead."
					+"	</p>"
						+"<br>"
				      		+"<strong>Best Regards,<br>"
				+"Support Team		"
				  +"    		<p><strong><br>"
					+"        </strong></p>"
						+" <p>&nbsp;</p>"
						+" <p>&nbsp;</p>"
						 +"<p>&nbsp;</p>"
						 +"<p>&nbsp;</p>";
		// Send the actual HTML message, as big as you like
        message.setContent(email,
                           "text/html" );

		
		Transport.send(message);

		System.out.println("Done");

	} catch(MessagingException e) {
		throw new RuntimeException(e);
	}
	}
}



