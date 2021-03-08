package com.kp.test.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kp.test.model.User;
import com.kp.test.repository.UserRepository;

import lombok.RequiredArgsConstructor;


@Service
public class UserService {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserRepository userRepository;
	
	    //회원목록
	    public List selectUser() {
	        return userRepository.findAll();
	    }	

}
