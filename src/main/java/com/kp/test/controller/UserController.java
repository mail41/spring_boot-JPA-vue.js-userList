package com.kp.test.controller;

import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kp.test.model.User;
import com.kp.test.repository.UserRepository;
import com.kp.test.service.UserService;

import lombok.RequiredArgsConstructor;

@CrossOrigin("*")
@Component
@RestController
public class UserController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRepository userRepository;
	
	//회원목록
	@RequestMapping("/selectUser")
	public List selectUser(){

		return userService.selectUser();	
		
	}
	
}

