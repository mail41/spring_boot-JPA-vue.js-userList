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
	
	
	 	//회원가입
//	    public void signUpUser(UserForm userForm) throws Exception {
//	        validateDuplicateEmail(userForm.getEmail());
//	        userRepository.save(User.createUser(userForm));
//	    }
	 	
	 	//이메일 중복확인
//	    private void validateDuplicateEmail(String email) throws Exception {
//	        if(userRepository.existsByEmail(email)){
//	            throw new DuplicateEmailException();
//	        }
//	    }
	    //회원목록
	    public List selectUser() {
	        return userRepository.findAll();
	    }
//	 
//	 public List<User> findAll() { 
//		 List<User> user = new ArrayList<>(); 
//		 userRepository.findAll().forEach(e -> user.add(e)); 
//		 logger.info("@@@@"+user);
//		 return user; 
//		 }

}
