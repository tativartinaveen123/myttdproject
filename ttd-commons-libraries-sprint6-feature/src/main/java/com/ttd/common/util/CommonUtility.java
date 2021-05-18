package com.ttd.common.util;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.time.LocalDate;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.hibernate.validator.internal.xml.ConstructorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.SetFactoryBean;
import org.springframework.data.redis.core.RedisOperations;

import com.fasterxml.jackson.databind.type.CollectionType;
import com.ttd.common.model.Attachment;
import com.ttd.common.model.EmailWithAttachment;

import redis.clients.jedis.Jedis;
public class CommonUtility {
	static Logger  logger = Logger.getLogger(CommonUtility.class);

	public static String availFromTo(String day) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.clear(Calendar.MINUTE);
		calendar.clear(Calendar.SECOND);
		calendar.clear(Calendar.MILLISECOND);

		int days = Integer.parseInt(day);
		calendar.add(Calendar.DATE, days);
		java.util.Date incrementDays = calendar.getTime();

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		String date = sdf.format(incrementDays);
		return date;
	}

	public static String formatDate(Date dateObj) {
		String dateStr = null;
		DateFormat formater = new SimpleDateFormat("dd-MM-yyyy");
		dateStr = formater.format(dateObj);
		return dateStr;

	}
	
	public static void deleteKey(String key) {
		try
		{
			logger.info("inside deleteKey while deleteing key");
			if(null!=key) {
				
				logger.info("insidee deleteKey while deleteing key");
				/*
				 * Jedis jedis = new Jedis("192.168.113.5"); jedis.del(key.trim());
				 * jedis.close();
				 */
				
		}
		}
		catch(Exception e)
		{
			logger.error("Error while deleteing key");
		}

	}
	
	public static String getMonthFromDate(Date dateObj) {
		 Format formatter = new SimpleDateFormat("MMMM"); 
		 String s = formatter.format(dateObj);
		 return s;
	}
	public static String emailMorph(String email)
	{		
		String hidden = "";
		try {
		
	    Matcher m = Pattern.compile("\\w{0}(.*)@").matcher(email);
	    if (m.find()) {
	        String s = m.group(1);
	        char[] c = new char[s.length()];
	        Arrays.fill(c, 'X');
	        hidden = email.replace(s, String.valueOf(c));
	    }
		}
		catch(Exception e)
		{
		System.out.println("Exception e"+e.getMessage());	
		}
	    return hidden;
	}
	public static String maskMobileNumber(String cardNumber) {
		
		 String message = cardNumber;
		try {
			if(null!=message) {
	     Pattern PATTERN = Pattern.compile("[0-9]+");
	        Matcher matcher = PATTERN.matcher(message);
	        String maskingChar = "X";
	        StringBuilder finalMask = new StringBuilder(maskingChar);

	        while (matcher.find()) {
	            String group = matcher.group();
	            int groupLen = group.length();

	            if(groupLen>4){
	                for(int i=0; i<=group.length()-4; i++){
	                    finalMask.append(maskingChar);
	                }
	                finalMask.append(group.substring(groupLen-4));
	            }
	            message = message.replace(group, finalMask);
	        }
		}
		}
		catch(Exception e)
		{
			System.out.println("maskMobileNumber"+e.getMessage());
		}
	        return message;
	}
	
	public static String formatDate2(Date dateObj) {
		String dateStr = null;
		DateFormat formater = new SimpleDateFormat("dd-MMM-yy");
		dateStr = formater.format(dateObj);
		return dateStr;

	}
	public static String formatDateVS2(Date dateObj) {
		String dateStr = null;
		DateFormat formater = new SimpleDateFormat("dd:MMM:yyyy");
		dateStr = formater.format(dateObj);
		return dateStr;

	}
	public static String formatDateNew(Date dateObj) {
		String dateStr = null;
		DateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
		dateStr = formater.format(dateObj);
		return dateStr;

	}
	
	public static String formatDateNew3(Date dateObj) {
		String dateStr = null;
		DateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
		dateStr = formater.format(dateObj);
		return dateStr;

	}

	public static Date currentTimeStamp() {
		Calendar calendar = Calendar.getInstance();
		Date otpStartDate = calendar.getTime();
		return otpStartDate;
	}

	public static Date otpExpireTime(int min) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MINUTE, min);
		java.util.Date otpExpireDate = calendar.getTime();
		return otpExpireDate;
	}

	public static String encryptPassword(String password) {
		String encryptedPassword = null;
		try {

			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			messageDigest.update(password.getBytes(), 0, password.length());

			encryptedPassword = new BigInteger(1, messageDigest.digest())
					.toString(16);

			while (encryptedPassword.length() < 32) {
				encryptedPassword = "0" + encryptedPassword;
			}

			System.out.println("Hashed password :::::: " + encryptedPassword);

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return encryptedPassword;
	}

	public static String encryptID(String id) {
		String encryptedPassword = null;
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-1");
			md.update(id.getBytes());
			byte[] bytes = md.digest();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < bytes.length; i++) {
				sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16)
						.substring(1));
			}
			encryptedPassword = sb.toString();

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		return encryptedPassword;
	}

	public static Date forgotPasswordExpireTime(int hr) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.HOUR, hr);
		java.util.Date otpExpireDate = calendar.getTime();
		return otpExpireDate;
	}

	public static Date expireDate(int days) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, days);
		java.util.Date otpExpireDate = calendar.getTime();
		return otpExpireDate;
	}

	public static Date stringToDateFormater(String dateInString) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");

		Date date = new Date();
		try {

			date = formatter.parse(dateInString);

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	public static Date stringToDateFormaterSrivani(String dateInString) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yy");

		Date date = new Date();
		try {

			date = formatter.parse(dateInString);

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	public static Date stringToDateFormaterForCompare(String dateInString){
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		
		Date date =new Date();
		try {

			 date = formatter.parse(dateInString);

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	public static String dateToString(Date dateObj) {
		String dateStr = null;
		DateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
		dateStr = formater.format(dateObj);
		return dateStr;

	}
	
	public static String dateToString2(Date dateObj) {
		String dateStr = null;
		DateFormat formater = new SimpleDateFormat("dd-MMM-yyyy");
		dateStr = formater.format(dateObj);
		return dateStr;

	}
	public static String dateToString3(Date dateObj) {
		String dateStr = null;
		DateFormat formater = new SimpleDateFormat("dd-MMM-yy");
		dateStr = formater.format(dateObj);
		return dateStr;

	}
	
	public static Date ValidationDate(Date date,int days){
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, days);
		java.util.Date expireDate = calendar.getTime();
		return expireDate;
	}
	
	public static Date stringToDateFormaterNew(String dateInString){
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		Date date =new Date();
		
		try {
			 
			 date = formatter.parse(dateInString);
			 
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;		 
	}
	
	public static Date stringToDateFormaterNew1(String HHmm){
		SimpleDateFormat formatter = new SimpleDateFormat("KK aa");
		
		Date date =new Date();
		
		try {
			 
			 date = formatter.parse(HHmm);
			 
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;		 
	}
	
	
	public static Date stringToTimeStamp(String timeStampInString) {
		SimpleDateFormat formatter = new SimpleDateFormat(
				"dd/MM/yyyy HH:mm:ss.SSS");

		Date date = new Date();

		try {

			date = formatter.parse(timeStampInString);

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;

	}

	public static String dateToStringNew(String dateInString) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

		Date date = new Date();

		try {

			date = (Date) formatter.parse(dateInString);

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return formatter.format(date);
	}

	public static String DatePlusUUID(Date date) {
		String Id = String.valueOf(UniqueIDGenerator.generateUniqueId())
				.substring(0, 5);
		String dateStr = null;
		String datePlusUUID = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmssSSS");
		dateStr = sdf.format(date);
		datePlusUUID = dateStr + Id;
		return datePlusUUID;
	}
	
	public static String DatePlusUUIDForDonation(Date date) {
		/*String Id = String.valueOf(UniqueIDGenerator.generateUniqueId())
				.substring(0, 7);*/
		String dateStr = null;
		String datePlusUUID = null;
//		SimpleDateFormat sdf = new SimpleDateFormat("HHmmssSS");
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyy");
		dateStr = sdf.format(date);
		return dateStr;
	}

	public static String dateinStringToString(String input) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy");

		Date date = null;
		try {
			date = sdf.parse(input);
		} catch (ParseException e) {

			e.printStackTrace();
		}

		sdf = new SimpleDateFormat("dd/MM/yyyy");

		return sdf.format(date);
	}

	public static Date ConvertDate(Date date) {

		DateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
		String s = df.format(date);
		String result = s;
		try {
			date = df.parse(result);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}

	public static String formatTime(Date dateObj) {
		String dateStr = null;
		SimpleDateFormat formater = new SimpleDateFormat("HH:mm:ss");
		dateStr = formater.format(dateObj);			
		return dateStr;
	}
	
	public static String stringToDateFormat(String input) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy");

		Date date = null;
		try {
			date = sdf.parse(input);
		} catch (ParseException e) {

			e.printStackTrace();
		}

		sdf = new SimpleDateFormat("yyMMdd");

		return sdf.format(date);
	}
	
	public static Date stringToDateFormate(String day) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.clear(Calendar.MINUTE);
		calendar.clear(Calendar.SECOND);
		calendar.clear(Calendar.MILLISECOND);

		int days = Integer.parseInt(day);
		calendar.add(Calendar.DATE, days);
		java.util.Date incrementDays = calendar.getTime();		
		return incrementDays;
	}
	
	public static String ValidationYears(Date date,int years){
		String dateStr = null;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.YEAR, years);
		java.util.Date expireDate = calendar.getTime();
		SimpleDateFormat formater = new SimpleDateFormat("dd-MMM-yyyy");
		dateStr = formater.format(expireDate);	
		return dateStr;
	}
	
	public static String addDaysToSelectedDate(Date date,int days){
		String dateStr = null;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, days);
		java.util.Date expireDate = calendar.getTime();
		SimpleDateFormat formater = new SimpleDateFormat("dd-MMM-yy");
		dateStr = formater.format(expireDate);	
		return dateStr;
	}
	
	public static String addDaysToSelectedStringDate(String date,int days) throws ParseException{
		String dateStr = null;
		DateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(df.parse(date));
		calendar.add(Calendar.DATE, days);
		java.util.Date expireDate = calendar.getTime();
		SimpleDateFormat formater = new SimpleDateFormat("dd-MMM-yyyy");
		dateStr = formater.format(expireDate);	
		return dateStr;
	}
	
	
	public static Date stringToDate(String dateInString){
	SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yy");
	
	Date date =new Date();
	
	try {
		 
		 date = formatter.parse(dateInString);
		 
	} catch (ParseException e) {
		e.printStackTrace();
	}
	return date;		 
	}
	
	public static Date stringToDateObj(String dateInString){
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yy h:mm a");
		
		Date date =new Date();
		
		try {
			 
			 date = formatter.parse(dateInString);
			 
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;		 
		}
	
	public static Date stringToDateObj1(String dateInString){
		SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy");
		
		Date date =new Date();
		
		try {
			 
			 date = formater.parse(dateInString);
			 
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;		 
		}

	public static int getYearFromDate(Date date) {
    int result = -1;
    if (date != null) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        result = cal.get(Calendar.YEAR);
    }
    return result;
}
	
	public static String newDateFormat(Date dateObj) {
		String dateStr = null;
		DateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		dateStr = formater.format(dateObj);
		return dateStr;

	}
	
	public static String dateformat (Date dateObj) {
		String dateStr = null;
		DateFormat formater = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		dateStr = formater.format(dateObj);
		return dateStr;

	}
	public static String dateformat2 (Date dateObj) {
		String dateStr = null;
		DateFormat formater = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss a ");
		dateStr = formater.format(dateObj);
		return dateStr;

	}
	public static String dateformat2Pilgrim (Date dateObj) {
		String dateStr = null;
		DateFormat formater = new SimpleDateFormat("dd-MM-yyyy hh:mm a ");
		dateStr = formater.format(dateObj);
		return dateStr;

	}
	/**
	 * @param date
	 * @return
	 */
	public static String DatePlusUUIDForKV(Date date) {
		String Id = String.valueOf(UniqueIDGenerator.generateUniqueId())
				.substring(0, 6);
		String dateStr = null;
		String datePlusUUID = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
		dateStr = sdf.format(date);
		datePlusUUID = dateStr + Id;
		return datePlusUUID;
	}
	
	public static String offeringIdgen(Date date,String bookingLocation,String serviceName) {
		String finalId = "00000001";
		SecureRandom random = new SecureRandom();
		byte[] values = new byte[20];
		random.nextBytes(values);
		finalId = String.format("%08d",  random.nextInt(99999999));
		StringBuffer start = new StringBuffer();
		String dateStr = null;
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyy");
		dateStr = sdf.format(date);		
		start.append(bookingLocation).append(serviceName).append(dateStr).append(finalId);		
		return start.toString();
	}
	
	// Start RabbitMQ 20-03-2017 VenkataSSS
	public static String getJsonFromPojo(Object objPojo){
		String json=null;
			
		ObjectMapper mapper = new ObjectMapper();
		
		try {
				json = mapper.writeValueAsString(objPojo);
			
		} catch (JsonGenerationException e) {
			logger.error(e);
		} catch (JsonMappingException e) {
			logger.error(e);
		} catch (IOException e) {
			logger.error(e);
		}
		
		
		return json;
		
	}
	
	public static Object getPojoFromJson(String json,Object objClass){
		Object pojo = null;
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			pojo = mapper.readValue(json, objClass.getClass());
		} catch (JsonParseException e) {
			logger.error(e);
			
		} catch (JsonMappingException e) {
			logger.error(e);
			
		} catch (IOException e) {
			logger.error(e);
			
		}
		
		
		return pojo;
	}
	
	// End RabbitMQ 20-03-2017 VenkataSSS 

	/**
	 * @param time
	 * 
	 * @return time appended with AM or PM to the given time
	 */
	public static String appendAmOrPm(final String time) {
		DateFormat f1 = new SimpleDateFormat("HH:mm"); // HH for hour of the day
														// (0 - 23)
		Date d;
		try {
			d = f1.parse(time);
			DateFormat f2 = new SimpleDateFormat("h:mm a");
			return f2.format(d).toUpperCase();
		} catch (ParseException e) {
			return time;
		}
	}

	public static Date stringToTimeStampFormate(String timeStampInString) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		DateFormat df = new SimpleDateFormat("dd-MMM-yyyy");

		Date date = new Date();

		try {

			date = formatter.parse(timeStampInString);
			date = df.parse(df.format(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;

	}

	/**
	 * This Method generates the Form Id for User Selected Seva's.
	 * 
	 * @param date
	 * @param serviceName
	 * @return
	 */
	public static String generateSevaFormId(Date date, String serviceName, long userId) {
		String finalId = "00000001";
//		SecureRandom random = new SecureRandom();
//		byte[] values = new byte[20];
//		random.nextBytes(values);
//		finalId = String.format("%08d", random.nextInt(99999999));
		
		int length = 8;
		String zeros = "";
		String userIdstr = String.valueOf(userId);
		int append = length - userIdstr.length();
		switch (append) {
		case 1:
			zeros = "0";
			break;
		case 2:
			zeros = "00";
			break;
		case 3:
			zeros = "000";
			break;
		case 4:
			zeros = "0000";
			break;
		case 5:
			zeros = "00000";
			break;
		case 6:
			zeros = "000000";
			break;
		case 7:
			zeros = "0000000";
			break;
		default:
			break;
		}		
				
		StringBuffer start = new StringBuffer();
		String dateStr = null;
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyy");
		dateStr = sdf.format(date);
		start.append(serviceName).append(dateStr).append(zeros).append(userIdstr);
		return start.toString();
	}

	public static String maskString(String inputString, int maskLength) {
		
		if(null!=inputString)
		{
		int start = 0;
		int end = inputString.length() - maskLength;
		String overlay = StringUtils.repeat("X", end - start);
		return StringUtils.overlay(inputString, overlay, start, end);
		}
		return null;
	}
	
	public static String dateformatSQL(Date dateObj) {
		String dateStr = null;
		DateFormat formater = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
		dateStr = formater.format(dateObj);
		return dateStr;

	}
	
	public static String dateformatSQLFunc(Date dateObj) {
		String dateStr = null;
		DateFormat formater = new SimpleDateFormat("dd-MMM-yy HH:mm:ss");
		dateStr = formater.format(dateObj);
		return dateStr;

	}
	
	public static String dateformatInHour(Date dateObj) {
		String dateStr = null;
		DateFormat formater = new SimpleDateFormat("dd MMM yyyy & hh:mm a");
		dateStr = formater.format(dateObj);
		return dateStr;

	}
	
	
	static int[][] d = { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 },
			{ 1, 2, 3, 4, 0, 6, 7, 8, 9, 5 }, { 2, 3, 4, 0, 1, 7, 8, 9, 5, 6 },
			{ 3, 4, 0, 1, 2, 8, 9, 5, 6, 7 }, { 4, 0, 1, 2, 3, 9, 5, 6, 7, 8 },
			{ 5, 9, 8, 7, 6, 0, 4, 3, 2, 1 }, { 6, 5, 9, 8, 7, 1, 0, 4, 3, 2 },
			{ 7, 6, 5, 9, 8, 2, 1, 0, 4, 3 }, { 8, 7, 6, 5, 9, 3, 2, 1, 0, 4 },
			{ 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }

	};

	static int p[][] = { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 },
			{ 1, 5, 7, 6, 2, 8, 3, 0, 9, 4 }, { 5, 8, 0, 3, 7, 9, 6, 1, 4, 2 },
			{ 8, 9, 1, 6, 0, 4, 3, 5, 2, 7 }, { 9, 4, 5, 3, 1, 2, 6, 8, 7, 0 },
			{ 4, 2, 8, 6, 5, 7, 3, 9, 0, 1 }, { 2, 7, 9, 3, 8, 0, 6, 4, 1, 5 },
			{ 7, 0, 4, 6, 9, 1, 3, 2, 5, 8 }

	};
	int[] inv = { 0, 4, 3, 2, 1, 5, 6, 7, 8, 9 };
	
	public static boolean adhaarValidation(String num) {
		int c = 0;
		int[] myArray = StringToReversedIntArray(num);

		for (int i = 0; i < myArray.length; i++) {	

			c = d[c][p[(i % 8)][myArray[i]]];
		}
		return c == 0;

	}
	private static int[] StringToReversedIntArray(String num) {

		int[] myArray = new int[num.length()];

		try {
			for (int i = 0; i < num.length(); i++) {

				myArray[i] = Integer.parseInt(num.substring(i, i + 1));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		int dummy[] = reverseArray(myArray);
		return myArray;

	}
	public String generateVerhoeff(String num) {
		int c = 0;
		int[] myArray = StringToReversedIntArray(num);

		for (int i = 0; i < myArray.length; i++) {
			c = d[c][p[((i + 1) % 8)][myArray[i]]];

		}

		return Integer.toString(inv[c]);
	}
	static int[] reverseArray(int a[]) {

		for (int i = 0; i < a.length / 2; i++) {
			int tmp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = tmp;
		}
		return a;
	}
	
	public static Date stringToDateFormatNew(String dateInString) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

		Date date = new Date();
		try {

			date = formatter.parse(dateInString);

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	public static String DatePlusUUIDforGst(Date date) {

		String dateStr = null;
		String datePlusUUID = null;
		SimpleDateFormat sdf = new SimpleDateFormat("ssmmHHyyMMdd");
		dateStr = sdf.format(date);
		datePlusUUID = dateStr;
		return datePlusUUID;
	}
	public static String DatePlusUUIDforGstPub(Date date) {
		
		String Id = String.valueOf(UniqueIDGenerator.generateUniqueId())
				.substring(0,3);
		

		String dateStr = null;
		String datePlusUUID = null;
		SimpleDateFormat sdf = new SimpleDateFormat("ssmmHHyyMMdd");
		dateStr = sdf.format(date);
		datePlusUUID = dateStr +Id;
		return datePlusUUID;
	}
	public static long ageCaluculation(Date dateOfbirth)
	{
		Calendar dob = Calendar.getInstance();

		dob.setTime(dateOfbirth);
		Calendar today = Calendar.getInstance();
		long age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
		if (today.get(Calendar.MONTH) < dob.get(Calendar.MONTH)) {
			age--;
		} else if (today.get(Calendar.MONTH) == dob.get(Calendar.MONTH)
				&& today.get(Calendar.DAY_OF_MONTH) < dob
						.get(Calendar.DAY_OF_MONTH)) {
			age--;
		}
		return age;
	} 
	public static String formatDateWithTime(Date dateObj) {
		String dateStr = null;
		DateFormat formater = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		dateStr = formater.format(dateObj);
		return dateStr;

	} 
	
	
	public static Month getnextMonth(Date date) {
		
       LocalDate date1 = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().plusMonths(1);
		
		Month m = date1.getMonth();
	    
	   return m;
	
        
	} 
	
	
	public static String getAfterthedate(String date, int noofDays) {
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();
		
		
		//Setting the date to the given date
		   try {
			c.setTime(sdf.parse(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		 //Number of Days to add
			c.add(Calendar.DAY_OF_MONTH, noofDays);  
			//Date after adding the days to the given date
			String newDate = sdf.format(c.getTime());  
			//Displaying the new Date after addition of Days
	   
		
		
		return newDate;
		
	}
}
