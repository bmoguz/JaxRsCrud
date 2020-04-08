package com.oguzkurtcebe.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.oguzkurtcebe.jpa.JpaFactory;
import com.oguzkurtcebe.jpa.JpaFactoryImpl;
import com.oguzkurtcebe.model.Person;

public class PersonRepositoryImpl implements PersonRepository {

	private JpaFactory jpaFactory = new JpaFactoryImpl();
	private EntityManager entityManager = jpaFactory.geEntityManager();
	private EntityTransaction transaction = jpaFactory.geTransaction();

	@Override
	public Person findById(Long id) {
		
		Person person = entityManager.find(Person.class, id);
		return person;
	}

	@Override
	public List<Person> findAll() {
		return entityManager.createQuery("from Person", Person.class).getResultList();
	}

	@Override
	public void create(Person person) {
		transaction.begin();
		entityManager.persist(person);
		transaction.commit();

	}

	@Override
	public Person update(Person person) {
		 transaction.begin();
		 Person person2 = entityManager.merge(person);
		 transaction.commit();
		 return person2;
	
	}

	@Override
	public void delete(Long id) {
	transaction.begin();
	entityManager.remove(entityManager.getReference(Person.class, id));
	transaction.commit();

	}

	@Override
	public List<Person> findByPassword(String password) {
		return entityManager.createQuery("from Person where password = :password",Person.class).setParameter("password",password)
				.getResultList();
		
	}

}
