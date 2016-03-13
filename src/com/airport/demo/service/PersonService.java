package com.airport.demo.service;

import java.util.List;

import com.airport.demo.bo.Person;

public interface PersonService {
	
	public List<Person> getAll();
	
	public Person getPersonById(int id);

	public int insert(Person person);
	
}
