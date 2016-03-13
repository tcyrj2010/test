package com.airport.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.airport.demo.bo.Person;
import com.airport.demo.dao.PersonDao;

@Service
public class PersonServiceImpl implements PersonService {

	@Resource
	private PersonDao personDao;
	
	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}
	
	@Override
	public Person getPersonById(int id) {
		return personDao.getPersonById(id);
	}

	@Override
	public List<Person> getAll() {
		return personDao.getAll();
	}

	@Override
	public int insert(Person person) {
		return personDao.insert(person);
	}



}
