package com.rent_car.vehicle_service.Controller;

import com.rent_car.vehicle_service.Repository.TypeRepository;
import com.rent_car.vehicle_service.Model.Type;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Api("Api for operation on vehicles type")
@RestController
@RequestMapping("/type")
public class TypeController {
	@Autowired
	private TypeRepository typeRepository;

	// Create a new type
	@PostMapping
	public ResponseEntity<Type> createType(@RequestBody Type type) {
		Type createdType = typeRepository.save(type);
		return new ResponseEntity<>(createdType, HttpStatus.CREATED);
	}

	// Get all types
	@GetMapping
	public ResponseEntity<List<Type>> getAllTypes() {
		List<Type> types = typeRepository.findAll();
		return new ResponseEntity<>(types, HttpStatus.OK);
	}

	// Get a type by ID
	@GetMapping("/{id}")
	public ResponseEntity<Type> getTypeById(@PathVariable("id") int id) {
		Optional<Type> optionalType = typeRepository.findById(id);
		if (optionalType.isPresent()) {
			Type type = optionalType.get();
			return new ResponseEntity<>(type, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	// Update a type
	@PutMapping("/{id}")
	public ResponseEntity<Type> updateType(@PathVariable("id") int id, @RequestBody Type updatedType) {
		Optional<Type> optionalType = typeRepository.findById(id);
		if (optionalType.isPresent()) {
			Type type = optionalType.get();
			type.setVehicleType(updatedType.getVehicleType());
			type.setBasePrice(updatedType.getBasePrice());
			type.setKilometerPrice(updatedType.getKilometerPrice());
			// Update other properties as needed
			Type savedType = typeRepository.save(type);
			return new ResponseEntity<>(savedType, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	// Delete a type
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteType(@PathVariable("id") int id) {
		Optional<Type> optionalType = typeRepository.findById(id);
		if (optionalType.isPresent()) {
			typeRepository.delete(optionalType.get());
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	// ...

	// Get a type by vehicleType
	@GetMapping("/string/{vehicleType}")
	public ResponseEntity<Type> getTypeByVehicleType(@PathVariable("vehicleType") String vehicleType) {
		Optional<Type> optionalType = typeRepository.findByVehicleType(vehicleType);
		if (optionalType.isPresent()) {
			Type type = optionalType.get();
			return new ResponseEntity<>(type, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

// ...

}
