package com.farmer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmer.entity.Crop;

@Repository
public interface CropDao extends JpaRepository<Crop, Integer>
{

}
