package com.ttd.common.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import com.ttd.common.model.ErrorInfo;
import com.ttd.common.model.ErrorMessage;
import com.ttd.common.model.GlobalExceptionInfo;

@ControllerAdvice
public class RestExceptionController {
	
	private static final Logger logger = LoggerFactory.getLogger(RestExceptionController.class);
	
	@ExceptionHandler(RuntimeException.class)
	
    @ResponseStatus(value=HttpStatus.NOT_FOUND)
    @ResponseBody
    public GlobalExceptionInfo exceptionHandler(HttpServletRequest req, RuntimeException ex) {
        
       //1
		String errorMessage = "Invalid input or Mandatory fields are missing";
        
        StringWriter stack = new StringWriter();
        ex.printStackTrace(new PrintWriter(stack));
		logger.error(stack.toString());
		
        //errorMessage += ex.getMessage();
        String errorURL = req.getRequestURL().toString();
         
        return new GlobalExceptionInfo(errorMessage);
    }
	
	@ExceptionHandler(ArithmeticException.class)
    @ResponseStatus(value=HttpStatus.NOT_FOUND)
    @ResponseBody
    public GlobalExceptionInfo exceptionHandlerArit(HttpServletRequest req, RuntimeException ex) {
       //2 
        String errorMessage = "Invalid input or Mandatory fields are missing";
        
        StringWriter stack = new StringWriter();
        ex.printStackTrace(new PrintWriter(stack));
		logger.error(stack.toString());
		
        //errorMessage += ex.getMessage();
        String errorURL = req.getRequestURL().toString();
         
        return new GlobalExceptionInfo(errorMessage);
    }
	
	@ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    @ResponseStatus(value=HttpStatus.NOT_FOUND)
    @ResponseBody
    public GlobalExceptionInfo exceptionHandlerArray(HttpServletRequest req, RuntimeException ex) {
        //3
        String errorMessage = "Invalid input or Mandatory fields are missing";
        
        StringWriter stack = new StringWriter();
        ex.printStackTrace(new PrintWriter(stack));
		logger.error(stack.toString());
		
        //errorMessage += ex.getMessage();
        String errorURL = req.getRequestURL().toString();
         
        return new GlobalExceptionInfo(errorMessage);
    }
	
	@ExceptionHandler(ClassNotFoundException.class)
    @ResponseStatus(value=HttpStatus.NOT_FOUND)
    @ResponseBody
    public GlobalExceptionInfo exceptionHandlerClassNot(HttpServletRequest req, RuntimeException ex) {
       //4 
        String errorMessage = "Invalid input or Mandatory fields are missing";
        
        StringWriter stack = new StringWriter();
        ex.printStackTrace(new PrintWriter(stack));
		logger.error(stack.toString());
		
        //errorMessage += ex.getMessage();
        String errorURL = req.getRequestURL().toString();
         
        return new GlobalExceptionInfo(errorMessage);
    }
	
