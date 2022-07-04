package com.example.demo.BicyclesExample.rest;

import java.util.ArrayList;
import java.util.List;

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

	@GetMapping("/")
	public Bicycles getBicycles() {
		return new Bicycles("Allez", "Specialized", 2021);
	}

	@PostMapping("/createBicycle")
	public Bicycles create(@RequestBody Bicycles bicycle) {
		System.out.println("Created: " + bicycle);
		this.bikes.add(bicycle);
		return this.bikes.get(this.bikes.size()-1);
	}

	@PatchMapping("/updateBicycles")
	public void update(@PathVariable int id, @PathParam("model") String model, @PathParam("make") String make, @PathParam("year") int year) {
		System.out.println("ID: " + id);
		System.out.println("Model: " + model);
		System.out.println("Make: " + make);
		System.out.println("Year: " + year);
	}

	@DeleteMapping("/removeBicycle/{id}")
	public void delete(@PathVariable int id) {
		System.out.println("Year: " + id);
	}

}
