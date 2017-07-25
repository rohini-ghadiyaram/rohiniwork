package com.spboot.rest.ideas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdeaService {
	@Autowired
private IdeaRepo ideaRepo;
	
	public List<Idea> getAllIdeas(){
		List<Idea> ideas=new ArrayList<>();
		ideaRepo.findAll().forEach(ideas::add);	
	
		return ideas;
	}
	public Idea getIdea(int id){
	return ideaRepo.findOne(id);
		//return (Employee) employees.stream().filter(t->t.getId.equals(id).findFirst.get());
	}
	
	public void addIdea(Idea idea){
		ideaRepo.save(idea);
	}
	public void updateIdea(Idea idea,int id){
		ideaRepo.save(idea);
	}
	public void deleteIdea(int id){
		ideaRepo.delete(id);
	}
	}
	

