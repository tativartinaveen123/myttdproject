package com.ttd.common.email;

import java.io.File;

import javax.mail.internet.MimeMessage;
import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Component;

/**
 * Sends an e-mail message.
 * 
 * 
 */
@Component
public class TTDEmailSender implements Sender {

	private static final Logger logger = LoggerFactory.getLogger(TTDEmailSender.class);
	
	@Autowired
	private JavaMailSender mailSender;	

	@Autowired
	private ServletContext servletContext;	
	
	private String fileServerIP;
	private String pdfEHundiLoc;
	private String pdfEDonLoc;
	private String pdfEAccommLoc;
	private String pdfESevaLoc;
	private String pdfEDarsLoc;
	private String pdfKalyanVedikaLoc;
	private String pdfSgmsLoc;
	private String uploadingDocLocation;

	/**
	 * Sends e-mail using Velocity template for the body and the properties
	 * passed in as Velocity variables.
	 * 
	 * @param msg
	 *            The e-mail message to be sent, except for the body.
	 * @param hTemplateVariables
	 *            Variables to use when processing the template.
	 */
	public  String send(final SimpleMailMessage msg, final String emailBody, final String recieptName) {

		String emailStatus = "failed";

		logger.info("Start of send (" + emailBody + ")  in CommonServiceImpl");

		MimeMessagePreparator preparator = new MimeMessagePreparator() {

			public  void prepare(MimeMessage mimeMessage) throws Exception {

				MimeMessageHelper message = new MimeMessageHelper(mimeMessage, true);
				message.setTo(msg.getTo());
				message.setFrom(msg.getFrom());
				message.setSubject(msg.getSubject());
				
				for (int i = 0; i < msg.getTo().length; i++) {
					logger.info("email array values :  " + msg.getTo()[i]);
				}
				logger.info("subject :  " + msg.getSubject());
				
				if (recieptName != null) {
					String attachFile = getFileServerPath(recieptName);
					logger.info("file attachment name :: " + attachFile);
					FileSystemResource file = new FileSystemResource(new File(attachFile));
					message.addAttachment(file.getFilename(), file);
				}

				message.setText(emailBody, true);
			}
		};

		try {
			mailSender.send(preparator);
			emailStatus = "Success";
		} catch (Exception mailerEx) {
			logger.error(mailerEx.getMessage());
			mailerEx.printStackTrace();
		}
		
		StringBuilder toEmails = new StringBuilder();
		for (int i = 0; i < msg.getTo().length; i++) {
			toEmails.append(msg.getTo()[i] +"-");
		}
		
		//logger.error("Mail Sending to :: "+toEmails+" With Subject :: "+msg.getSubject()+" and the Body as :: "+emailBody.substring(18,100));
		logger.info("End of send ()  in CommonServiceImpl :: " + emailStatus);
	
		return emailStatus;
	}
	
	
	public  String send(final String emailTo,final String emailFrom, final String emailSubject, final String emailBody, final String recieptName) {

		String emailStatus = "failed";

		logger.info("Start of send (" + emailBody + ")  in CommonServiceImpl");

		MimeMessagePreparator preparator = new MimeMessagePreparator() {

			public  void prepare(MimeMessage mimeMessage) throws Exception {

				MimeMessageHelper message = new MimeMessageHelper(mimeMessage, true);
				/*message.setTo(msg.getTo());
				message.setFrom(msg.getFrom());
				message.setSubject(msg.getSubject());*/
				
				message.setTo(emailTo);
				message.setFrom(emailFrom);
				message.setSubject(emailSubject);
				
				/*for (int i = 0; i < msg.getTo().length; i++) {
					logger.info("email array values :  " + msg.getTo()[i]);
				}
				logger.info("subject :  " + msg.getSubject());*/
				
				if (recieptName != null) {
					String attachFile = getFileServerPath(recieptName);
					logger.info("file attachment name :: " + attachFile);
					FileSystemResource file = new FileSystemResource(new File(attachFile));
					message.addAttachment(file.getFilename(), file);
				}

				message.setText(emailBody, true);
			}
		};

		try {
			mailSender.send(preparator);
			emailStatus = "Success";
		} catch (Exception mailerEx) {
			logger.error(mailerEx.getMessage());
			mailerEx.printStackTrace();
		}
		
		/*StringBuilder toEmails = new StringBuilder();
		for (int i = 0; i < msg.getTo().length; i++) {
			toEmails.append(msg.getTo()[i] +"-");
		}*/
		
		//logger.error("Mail Sending to :: "+toEmails+" With Subject :: "+msg.getSubject()+" and the Body as :: "+emailBody.substring(18,100));
		logger.info("End of send ()  in CommonServiceImpl :: " + emailStatus);
	
		return emailStatus;
	}
	
	
	private String getFileServerPath(String receiptName){
		logger.info("receiptName :: " + receiptName.substring(0,4));	
		if (receiptName != null && receiptName.substring(0,4).equalsIgnoreCase("EHUN")) {
			return getPdfEHundiLoc()+"/"+receiptName;
		} else if (receiptName != null && receiptName.substring(0,4).equalsIgnoreCase("EDON")) {
			return getPdfEDonLoc()+"/"+receiptName;
		} else if (receiptName != null && receiptName.substring(0,4).equalsIgnoreCase("EACC")) {
			return getPdfEAccommLoc()+"/"+receiptName;
		} else if (receiptName != null && receiptName.substring(0,4).equalsIgnoreCase("ESEV")) {
			return getPdfESevaLoc()+"/"+receiptName;
		} else if (receiptName != null && receiptName.substring(0,4).equalsIgnoreCase("EDAR")) {
			return getPdfEDarsLoc()+"/"+receiptName;
		} else if (receiptName != null && receiptName.substring(0,4).equalsIgnoreCase("KALY")) {
			return getPdfKalyanVedikaLoc()+"/"+receiptName;
		} else if (receiptName != null && receiptName.substring(0,4).equalsIgnoreCase("SGMS")) {
			return getPdfSgmsLoc()+"/"+receiptName;
		} else if (receiptName != null && receiptName.substring(0,4).equalsIgnoreCase("BULK")) {
			return getUploadingDocLocation()+"/"+receiptName;
		}
		return "test";
	}


