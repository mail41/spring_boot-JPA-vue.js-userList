package com.kp.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kp.test.model.User;


// 기본적인 save, find, update, delete 사용 가능
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
}