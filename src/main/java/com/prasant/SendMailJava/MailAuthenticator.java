package com.prasant.SendMailJava;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MailAuthenticator extends Authenticator {

	@Override
	protected PasswordAuthentication getPasswordAuthentication() {
		
		return new PasswordAuthentication(MailConstants.SENDER, "0prasant*kumar0sahu*");
	}
	
	
}
