package com.farmer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.farmer.entity.Supplier;



@Service
public interface SupplierServiceInt {

	public Supplier registerSupplier(Supplier supplier);
	
	public Optional<Supplier> getSupplierById(int supplierId);
	
	public void deleteEmployeeById(int supplierId);
	
	public List<Supplier> getSuppliers();
	
}
