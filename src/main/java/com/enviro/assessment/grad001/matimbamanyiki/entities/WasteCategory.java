package com.enviro.assessment.grad001.matimbamanyiki.entities;

public class WasteCategory {

	private long id; //specifies the primary key
	private String name;// ensures name cannot be null
	private String wastecategory; //ensures category cannot be null
	
	//@param id, name waste category
	public WasteCategory(long id, String name, String wastecategory) {
		super();
		this.id = id;
		this.name = name;
		this.wastecategory = wastecategory;
	}
	//getter for id
	public long getId() {
		return id;
	}
	//setter for id
	public void setId(long id) {
		this.id = id;
	}
	//getter for name
	public String getName() {
		return name;
	}
	//setter for name
	public void setName(String name) {
		this.name = name;
	}
	//getter for waste category
	public String getWastecategory() {
		return wastecategory;
	}
	//setter for waste category
	public void setWastecategory(String wastecategory) {
		this.wastecategory = wastecategory;
	}
	public WasteCategory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