	public String getFileServerIP() {
		return fileServerIP;
	}


	public void setFileServerIP(String fileServerIP) {
		this.fileServerIP = fileServerIP;
	}


	public String getPdfEHundiLoc() {
		return pdfEHundiLoc;
	}


	public void setPdfEHundiLoc(String pdfEHundiLoc) {
		this.pdfEHundiLoc = pdfEHundiLoc;
	}


	public String getPdfEDonLoc() {
		return pdfEDonLoc;
	}


	public void setPdfEDonLoc(String pdfEDonLoc) {
		this.pdfEDonLoc = pdfEDonLoc;
	}


	public String getPdfEAccommLoc() {
		return pdfEAccommLoc;
	}


	public void setPdfEAccommLoc(String pdfEAccommLoc) {
		this.pdfEAccommLoc = pdfEAccommLoc;
	}


	public String getPdfESevaLoc() {
		return pdfESevaLoc;
	}


	public void setPdfESevaLoc(String pdfESevaLoc) {
		this.pdfESevaLoc = pdfESevaLoc;
	}


	public String getPdfEDarsLoc() {
		return pdfEDarsLoc;
	}


	public void setPdfEDarsLoc(String pdfEDarsLoc) {
		this.pdfEDarsLoc = pdfEDarsLoc;
	}


	public String getPdfKalyanVedikaLoc() {
		return pdfKalyanVedikaLoc;
	}


	public void setPdfKalyanVedikaLoc(String pdfKalyanVedikaLoc) {
		this.pdfKalyanVedikaLoc = pdfKalyanVedikaLoc;
	}


	public String getPdfSgmsLoc() {
		return pdfSgmsLoc;
	}


	public void setPdfSgmsLoc(String pdfSgmsLoc) {
		this.pdfSgmsLoc = pdfSgmsLoc;
	}


	public String getUploadingDocLocation() {
		return uploadingDocLocation;
	}


	public void setUploadingDocLocation(String uploadingDocLocation) {
		this.uploadingDocLocation = uploadingDocLocation;
	}	
	

}
