package com.prasant.SendMailJava;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class HandleMail {

	public void sendMail() throws Exception {
		
		// host : gmail is smtp
		String host = "smtp.gmail.com";
		
		Properties props = System.getProperties();
		
		System.out.println(props);
		
		// set propersties
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.auth", "true");
		
		// session
		Session mailSession = Session.getInstance(props, new MailAuthenticator());
		
		// create the message object
		MimeMessage mimeMessage = new MimeMessage(mailSession);
		
		// set sender
		mimeMessage.setFrom(MailConstants.SENDER);
		
		// set receiver
		mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(MailConstants.RECEIVER));
		
		// set subject
		mimeMessage.setSubject(MailConstants.SUBJECT);
		
		// set message
		mimeMessage.setText(MailConstants.MESSAGE);
		
		Transport.send(mimeMessage);
	}
}
