package com.ttd.common.email;

import org.springframework.mail.SimpleMailMessage;

public class MailSender extends SimpleMailMessage {
	
	private static final long serialVersionUID = 1L;

	public void setToEmail(String toEmail) {
		super.setTo(toEmail);
	}

	public void setFromEmail(String fromEmail) {
		super.setFrom(fromEmail);
	}

	public void setSubject(String subject) {
		super.setSubject(subject);
	}
	
	public void setToEmails(String[] emaiTo){
		super.setTo(emaiTo);
	}

}
