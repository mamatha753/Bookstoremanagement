package com.bookstoremanagement.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.bookstoremanagement.responses.ResponseInfo;

@RestControllerAdvice
public class GlobalHandlerException {
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ResponseInfo> globalhandler(Exception ex,HttpServletRequest req){
		ResponseInfo ri = new ResponseInfo();
		ri.setUri(req.getRequestURI());
		ri.setStatusType(HttpStatus.NOT_FOUND);
		ri.setStatusCode(HttpStatus.NOT_FOUND.value());
		ri.setMsg(ex.getMessage());
		return new ResponseEntity<>(ri,HttpStatus.NOT_FOUND);
	}
	
}
