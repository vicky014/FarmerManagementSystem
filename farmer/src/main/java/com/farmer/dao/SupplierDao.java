package com.farmer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmer.entity.Supplier;

@Repository
public interface SupplierDao extends JpaRepository<Supplier, Integer> 
{

}
