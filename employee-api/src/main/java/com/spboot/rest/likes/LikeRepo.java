package com.spboot.rest.likes;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spboot.rest.employees.Employee;


public interface LikeRepo extends CrudRepository<likes,Integer>{
	
	//public List<likes> getLikesByIdea(int ideaId);
	public List<likes> findByIdeaId(int ideaId);

}
