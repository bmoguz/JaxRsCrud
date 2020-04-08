package com.oguzkurtcebe.test;

import com.oguzkurtcebe.model.Person;
import com.oguzkurtcebe.repository.PersonRepository;
import com.oguzkurtcebe.repository.PersonRepositoryImpl;

public class TestCreate {

public static void main(String[] args) {
	Person person=new Person("Oguz", "akjska2232");
	Person person2=new Person("Taner", "dadssdiaa");
	Person person3=new Person("Ahmet","220dwdl");
	
	PersonRepository personRepository=new PersonRepositoryImpl();
	personRepository.create(person);
	personRepository.create(person2);
	personRepository.create(person3);
	
}
	
}
