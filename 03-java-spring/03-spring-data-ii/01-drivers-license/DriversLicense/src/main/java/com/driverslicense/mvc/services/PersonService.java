package com.driverslicense.mvc.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.driverslicense.mvc.models.License;
import com.driverslicense.mvc.models.Person;
import com.driverslicense.mvc.repository.LicenseRepository;
import com.driverslicense.mvc.repository.PersonRepository;

@Service
public class PersonService {
	
	private final PersonRepository personRepo;
	private final LicenseRepository licRepo;
	public PersonService(PersonRepository pRepo, LicenseRepository licRepo) {
		this.personRepo = pRepo;
		this.licRepo = licRepo;
	}
	public Person getPerson(Long id) {
		return personRepo.findById(id).orElse(null);
	}
	public List<Person> getPeople() {
		return personRepo.findAll();
	}
	public List<Person> getUnlicensedPeople() {
		return personRepo.findByLicenseIdIsNull();
	}
	public Person createPerson(Person p) {
		return personRepo.save(p);
	}
	public License createLicense(License l) {
		l.setNumber(this.generateLicenseNumber());
		return licRepo.save(l);
	}
	public int generateLicenseNumber() {
		License l = licRepo.findTopByOrderByNumberDesc();
		if(l == null)
			return 1;
		int largestNumber = l.getNumber();
		largestNumber++;
		return (largestNumber);
	}
	
	public void deletePersonFromDatabase(Long id) {
		this.personRepo.deleteById(id);
	}

}
