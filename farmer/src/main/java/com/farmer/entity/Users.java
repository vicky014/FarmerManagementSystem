package com.farmer.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@SequenceGenerator(name = "user_id_gen", initialValue = 1000, allocationSize = 1)
public class Users 
{
	@Id
	@Column(name = "user_id")
	@GeneratedValue(generator = "user_id_gen", strategy = GenerationType.SEQUENCE)
	private Integer userId;
	@Column(name = "password")
	private String password;
	@Column(name = "type")
	private char type;
	
//	@OneToOne
//	@JoinColumn(name="supplier_id",unique=true)
//	private Supplier supplier;

	public Users() 
	{
		
	}

	public Users(Integer userId, String password, char type) {
		super();
		this.userId = userId;
		this.password = password;
		this.type = type;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}
	
	

}
