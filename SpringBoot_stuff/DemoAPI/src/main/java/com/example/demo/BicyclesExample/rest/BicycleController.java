package com.example.demo.BicyclesExample.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.BicyclesExample.entity.Bicycles;

@RestController
public class BicycleController {

	private List<Bicycles> bikes = new ArrayList<>();

	@GetMapping("/getBicycles")
	public List<Bicycles> getBicycles() {
		return this.bikes;
	}

	@GetMapping("/getBicyclesById/{id}")
	public Bicycles getByID(@PathVariable int id) {
		return this.bikes.get(id -1);
	}
	
	
	@PostMapping("/createBicycles")
	public Bicycles create(@RequestBody Bicycles bicycle) {
		System.out.println("Created: " + bicycle);
		this.bikes.add(bicycle);
		return this.bikes.get(this.bikes.size() - 1);
	}

	@PatchMapping("/updateBicycles/{id}")
	public void update(@PathVariable int id, @PathParam("model") String model, @PathParam("brand") String brand,
			@PathParam("year") int year) {
		this.bikes.get(id -1).setModel(model);
		this.bikes.get(id -1).setBrand(brand);
		this.bikes.get(id -1).setYear(year);		
		System.out.println("ID: " + id);
		System.out.println("Model: " + model);
		System.out.println("Brand: " + brand);
		System.out.println("Year: " + year);
	}

	@DeleteMapping("/removeBicycles/{id}")
	public void delete(@PathVariable int id) {
		this.bikes.remove(id -1);
		System.out.println("ID: " + id);
	}

}
