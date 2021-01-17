package com.farmer.entity;

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
@Table(name = "farmer")
@SequenceGenerator(name = "farmer_id_gen", allocationSize = 1)
public class Farmer 
{
	@Id
	@Column(name = "farmer_id")
	@GeneratedValue(generator = "farmer_id_gen", strategy = GenerationType.SEQUENCE)
	private Integer farmerId;
	@Column(name = "farmer_name")
	private String farmerName;
	@Column(name = "aadhaar_number")
	private Long aadhaarNumber;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private Users user;
	@Column(name = "area")
	private String area;
	@Column(name = "pin_code")
	private Integer pincode;
	
	public Farmer() 
	{
		
	}
	
	public Farmer(Integer farmerId, String farmerName, Long aadhaarNumber, Users user, String area, Integer pincode) 
	{
		super();
		this.farmerId = farmerId;
		this.farmerName = farmerName;
		this.aadhaarNumber = aadhaarNumber;
		this.user = user;
		this.area = area;
		this.pincode = pincode;
	}
	
	public Integer getFarmerId() 
	{
		return farmerId;
	}

	public void setFarmerId(Integer farmerId) 
	{
		this.farmerId = farmerId;
	}

	public String getFarmerName() 
	{
		return farmerName;
	}

	public void setFarmerName(String farmerName) 
	{
		this.farmerName = farmerName;
	}

	public Long getAadhaarNumber() 
	{
		return aadhaarNumber;
	}

	public void setAadhaarNumber(Long aadhaarNumber) 
	{
		this.aadhaarNumber = aadhaarNumber;
	}

	public Users getUser() 
	{
		return user;
	}

	public void setUser(Users user) 
	{
		this.user = user;
	}

	public String getArea() 
	{
		return area;
	}

	public void setArea(String area) 
	{
		this.area = area;
	}

	public Integer getPincode() 
	{
		return pincode;
	}

	public void setPincode(Integer pincode) 
	{
		this.pincode = pincode;
	}
	 
}
