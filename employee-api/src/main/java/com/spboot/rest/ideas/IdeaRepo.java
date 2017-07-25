package com.spboot.rest.ideas;

import org.springframework.data.repository.CrudRepository;

import com.spboot.rest.employees.Employee;


public interface IdeaRepo extends CrudRepository<Idea,Integer>{

}
