package com.farmer.dao;

//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.farmer.entity.Farmer;

@Repository
public interface FarmerDao extends JpaRepository<Farmer, Integer>
{

	/*
	 * @Query("select f from Farmer f where f.userId=:userId") Optional<Farmer>
	 * findByUserId(String userId);
	 */
}
