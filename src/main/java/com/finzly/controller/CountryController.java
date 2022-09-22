package com.finzly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finzly.entity.Country;
import com.finzly.service.CountryService;

@RestController
@RequestMapping("/country")
public class CountryController {

	@Autowired
	private CountryService cService;
	
	@PostMapping("/save")
	ResponseEntity<Country> saveCountry(@RequestBody Country country){
		Country savedCountry = this.cService.saveCountry(country);
		return new ResponseEntity<Country>(savedCountry,HttpStatus.CREATED);
	}
	@GetMapping("/all")
	ResponseEntity<List<Country>> getAllCountrys(){
		List<Country> allCountrys = this.cService.getAllCountries();
		return new ResponseEntity<List<Country>>(allCountrys,HttpStatus.CREATED);
		
	}
	
	@PutMapping("/update")
	ResponseEntity<Country> updateCountry(@RequestBody Country country){
		
		Country updatedCountry = this.cService.updateCountry(country);
		return new ResponseEntity<Country>(updatedCountry,HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/delete/{countryId}")
	ResponseEntity<Country> deleteCountry(@PathVariable Integer countryId){
		
		Country deletedCountry = this.cService.deleteCountry(countryId);
		return new ResponseEntity<Country>(deletedCountry,HttpStatus.OK);
	}
}
