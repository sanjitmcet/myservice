package com.sanjit.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sanjit.Model.UserHitCount;
import com.sanjit.Service.AppImpl;

@RestController
public class AppController {
		
	@Autowired
	AppImpl manager;
	
	
	@RequestMapping(value = "/UserHitCount", method = RequestMethod.GET, produces = "application/json")	
	public @ResponseBody UserHitCount hotelProfileDeposit() {		
		return manager.getUserHitCount();
		
	}
}