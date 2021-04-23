package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.StoreRepository;
import com.example.demo.model.Stores;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class StoreController {
	
	@Autowired
	StoreRepository storeRespository;
	
	
	@GetMapping("//storeslist")
	public List<Stores> listofStores() {
		return storeRespository.findAll();
		
	}
}
