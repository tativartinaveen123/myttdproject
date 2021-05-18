package com.ttd.common.sms;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.sql.Timestamp;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class SMSServices {

	private static final Logger logger = LoggerFactory.getLogger(SMSServices.class);

	private String sUserID;
	private String senderSID;
	private String smsURL;

	public String getsUserID() {
		return sUserID;
	}

	public void setsUserID(String sUserID) {
		this.sUserID = sUserID;
	}

	public String getSenderSID() {
		return senderSID;
	}

	public void setSenderSID(String senderSID) {
		this.senderSID = senderSID;
	}

	public String getSmsURL() {
		return smsURL;
	}

	public void setSmsURL(String smsURL) {
		this.smsURL = smsURL;
	}

	@Async
	public String sendSMStoPiligrim(String messageText, String phoneNumber) {

		logger.info("Start of sendSMStoPiligrim (" + messageText + ")  in CommonDAOImpl");
		

		int smsResponseCode = 0;
		String smsStatus = "failed";

		try {
			String completeSmsURL = getSmsURL() + "&DestNo="+ URLEncoder.encode(phoneNumber, "UTF-8") + "&msg=" + URLEncoder.encode(messageText, "UTF-8");
			logger.debug("smsURL" + completeSmsURL);
			smsResponseCode = getResponseMessage(completeSmsURL);

			if (smsResponseCode == 200) {
				smsStatus = "Success";
			}

			logger.info("End sendSMStoPiligrim ()  of SMSServices ::" + smsStatus);

		} catch (Exception e) {
			logger.info("Exception: SMSServices"+e.getMessage());
			StringWriter stack = new StringWriter();
		    e.printStackTrace(new PrintWriter(stack));
			logger.error(stack.toString());			
		}
	//	logger.error("SMS Sending to :: "+phoneNumber+"and the Body as :: "+messageText);
		logger.info("End of sendSMStoPiligrim (" + messageText + ")  in CommonDAOImpl");
		return smsStatus;

	}

	public int getResponseMessage(String smsUrl) {

		int responseCode = 0;
		HttpURLConnection conn = null;
		try {
			logger.info("Inside getResponseMessage ()  of SMSServices");

			URL url = new URL(smsUrl);
			//System.getProperties().put("http.proxyHost", "api.mVaayoo.com"); 
			conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "text/plain; charset=utf-8");
			responseCode = conn.getResponseCode();
			logger.info("responseCode: SMSServices"+responseCode);
		} catch (Exception e) {
			logger.info("Exception: SMSServices"+e.getMessage());
			logger.error(e.getMessage());
			e.printStackTrace();
		} finally {
			if (conn != null) {
				conn.disconnect();
			}
		}

		return responseCode;
	}

}