package com.example.demo.BicyclesExample.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.BicyclesExample.entity.Bicycles;

@Service

public class BicycleServiceList implements BicycleService {

	private List<Bicycles> bikes = new ArrayList<>();

	@Override
	public Bicycles getById(int id) {
		// TODO Auto-generated method stub
		return this.bikes.get(id);
	}

	@Override
	public List<Bicycles> getAll() {
		// TODO Auto-generated method stub
		return this.bikes;
	}

	@Override
	public Bicycles create(Bicycles bike) {
		// TODO Auto-generated method stub
		this.bikes.add(bike);
		return this.bikes.get(this.bikes.size() - 1);
	}

	@Override
	public Bicycles update(int id, String model, String brand, Integer year) {
		// TODO Auto-generated method stub
		Bicycles toUpdate = this.getById(id);
		if (model != null)
			toUpdate.setModel(model);
		if (brand != null)
			toUpdate.setBrand(brand);
		if (year != null)
			toUpdate.setYear(year);
		return toUpdate;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		this.bikes.remove(id);
	}

	@Override
	public Bicycles findByModel(String model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bicycles findByBrand(String brand) {
		// TODO Auto-generated method stub
		return null;
	}

}
