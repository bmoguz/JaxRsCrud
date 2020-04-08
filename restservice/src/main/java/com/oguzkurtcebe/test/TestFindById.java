package com.oguzkurtcebe.test;

import com.oguzkurtcebe.repository.PersonRepository;
import com.oguzkurtcebe.repository.PersonRepositoryImpl;

public class TestFindById {

	public static void main(String[] args) {
		PersonRepository prs=new PersonRepositoryImpl();
	
		System.out.println(	prs.findById(2l));
	}
}
