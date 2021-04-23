package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.StoreRepository;
import com.example.demo.model.Stores;

@SpringBootApplication
public class SpringBootWithReactImplementationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithReactImplementationApplication.class, args);
	}
	@Autowired
	StoreRepository storeRepository;
	
	@Override
	public void run(String...args) throws Exception{
		 storeRepository.save(new Stores("Pharma Store","pharmastore@gmail.com","123456789"));
		 storeRepository.save(new Stores("24/7 MedicalStore","24/7medicalstore@gmail.com","9988774455"));
		 storeRepository.save(new Stores("Medical Store","medicalstore@gmail.com","9998574851"));
		 storeRepository.save(new Stores("DrugChemistStore","chemiststore@gmail.com","123456789"));
		 storeRepository.save(new Stores("Om Medical Store","omstore@gmail.com","678912342"));
		 storeRepository.save(new Stores("Medi Store","medistore@gmail.com","133456789"));
	}

}
