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
	private Integer id;

	private String model;

	private String brand;

	private int year;

	public Bicycles() {
		super();
	}

	public Bicycles(String model, String brand, int year) {
		super();
		this.model = model;
		this.brand = brand;
		this.year = year;
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

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + this.year;
//		result = prime * result + ((this.model == null) ? 0 : this.model.hashCode());
//		result = prime * result + ((this.brand == null) ? 0 : this.brand.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Bicycles other = (Bicycles) obj;
//		if (this.year != other.year)
//			return false;
//		if (this.model == null) {
//			if (other.model != null)
//				return false;
//		} else if (!this.model.equals(other.model))
//			return false;
//		if (this.brand == null) {
//			if (other.brand != null)
//				return false;
//		} else if (!this.brand.equals(other.brand))
//			return false;
//		return true;
//	}

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
		return Objects.equals(brand, other.brand) && Objects.equals(id, other.id) && Objects.equals(model, other.model)
				&& year == other.year;
	}

	@Override
	public String toString() {
		return "Bicycles [id=" + id + ", model=" + model + ", brand=" + brand + ", year=" + year + "]";
	}

}
