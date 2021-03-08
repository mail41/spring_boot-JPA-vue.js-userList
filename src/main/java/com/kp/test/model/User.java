package com.kp.test.model;
import javax.persistence.*;

import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Table(name ="member")
public class User {

   @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // 특정 데이터베이스에 맞게 자동으로 식별키 생성
    @Column
    private Long user_id;

    @Column
    private String email;

    @Column
    private String user_name;

    @Column
    private String password;
    
    public User(){}

    @Builder
    public User(String email, String user_name) {
	  this.email = email;
	  this.user_name = user_name;
	}
    
	    
}