	@ExceptionHandler(FileNotFoundException.class)
    @ResponseStatus(value=HttpStatus.NOT_FOUND)
    @ResponseBody
    public GlobalExceptionInfo exceptionHandlerFileNotF(HttpServletRequest req, RuntimeException ex) {
        //5
        String errorMessage = "Invalid input or Mandatory fields are missing";
        
        StringWriter stack = new StringWriter();
        ex.printStackTrace(new PrintWriter(stack));
		logger.error(stack.toString());
		
        //errorMessage += ex.getMessage();
        String errorURL = req.getRequestURL().toString();
         
        return new GlobalExceptionInfo(errorMessage);
    }
	@ExceptionHandler(IOException.class)
    @ResponseStatus(value=HttpStatus.NOT_FOUND)
    @ResponseBody
    public GlobalExceptionInfo exceptionHandlerIO(HttpServletRequest req, RuntimeException ex) {
        //6
        String errorMessage = "Invalid input or Mandatory fields are missing";
        
        StringWriter stack = new StringWriter();
        ex.printStackTrace(new PrintWriter(stack));
		logger.error(stack.toString());
		
        //errorMessage += ex.getMessage();
        String errorURL = req.getRequestURL().toString();
         
        return new GlobalExceptionInfo(errorMessage);
    }
	@ExceptionHandler(InterruptedException.class)
    @ResponseStatus(value=HttpStatus.NOT_FOUND)
    @ResponseBody
    public GlobalExceptionInfo exceptionHandlerInterr(HttpServletRequest req, RuntimeException ex) {
        //7
        String errorMessage = "Invalid input or Mandatory fields are missing";
        
        StringWriter stack = new StringWriter();
        ex.printStackTrace(new PrintWriter(stack));
		logger.error(stack.toString());
		
        //errorMessage += ex.getMessage();
        String errorURL = req.getRequestURL().toString();
         
        return new GlobalExceptionInfo(errorMessage);
    }
	@ExceptionHandler(NoSuchFieldException.class)
    @ResponseStatus(value=HttpStatus.NOT_FOUND)
    @ResponseBody
    public GlobalExceptionInfo exceptionHandlerAritNoSuchField(HttpServletRequest req, RuntimeException ex) {
        //8
        String errorMessage = "Invalid input or Mandatory fields are missing";
        
        StringWriter stack = new StringWriter();
        ex.printStackTrace(new PrintWriter(stack));
		logger.error(stack.toString());
		
        //errorMessage += ex.getMessage();
        String errorURL = req.getRequestURL().toString();
         
        return new GlobalExceptionInfo(errorMessage);
    }
	@ExceptionHandler(NoSuchMethodException.class)
    @ResponseStatus(value=HttpStatus.NOT_FOUND)
    @ResponseBody
    public GlobalExceptionInfo exceptionHandlerNoSuchMeth(HttpServletRequest req, RuntimeException ex) {
        //9
        String errorMessage = "Invalid input or Mandatory fields are missing";
        
        StringWriter stack = new StringWriter();
        ex.printStackTrace(new PrintWriter(stack));
		logger.error(stack.toString());
		
        //errorMessage += ex.getMessage();
        String errorURL = req.getRequestURL().toString();
         
        return new GlobalExceptionInfo(errorMessage);
    }
	@ExceptionHandler(NullPointerException.class)
    @ResponseStatus(value=HttpStatus.NOT_FOUND)
    @ResponseBody
    public GlobalExceptionInfo exceptionHandlerNullPoint(HttpServletRequest req, RuntimeException ex) {
       //10 
        String errorMessage = "Invalid input or Mandatory fields are missing";
        
        StringWriter stack = new StringWriter();
        ex.printStackTrace(new PrintWriter(stack));
		logger.error(stack.toString());
		
        //errorMessage += ex.getMessage();
        String errorURL = req.getRequestURL().toString();
         
        return new GlobalExceptionInfo(errorMessage);
    }
	@ExceptionHandler(NumberFormatException.class)
    @ResponseStatus(value=HttpStatus.NOT_FOUND)
    @ResponseBody
    public GlobalExceptionInfo exceptionHandlerNumberFormat(HttpServletRequest req, RuntimeException ex) {
        //11
        String errorMessage = "Invalid input or Mandatory fields are missing";
        
        StringWriter stack = new StringWriter();
        ex.printStackTrace(new PrintWriter(stack));
		logger.error(stack.toString());
		
        //errorMessage += ex.getMessage();
        String errorURL = req.getRequestURL().toString();
         
        return new GlobalExceptionInfo(errorMessage);
    }
	@ExceptionHandler(StringIndexOutOfBoundsException.class)
    @ResponseStatus(value=HttpStatus.NOT_FOUND)
    @ResponseBody
    public GlobalExceptionInfo exceptionHandlerStringIndex(HttpServletRequest req, RuntimeException ex) {
      //12  
        String errorMessage = "Invalid input or Mandatory fields are missing";
        
        StringWriter stack = new StringWriter();
        ex.printStackTrace(new PrintWriter(stack));
		logger.error(stack.toString());
		
        //errorMessage += ex.getMessage();
        String errorURL = req.getRequestURL().toString();
         
        return new GlobalExceptionInfo(errorMessage);
    }
	
	@ExceptionHandler
    @ResponseStatus(value=HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ErrorMessage internalException(MethodArgumentNotValidException ecpection) {
        
		 List<FieldError> fieldErrors = ecpection.getBindingResult().getFieldErrors();
		    List<ObjectError> globalErrors = ecpection.getBindingResult().getGlobalErrors();
         
		    List<String> errors = new ArrayList<String>();
			//(fieldErrors.size() + globalErrors.size());sss
		    String error;
		    for (FieldError fieldError : fieldErrors) {
		        error = fieldError.getField() + ", " + fieldError.getDefaultMessage();
		        errors.add(error);
		    }
		    for (ObjectError objectError : globalErrors) {
		        error = objectError.getObjectName() + ", " + objectError.getDefaultMessage();
		        errors.add(error);
		    }
		    return new ErrorMessage(errors);         
       
    }
	
	@ExceptionHandler(IllegalStateException.class)	
    @ResponseStatus(value=HttpStatus.NOT_FOUND)
    @ResponseBody
    public GlobalExceptionInfo exceptionHandlerIllegal(HttpServletRequest req, RuntimeException ex) {
        
       //13
		String errorMessage = "Invalid input or Mandatory fields are missing";
        
        StringWriter stack = new StringWriter();
        ex.printStackTrace(new PrintWriter(stack));
		logger.error(stack.toString());
		
        //errorMessage += ex.getMessage();
        String errorURL = req.getRequestURL().toString();
         
        return new GlobalExceptionInfo(errorMessage);
    }
	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
    public ModelAndView handleError405(HttpServletRequest request, Exception e) {
		
		logger.info("error service venki *******************************************************************");
        String url = request.getHeader("Referer");
        logger.info("Refer Header *******************************************************************"+url);
		

		return new ModelAndView("redirect:/serverError");
    }


}
