package com.ttd.common.util;

import java.text.DecimalFormat;

public class EnglishNumberToWordsNew {

	private static final String[] tensNames = { "", " 10", " 20", " 30", " 40", " 50", " 60",
			" 70", " 80", " 90" };

	private static final String[] numNames = { "", " 1", " 2", " 3", " 4", " 5", " 6", " 7",
			" 8", " 9", " 10", " 11", " 12", " 13", " 14", " 15", " 16",
			" 17", " 18", " 19" };

	private EnglishNumberToWordsNew() {
	}

	private static String convertLessThanOneThousand(int number) {
		String soFar;

		if (number % 100 < 20) {
			soFar = numNames[number % 100];
			number /= 100;
		} else {
			soFar = numNames[number % 10];
			number /= 10;

			soFar = tensNames[number % 10] + soFar;
			number /= 10;
		}
		if (number == 0)
			return soFar;
		return numNames[number] + " Hundred" + soFar;
	}
	
	private static String convertTenThousand(int number) {
		String soFar;
		
		soFar = convertLessThanOneThousand(number % 1000);
		number /= 1000;
		
		if(number % 100 == 0){
			return soFar;
		}
		else if (number % 100 < 20) {
			soFar = numNames[number] + " Thousand " + soFar;
			return soFar;
		}
		
		else {
			soFar =convertLessThanOneThousand(number) + " Thousand "+ soFar;
			return soFar;
		}
		
		
	}

	public static String convert(long number) {
		// 0 to 999 999 999 999
		if (number == 0) {
			return "Zero";
		}

		String snumber = Long.toString(number);

		// pad with "0"
		String mask = "000000000000";
		DecimalFormat df = new DecimalFormat(mask);
		snumber = df.format(number);

//		// XXXnnnnnnnnn
//		int billions = Integer.parseInt(snumber.substring(0, 3));
		// nnnXXXnnnnnn
		int millions = Integer.parseInt(snumber.substring(0, 5));
		//nnnnnnXnnnnn
		int lakhs = Integer.parseInt(snumber.substring(5, 7));
		// nnnnnnnXXnnn
		int hundredThousands = Integer.parseInt(snumber.substring(7, 9));
		// nnnnnnnnnXXX
		int thousands = Integer.parseInt(snumber.substring(9, 12));

//		String tradBillions;
//		switch (billions) {
//		case 0:
//			tradBillions = "";
//			break;
//		case 1:
//			tradBillions = convertLessThanOneThousand(billions) + " Hundred Crore";
//			break;
//		default:
//			tradBillions = convertLessThanOneThousand(billions) + " Hundred Crore";
//		}
//		String result = tradBillions;

		String tradMillions;
		switch (millions) {
		case 0:
			tradMillions = "";
			break;
		case 1:
			tradMillions = convertLessThanOneThousand(millions) + " Crore";
			break;
		default:
			tradMillions = convertTenThousand(millions) + " Crore";
		}
		String result = tradMillions;

		String tradLakh;
		switch (lakhs) {
		case 0:
			tradLakh = "";
			break;
		case 1:
			tradLakh = convertLessThanOneThousand(lakhs) + " Lakh";
			break;
		default:
			tradLakh = convertLessThanOneThousand(lakhs) + " Lakh";
		}
		result = result + tradLakh;

		String tradHundredThousands;
		switch (hundredThousands) {
		case 0:
			tradHundredThousands = "";
			break;
		case 1:
			tradHundredThousands = "1 Thousand";
			break;
		default:
			tradHundredThousands = convertLessThanOneThousand(hundredThousands) + " Thousand";
		}
		result = result + tradHundredThousands;

		String tradThousand;
		tradThousand = convertLessThanOneThousand(thousands);
		result = result + tradThousand;

		// remove extra spaces!
		return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ")+" Rupees only";
	}

	
} 