package com.spboot.rest.ideas;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spboot.rest.employees.Employee;



@RestController

public class IdeaController {
	@Autowired
	private IdeaService ideaService;
	
	@RequestMapping("/findallideas") 
	public List<Idea> getAllIdeas(){
		System.out.println("in find all ideas");
		return ideaService.getAllIdeas();
	}
	
	@RequestMapping("/idea/{id}")
	public Idea getIdea(@PathVariable int id){
		return ideaService.getIdea(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/idea")
	public void addIdea(@Validated @RequestBody Idea idea){
		/*Idea newIdea=new Idea();
		newIdea.setIdeaname(idea.getIdeaname());
		newIdea.setIdeadescription(idea.getIdeadescription());
		newIdea.setCreatedby(idea.getCreatedby());
		newIdea.setAppcategory(idea.getAppcategory());
		newIdea.setAppdescription(idea.getAppdescription());*/
		
		java.util.Date date = new Date();
		Timestamp datecreated=new java.sql.Timestamp(date.getTime());
		idea.setDatecreated(datecreated);
		ideaService.addIdea(idea);
		
	}
	@RequestMapping(method=RequestMethod.PUT, value="/idea/{id}")
	public void updateIdea(@RequestBody Idea idea, @PathVariable int id){
		java.util.Date date = new Date();
		Timestamp datecreated=new java.sql.Timestamp(date.getTime());
		idea.setDatecreated(datecreated);
		ideaService.updateIdea(idea, id);
		
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/idea/{id}")
	public void deleteIdea(@PathVariable int id){
		ideaService.deleteIdea(id);
		
	}
	
}
