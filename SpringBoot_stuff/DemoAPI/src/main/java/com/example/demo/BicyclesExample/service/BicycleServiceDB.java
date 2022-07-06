package com.example.demo.BicyclesExample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.BicyclesExample.entity.Bicycles;
import com.example.demo.BicyclesExample.repo.BicyclesRepo;

@Service
@Primary
public class BicycleServiceDB implements BicycleService {

	@Autowired
	private BicyclesRepo repo;

	@Override
	public Bicycles getById(int id) {
		// TODO Auto-generated method stub
		return this.repo.findById(id).get();
	}

	@Override
	public List<Bicycles> getAll() {
		// TODO Auto-generated method stub
		return this.repo.findAll();
	}

	@Override
	public Bicycles create(Bicycles bikes) {
		// TODO Auto-generated method stub
		return this.repo.save(bikes);
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
			toUpdate.setReleaseYear(year);
		return this.repo.save(toUpdate);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		this.repo.deleteById(id);
	}

	@Override
	public Bicycles findByModel(String model) {
		// TODO Auto-generated method stub
		return this.repo.findByModelIgnoreCase(model);
	}

	@Override
	public Bicycles findByBrand(String brand) {
		// TODO Auto-generated method stub
		return this.repo.findByBrandIgnoreCase(brand);
	}

}
