package com.example.demo.BicyclesExample.rest;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.example.demo.BicyclesExample.service.BicycleService;

@RestController
public class BicycleController {

	@Autowired
	private BicycleService service; // dependency

	@GetMapping("/demoBicycles")
	public Bicycles getDemoBicycles() {
		return new Bicycles("Allez", "Specialized", 2021);
	}

	@GetMapping("/getBicycles")
	public ResponseEntity<List<Bicycles>> getAll() {
		return new ResponseEntity<List<Bicycles>>(this.service.getAll(), HttpStatus.OK);
	}

	@GetMapping("/getBicyclesById/{id}")
	public Bicycles getByID(@PathVariable int id) {
		return this.service.getById(id);
	}

	@PostMapping("/createBicycles")
	public ResponseEntity<Bicycles> create(@RequestBody Bicycles bicycle) {
		System.out.println("Created: " + bicycle);
		Bicycles created = this.service.create(bicycle);
		return new ResponseEntity<Bicycles>(created, HttpStatus.CREATED);
	}

	@PatchMapping("/updateBicycles/{id}")
	public Bicycles update(@PathVariable int id, @PathParam("model") String model, @PathParam("brand") String brand,
			@PathParam("year") Integer year) {
		return this.service.update(id, model, brand, year);
	}

	@DeleteMapping("/removeBicycles/{id}")
	public ResponseEntity<?> delete(@PathVariable int id) {
		this.service.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
