package com.example.demo.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "user_tb")
public class UserEditEntity {
	
	@Id
	@Column(name = "user_id")
	private Integer user_id;
	
	private String name;

	@Column(name = "name_kana")
	private String name_kana; 
	
	@Column(name = "mail_address")
	private String mail_address; 
	
	@Column(name = "password")
	private String password;
	
}