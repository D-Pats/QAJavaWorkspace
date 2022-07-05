package com.example.demo.BicyclesExample.rest;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<List<Bicycles>> getBicycles() {
		return new ResponseEntity<List<Bicycles>>(this.bikes, HttpStatus.ACCEPTED);
	}

	@GetMapping("/getBicyclesById/{id}")
	public ResponseEntity<Bicycles> getByID(@PathVariable int id) {
		Bicycles byID = this.bikes.get(id -1);
		return new ResponseEntity<Bicycles>(byID, HttpStatus.ACCEPTED);
	}
	
	
	@PostMapping("/createBicycles")
	public ResponseEntity<Bicycles> create(@RequestBody Bicycles bicycle) {
		System.out.println("Created: " + bicycle);
		this.bikes.add(bicycle);
		Bicycles created = this.bikes.get(this.bikes.size() - 1);
		return new ResponseEntity<Bicycles>(created, HttpStatus.CREATED);
	}

	@PatchMapping("/updateBicycles/{id}")
	public ResponseEntity<Bicycles> update(@PathVariable int id, @PathParam("model") String model, @PathParam("brand") String brand,
			@PathParam("year") Integer year) {
		Bicycles bikeUpdate = this.bikes.get(id -1);
		if (model != null)
			bikeUpdate.setModel(model);
		if (brand != null)
			bikeUpdate.setBrand(brand);
		if (year != null)
			bikeUpdate.setYear(year);

		return new ResponseEntity<Bicycles>(bikeUpdate, HttpStatus.CREATED);
	}
	
//	public void update(@PathVariable int id, @PathParam("model") String model, @PathParam("brand") String brand,
//			@PathParam("year") int year) 
//		this.bikes.get(id -1).setModel(model);
//		this.bikes.get(id -1).setBrand(brand);
//		this.bikes.get(id -1).setYear(year);
//	System.out.println("ID: " + id);
//	System.out.println("Model: " + model);
//	System.out.println("Brand: " + brand);
//	System.out.println("Year: " + year);


	@DeleteMapping("/removeBicycles/{id}")
	public ResponseEntity<?> delete(@PathVariable int id) {
		this.bikes.remove(id -1);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
		
	}

}
