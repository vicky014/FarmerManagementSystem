package com.farmer.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farmer.dao.FarmerDao;
import com.farmer.dao.SupplierDao;
import com.farmer.dao.UsersDao;
//import com.farmer.entity.Farmer;
import com.farmer.entity.Users;

@Service
public class UserServices 
{

	@Autowired
	UsersDao userDao;
	
	@Autowired
	FarmerDao farmerDao;
	
	@Autowired
	SupplierDao supplierDao;
	
	@Autowired 
	public void userDaoService(UsersDao userDao)
	{
		this.userDao = userDao;
	}
	
	@Autowired 
	public void farmerDaoService(FarmerDao farmerDao)
	{
		this.farmerDao = farmerDao;
	}
	
	@Autowired 
	public void supplierDaoService(SupplierDao supplierDao)
	{
		this.supplierDao = supplierDao;
	}
	
	@Transactional
	public Optional<Users> userLogin(Users user)
	{
		Optional<Users> u = userDao.findById(user.getUserId());
		if(u.isPresent() && u.get().getPassword().equals(user.getPassword()))
			return u;
		return null;
	}
	
	/*
	 * @Transactional public Optional<Farmer> farmerLogin(Users user) {
	 * Optional<Users> u = userLogin(user); if(u.isPresent() &&
	 * (u.get().getType()=='f' || u.get().getType()=='F')) return
	 * farmerDao.findByUserId(u.get().getUserId()); else return null; }
	 */
}
