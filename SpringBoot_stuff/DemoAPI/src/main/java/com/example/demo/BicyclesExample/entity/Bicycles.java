package com.example.demo.BicyclesExample.entity;

public class Bicycles {
	private String model;
	private String brand;
	private int year;

	public Bicycles() {
	}

	public Bicycles(String model, String brand, int year) {
		super();
		this.model = model;
		this.brand = brand;
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Bicycles [model=" + model + ", make=" + brand + ", year=" + year + "]";
	}
}
