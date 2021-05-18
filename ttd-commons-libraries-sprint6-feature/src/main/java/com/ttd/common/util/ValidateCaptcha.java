package com.ttd.common.util;

import java.net.URI;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import java.net.URISyntaxException;
import org.json.simple.parser.ParseException;

public class ValidateCaptcha {
	
	
	
	public boolean validateInputCaptcha(String response) throws java.net.URISyntaxException, org.json.simple.parser.ParseException {
		  		
		  	/*System.getProperties().put("proxySet", "true");
		  	System.getProperties().put("http.proxyHost", "proxy.tcs.com");
		  	System.getProperties().put("http.proxyPort", "8080");	*/
			
			MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
			map.add("secret", "6Lc8MQ8TAAAAAO0Iy27BmdOhSljGvU2nzmWK4Sr0");
			map.add("response", response);
			
		  	HttpHeaders headers = new HttpHeaders();
		  	RestTemplate restTemplate = new RestTemplate();
		  	headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED); 
		  	HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);
	  	  					
			
			URI requestURL = new URI("https://www.google.com/recaptcha/api/siteverify");
			String result = (String) restTemplate.postForObject(requestURL, request, String.class);				
			System.out.println("output"+result);
			//String jsonText = "{\"success\":\"true\"}";
		    JSONParser parser = new JSONParser();
		    Object value = parser.parse(result);
		    JSONObject  array=(JSONObject )value;
		    
		    System.out.println("value:"+array.get("success"));
		    
		    if(array.get("success").toString().equalsIgnoreCase("true")) {
		    	return true;
		    }
		    return false;
	}
}
