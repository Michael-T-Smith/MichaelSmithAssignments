package com.driverslicense.mvc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.driverslicense.mvc.models.License;

public interface LicenseRepository extends CrudRepository<License, Long>{
	public List<License> findAll();
	public License findTopByOrderByNumberDesc();
}
