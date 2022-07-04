package com.example.demo.BicyclesExample.rest;

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

	@GetMapping("/")
	public Bicycles getBicycles() {
		return new Bicycles("Allez", "Specialized", 2021);
	}

	@PostMapping("/createBicycle")
	public void create(@RequestBody Bicycles giant) {
		System.out.println("Created: " + giant);
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
