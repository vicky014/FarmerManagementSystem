package com.farmer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmer.entity.Users;

@Repository
public interface UsersDao extends JpaRepository<Users, Integer> 
{
	
}
