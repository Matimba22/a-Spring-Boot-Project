package com.enviro.assessment.grad001.matimbamanyiki.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.enviro.assessment.grad001.matimbamanyiki.entities.WasteCategory;
import com.enviro.assessment.grad001.matimbamanyiki.services.WasteCategoryService;

//This Rest Controller handles CRUD operations for WasteCategory entities

@RestController
public class Controller {
	
	@Autowired
	public WasteCategoryService WasteCategoryService;
	
	@GetMapping("/home")
	public String home() {
		return "This is home of Waste Management Project";
	}
	
	//A simple welcome message
	@GetMapping("/home/WasteCategories")
	public List<WasteCategory> getWasteCategories() {
		return this.WasteCategoryService.getWasteCategories();
	}
	 
	 //Retrieves a specific waste category by its Id
	
	@GetMapping("/home/WasteCategories/{CategoryId}")    
	public WasteCategory getWasteCategory(@PathVariable("CategoryId") long CategoryId) {
		return this.WasteCategoryService.getWasteCategory(CategoryId);
	}
	
	// creates a new waste category
	
	//Return responseEntity with the created wastecategory and HTTP status 201 (Created) 
	
	@PostMapping("/home/WasteCategories")
	public ResponseEntity<WasteCategory> addWasteCategory(@RequestBody WasteCategory Category) {
		WasteCategory WasteCategory = this.WasteCategoryService.addWasteCategory(Category);   
		return new ResponseEntity<>(WasteCategory, HttpStatus.CREATED);
		
	}
	//update an existing waste category
	
	@PutMapping("/home/WasteCategories/{CategoryId}") 
	public WasteCategory updateWasteCategory(@RequestBody WasteCategory Category) {
		return this.WasteCategoryService.updateWasteCategory(Category);

	}
	
	//Deletes a waste category by its Id
	@DeleteMapping("/home/WasteCategories/{CategoryId}")
	public ResponseEntity<HttpStatus> deleteWasteCategory(@PathVariable ("CategoryId")long CategoryId) {
		try {
			this.WasteCategoryService.deleteWasteCategory(CategoryId);
			return new ResponseEntity<>(HttpStatus.OK); // Success response
		}
		catch (Exception e) {
			e.printStackTrace(); // Log the error for debugging
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); //Error response
		}
	}	    
	}

			
		
	

