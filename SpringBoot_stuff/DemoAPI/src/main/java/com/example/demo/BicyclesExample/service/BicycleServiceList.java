package com.example.demo.BicyclesExample.service;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.BicyclesExample.entity.Bicycles;

@Service
@Primary
public class BicycleServiceList implements BicycleService{

	@Override
	public Bicycles getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bicycles> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bicycles create(Bicycles bicycle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bicycles update(int id, String model, String brand, Integer year) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	
}
