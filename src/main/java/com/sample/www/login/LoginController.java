package com.sample.www.login;

import java.text.DateFormat;
import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonObject;

/**
 * Handles requests for the application home page.
 */
@RestController
public class LoginController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private static final String LOGIN = "/login";
	
	
	
	
	@PostMapping(value = LOGIN, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public JsonObject sampleApi(final HttpServletResponse response,@RequestParam(value ="loginId", required = true) String loginId ,@RequestParam(value = "loginPw",required = true) String loginPw) throws Exception {
		JsonObject result = new JsonObject();	
			
		System.out.println(loginId);
			
		String returnStr = "리턴 결과|테스트";
		//ApiUtil.responseWriter(returnStr,response);
		
		result.addProperty("test", "1111");
		result.addProperty("isSucess", "1111");
		return result; 
	}
}


