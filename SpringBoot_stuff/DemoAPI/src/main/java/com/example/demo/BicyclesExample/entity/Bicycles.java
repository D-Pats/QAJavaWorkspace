package com.example.demo.BicyclesExample.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // Table
public class Bicycles {

	@Id // Private Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment
	private Integer id;

	private String model;

	private String brand;

	private Integer releaseYear;

	public Bicycles() {
		super();
	}

	public Bicycles(Integer id, String model, String brand, Integer releaseYear) {
		super();
		this.id = id;
		this.model = model;
		this.brand = brand;
		this.releaseYear = releaseYear;
	}

	public Bicycles(String model, String brand, Integer releaseYear) {
		super();
		this.model = model;
		this.brand = brand;
		this.releaseYear = releaseYear;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
