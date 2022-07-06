package com.example.demo.BicyclesExample.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.BicyclesExample.entity.Bicycles;

@Repository
public interface BicyclesRepo extends JpaRepository<Bicycles, Integer> {

	Bicycles findByModelIgnoreCase(String model);

	Bicycles findByBrandIgnoreCase(String brand);
}
