package com.finzly.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finzly.entity.Country;

public interface CountryRepo extends JpaRepository<Country, Integer>{

}
