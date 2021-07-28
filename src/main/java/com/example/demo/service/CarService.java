package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.domain.Car;

public interface CarService {
	
	/**
	 * It retrieves all cars from databae
	 * @return
	 */
	List<Car> findAll();
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	Optional<Car> findOne(Long id);

}
