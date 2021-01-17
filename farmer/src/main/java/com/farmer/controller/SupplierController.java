package com.farmer.controller;

import java.util.List;
import java.util.Optional;

import javax.persistence.Column;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farmer.entity.Supplier;
import com.farmer.service.SupplierServiceInt;

@RestController
public class SupplierController {
	
	@Autowired
	SupplierServiceInt supplierService;

	@PostMapping(value="/supplier/add")
	public Supplier registerSupplier(@RequestBody Supplier supplier) 
	{

		return supplierService.registerSupplier(supplier);
	}
	
	@GetMapping(value="/supplier/{supplierId}")
	public Supplier getSupplierById(@PathVariable int supplierId) throws Exception
	{
		Optional<Supplier> supplier= supplierService.getSupplierById(supplierId);
		if(!supplier.isPresent())
			throw new Exception("Not Present");
		return supplier.get();
	}

	@DeleteMapping(value="/supplier/delete/{supplierId}")
	public String deleteEmployeeById(@PathVariable int supplierId) throws Exception {
		
		Optional<Supplier> supplier=supplierService.getSupplierById(supplierId);
		if(!supplier.isPresent())
			throw new Exception("Supplier acoount not present");
		
		supplierService.deleteEmployeeById(supplierId);
		return "deleted Successfully";
	}
	
	@GetMapping(value="/supplier/all")
	public List<Supplier> getSuppliers(){
		return supplierService.getSuppliers();
	}
	
	
}


