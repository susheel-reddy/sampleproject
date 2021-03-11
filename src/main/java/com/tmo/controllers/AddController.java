package com.tmo.controllers;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tmo.model.AddResponse;

@RestController
public class AddController{

	@RequestMapping(value = "/{num1}",method=RequestMethod.GET,produces = {"application/json"})
	public @ResponseBody AddResponse addTen(@PathVariable("num1") Long num1) throws Exception{	
		AddResponse response = new AddResponse();
		response.setSum(num1+10);
		return response;
		
	}
	
	@RequestMapping(value = "/{num1}/{num2}",method=RequestMethod.GET,produces = {"application/json"})
	public @ResponseBody AddResponse sumOfNumbers(@PathVariable("num1") Long num1, @PathVariable("num2") Long num2) throws Exception{
		AddResponse response = new AddResponse();
		response.setSum(num1+num2);
		return response;
		
	}
	
}

