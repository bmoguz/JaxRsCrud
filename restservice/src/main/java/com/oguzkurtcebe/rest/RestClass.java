package com.oguzkurtcebe.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.oguzkurtcebe.model.Person;
import com.oguzkurtcebe.repository.PersonRepository;
import com.oguzkurtcebe.repository.PersonRepositoryImpl;

@Path("rest")
public class RestClass {

	PersonRepository personRepository = new PersonRepositoryImpl();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("person/{id}")
	public Response getPerson(@PathParam("id") Long id) {
		Person person = personRepository.findById(id);
		return Response.ok(person).build();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("allpersons")
	public Response allPerson() {
		List<Person> list = personRepository.findAll();
		return Response.ok(list).build();
	}
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("person")
	public Response createPerson(Person person) {
		personRepository.create(person);
		return Response.ok(person).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("persons")
	public Response getFindByPassword(@QueryParam("psw") String password){
		List<Person> list = personRepository.findByPassword(password);
		return Response.ok(list).build();
	}
	
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("person/{id}")
	public Response updatePerson(@PathParam("id") Long id,Person person) {
		person.setId(id);
		personRepository.update(person);	
		return Response.ok(person).build();
	}

	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("person/{id}")
	public Response deletePerson(@PathParam("id") Long id) {
		personRepository.delete(id);
		return Response.ok().build();
	}
}
