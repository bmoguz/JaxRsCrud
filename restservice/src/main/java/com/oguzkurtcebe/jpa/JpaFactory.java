package com.oguzkurtcebe.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public interface JpaFactory {
EntityManager geEntityManager();
EntityTransaction geTransaction();

}
