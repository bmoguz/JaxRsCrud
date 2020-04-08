package com.oguzkurtcebe.test;

import com.oguzkurtcebe.model.Person;
import com.oguzkurtcebe.repository.PersonRepository;
import com.oguzkurtcebe.repository.PersonRepositoryImpl;

public class TestUpdate {
public static void main(String[] args) {
	
	PersonRepository prs=new PersonRepositoryImpl();
	Person person = prs.findById(6l);
	person.setName("muhammed");
	person.setPassword("elmas");
	prs.update(person);
}
}
