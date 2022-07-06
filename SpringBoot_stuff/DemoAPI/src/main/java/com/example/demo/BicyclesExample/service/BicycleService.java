package com.example.demo.BicyclesExample.service;

import java.util.List;

import com.example.demo.BicyclesExample.entity.Bicycles;

public interface BicycleService {

	Bicycles getById(Integer id);

	List<Bicycles> getAll();

	Bicycles findByModel(String model);

	Bicycles findByBrand(String brand);

	Bicycles create(Bicycles bicycle);

	Bicycles update(Integer id, String model, String brand, Integer year);

	void delete(Integer id);
}
