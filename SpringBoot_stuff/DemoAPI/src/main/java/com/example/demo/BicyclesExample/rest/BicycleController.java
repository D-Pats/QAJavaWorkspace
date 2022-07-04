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

	private static List<Bicycles> bikes = new ArrayList<>();

//	Maybe put below in another class and have getBicycles run the method from that class?	
//	Map<Integer, Bicycles> bikeMap = new HashMap<>();
//
//	public static void main(String[] args) {
//		for (int i = 0; bikes.size(); i++) {
//
//		}
//		;
//	}

//	Bicycles bike1 = new Bicycles("Allez", "Specialized", 2021);
//	Bicycles bike2 = new Bicycles("Dogma F12", "Pinarello", 2022);
//	Bicycles bike3 = new Bicycles("Timemachine Road", "BMC", 2021);

	@GetMapping("/demoBicycles")
	public Bicycles getBicycles() {
		return new Bicycles("Allez", "Specialized", 2021);
	}

	@PostMapping("/createBicycles")
	public Bicycles create(@RequestBody Bicycles bicycle) {
		System.out.println("Created: " + bicycle);
		this.bikes.add(bicycle);
		return this.bikes.get(this.bikes.size() - 1);
	}

	@PatchMapping("/updateBicycles")
	public void update(@PathVariable int id, @PathParam("model") String model, @PathParam("brand") String brand,
			@PathParam("year") int year) {
		System.out.println("ID: " + id);
		System.out.println("Model: " + model);
		System.out.println("Brand: " + brand);
		System.out.println("Year: " + year);
	}

	@DeleteMapping("/removeBicycles/{id}")
	public void delete(@PathVariable int id) {
		System.out.println("ID: " + id);
	}

}
