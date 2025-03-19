
package com.enviro.assessment.grad001.matimbamanyiki.services;

import java.util.ArrayList;
import java.util.Arrays;


import java.util.List;


import org.springframework.stereotype.Service;
import com.enviro.assessment.grad001.matimbamanyiki.entities.WasteCategory;

@Service
public class WasteCategoryServiceImpl implements WasteCategoryService{
	
	//In-memory list of waste categories for demonstration purposes
	
	List<WasteCategory> list = new ArrayList<>(Arrays.asList(new WasteCategory(1, "Waste", "Plastic"), new WasteCategory(2, "Waste", "Paper"), new WasteCategory(3, "Waste", " Glass")));

	//Retrieves all waste categories
	@Override
	public List<WasteCategory> getWasteCategories() {
		return list;		
	}
//Adds a new waste category to the list
	@Override
	public WasteCategory addWasteCategory(WasteCategory Category) { 
		list.add(Category);
		return Category; 
	}
	//return the waste category object if found, otherwise null
	@Override
	public WasteCategory getWasteCategory(long CategoryId) {  
		for(WasteCategory Category:list) {
			if(Category.getId()==CategoryId) {
				return Category;
			}
		}
		return null;
	}

	//return the updated waste category object
	@Override
	public WasteCategory updateWasteCategory(WasteCategory Category) {
		
		list.forEach(e->{
			if(e.getId()==Category.getId()) {
				e.setName(Category.getName());
				e.setWastecategory(Category.getWastecategory());
			}
		});
		return Category;
	}
	
	//Deletes a waste category by its Id
	@Override
 public void deleteWasteCategory(long CategoryId) {
	    System.out.println("Deleting Category with ID: " + CategoryId);
	    boolean removed = list.removeIf(category -> category.getId() == CategoryId);
	    if (removed) {
	        System.out.println("Category deleted successfully");
	    } else {
	        System.out.println("Category not found");
	    }
	}

	
 
		
	}
	


	
	

