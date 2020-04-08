package com.oguzkurtcebe.test;

import java.util.List;

import com.oguzkurtcebe.jpa.JpaFactory;
import com.oguzkurtcebe.jpa.JpaFactoryImpl;
import com.oguzkurtcebe.model.Person;
import com.oguzkurtcebe.repository.PersonRepository;
import com.oguzkurtcebe.repository.PersonRepositoryImpl;

public class TestFindAllPerson {
public static void main(String[] args) {
	
	PersonRepository prs=new PersonRepositoryImpl();
	List<Person> list = prs.findAll();
	
	for (Person person : list) {
		System.out.println("Liste:"+person);
	}

}
}
