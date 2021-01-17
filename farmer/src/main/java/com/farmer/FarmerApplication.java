package com.farmer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.farmer.entity.Supplier;
import com.farmer.entity.Users;
import com.farmer.service.SupplierServiceInt;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class FarmerApplication {

	@Autowired
	SupplierServiceInt supplierService;
	
	public static void main(String[] args) {
		SpringApplication.run(FarmerApplication.class, args);
	}
	
	@Bean
    public Docket produceApi()
    {
    	return new Docket(DocumentationType.SWAGGER_2).select().
    			apis(RequestHandlerSelectors.basePackage("com.farmer")).build(); 
    }

	
}
