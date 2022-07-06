package com.example.demo.BicyclesExample.service;

import java.util.List;

import com.example.demo.BicyclesExample.entity.Bicycles;

public interface BicycleService {

	Bicycles getById(int id);

	List<Bicycles> getAll();

	Bicycles findByModel(String model);

	Bicycles findByBrand(String brand);

	Bicycles create(Bicycles bicycle);

	Bicycles update(int id, String model, String brand, Integer year);

	void delete(int id);
}
