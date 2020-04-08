package com.oguzkurtcebe.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaFactoryImpl implements JpaFactory {
private EntityManager entityManager=null;
	
	@Override
	public EntityManager geEntityManager() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("persistence-unit");
        this.entityManager=factory.createEntityManager();
        return entityManager;
	}

	@Override
	public EntityTransaction geTransaction() {
		EntityTransaction transaction=entityManager.getTransaction();
		return transaction;

}
}