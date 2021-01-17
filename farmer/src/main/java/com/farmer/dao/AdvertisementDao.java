package com.farmer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmer.entity.Advertisement;

@Repository
public interface AdvertisementDao extends JpaRepository<Advertisement, Integer>
{

}
