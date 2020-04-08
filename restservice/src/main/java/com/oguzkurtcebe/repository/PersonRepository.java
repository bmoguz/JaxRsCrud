package com.oguzkurtcebe.repository;

import java.util.List;

import com.oguzkurtcebe.model.Person;

public interface PersonRepository {

	List<Person> findByPassword(String password);
	Person findById(Long id);
	List<Person>findAll();
	void create(Person person);
	Person update(Person person);
	void delete(Long id);
	
	
	

}
