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
@Table(name = "supplier")
@SequenceGenerator(name = "supplier_id_gen", initialValue = 1000, allocationSize = 1)
public class Supplier 
{
	@Id
	@Column(name = "supplier_id")
	@GeneratedValue(generator = "supplier_id_gen", strategy = GenerationType.SEQUENCE)
	private Integer supplierId;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private Users user;
	
	@Column(name="name")
	private String supplierName;
	@Column(name = "phone_number")
	private String phoneNumber;
	@Column(name = "email")
	private String email;
	@Column(name="password")
	private String password;
	
	

	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Supplier(Integer supplierId, String supplierName, String phoneNumber, String email, String password) {
		super();
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
	}


	public Integer getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
