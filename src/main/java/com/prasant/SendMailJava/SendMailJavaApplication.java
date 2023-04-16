package com.prasant.SendMailJava;

public class SendMailJavaApplication {

	public static void main(String[] args) throws Exception {
		
		System.out.println("This appliction suppose to send mail.");
		
		HandleMail mailer = new HandleMail();
		mailer.sendMail();
	}

}
