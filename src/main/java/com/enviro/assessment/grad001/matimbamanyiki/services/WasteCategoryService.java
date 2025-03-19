package com.enviro.assessment.grad001.matimbamanyiki.services;

import java.util.List;

import com.enviro.assessment.grad001.matimbamanyiki.entities.WasteCategory;

//Service interface for managing waste categories
// Defines CRUD operations for handling waste category entities
public interface WasteCategoryService {
	
	//Retrieves a list of all waste categories
	public List<WasteCategory> getWasteCategories();
	
	//adds a new waste category
	public WasteCategory addWasteCategory(WasteCategory Category);
	
	//Retrieves a waste category by its unique Id
	public WasteCategory getWasteCategory(long CategoryId); 
	
	//updates an existing waste category
	public WasteCategory updateWasteCategory(WasteCategory Cataegory);
	
	//Deletes a waste category by its unique Id
	public void deleteWasteCategory(long CategoryId); 
	
	}
 