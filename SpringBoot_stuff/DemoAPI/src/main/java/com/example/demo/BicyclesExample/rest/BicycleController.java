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
	public List<Bicycles> getAll() {
		return this.service.getAll();
	}

	@GetMapping("/getBicyclesById/{id}")
	public Bicycles getByID(@PathVariable Integer id) {
		return this.service.getById(id);
	}

	@PostMapping("/createBicycles")
	public ResponseEntity<Bicycles> create(@RequestBody Bicycles bicycle) {
		System.out.println("Created: " + bicycle);
		Bicycles created = this.service.create(bicycle);
		return new ResponseEntity<Bicycles>(created, HttpStatus.CREATED);
	}

	@PatchMapping("/updateBicycles/{id}")
	public Bicycles update(@PathVariable Integer id, @PathParam("model") String model, @PathParam("brand") String brand,
			@PathParam("releaseYear") Integer releaseYear) {
		return this.service.update(id, model, brand, releaseYear);
	}

	@DeleteMapping("/removeBicycles/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id) {
		this.service.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
