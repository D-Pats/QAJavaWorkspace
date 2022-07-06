package com.example.demo.BicyclesExample.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // Table
public class Bicycles {

	@Id // Private Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment
	private int id;

	private String model;

	private String brand;

	private int year;

	public Bicycles() {
		super();
	}

	public Bicycles(int id, String model, String brand, int year) {
		super();
		this.id = id;
		this.model = model;
		this.brand = brand;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	public int hashCode() {
		return Objects.hash(brand, id, model, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bicycles other = (Bicycles) obj;
		return Objects.equals(brand, other.brand) && id == other.id && Objects.equals(model, other.model)
				&& year == other.year;
	}

	@Override
	public String toString() {
		return "Bicycles [id=" + id + ", model=" + model + ", brand=" + brand + ", year=" + year + "]";
	}

}
