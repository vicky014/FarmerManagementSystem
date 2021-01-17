package com.farmer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farmer.dao.SupplierDao;
import com.farmer.entity.Supplier;

@Service
public class SupplierService implements SupplierServiceInt{

	@Autowired
	SupplierDao supplierDao;
	
	@Override
	public Supplier registerSupplier(Supplier supplier) {
		
		return supplierDao.save(supplier);
	}

	@Override
	public Optional<Supplier> getSupplierById(int supplierId) {
		
		return supplierDao.findById(supplierId);
	}

	@Override
	public void deleteEmployeeById(int supplierId) {
		
		supplierDao.deleteById(supplierId);
	}

	@Override
	public List<Supplier> getSuppliers() {
		
		return supplierDao.findAll();
	}
	

}
