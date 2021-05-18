package com.ttd.common.model;

import java.util.ArrayList;

// RabbitMQ 20-03-2017 VenkataSSS

public class EmailWithAttachment {
	
	
	
	 long	messageId;
	 String offeringId;
	 String	mailFrom;
	 String	mailTo;
	 String	subject;
	 String	body;
	 boolean	isAttachment;
	 //ArrayList<Attachment> attachments;
	 String fileName;
	 String filePath;
	 String fileType;
	 
	 
	public long getMessageId() {
		return messageId;
	}
	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}
	public String getOfferingId() {
		return offeringId;
	}
	public void setOfferingId(String offeringId) {
		this.offeringId = offeringId;
	}
	public String getMailFrom() {
		return mailFrom;
	}
	public void setMailFrom(String mailFrom) {
		this.mailFrom = mailFrom;
	}
	public String getMailTo() {
		return mailTo;
	}
	public void setMailTo(String mailTo) {
		this.mailTo = mailTo;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String bodyHtml) {
		this.body = bodyHtml;
	}
	public boolean isAttachment() {
		return isAttachment;
	}
	public void setIsAttachment(boolean isAttachment) {
		this.isAttachment = isAttachment;
	}
	/*public ArrayList<Attachment> getAttachments() {
		return attachments;
	}
	public void setAttachments(ArrayList<Attachment> attachments) {
		this.attachments = attachments;
	}*/
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fieName) {
		this.fileName = fieName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String filrType) {
		this.fileType = filrType;
	}
	public void setAttachment(boolean isAttachment) {
		this.isAttachment = isAttachment;
	}
			 
}
