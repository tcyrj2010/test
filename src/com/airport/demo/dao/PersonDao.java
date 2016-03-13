package com.airport.demo.dao;

import java.util.List;

import com.airport.demo.bo.Person;

public interface PersonDao {

	public List<Person> getAll();
	
	public Person getPersonById(int id);

	public int insert(Person person);
}
