package com.spboot.rest.likes;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spboot.rest.employees.Employee;
import com.spboot.rest.ideas.Idea;



@RestController

public class LikeController {
	@Autowired
	private LikeService likeService;
	
	@RequestMapping("/idea/{id}/likes") 
	public List<likes> getAlllikes(@PathVariable int id){
		return likeService.getAllLikes(id);
	}
	
	@RequestMapping("/idea/{ideaId}/likes/{id}")
	public likes getLike(@PathVariable int id){
		return likeService.getLike(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/idea/{ideaId}/likes")
	public void addLike(@RequestBody likes like, @PathVariable int ideaId){
		System.out.println("in addlike1");
		java.util.Date date = new Date();
		Timestamp datecreated=new java.sql.Timestamp(date.getTime());
		like.setIdea(new Idea(ideaId,"","","","","",datecreated));
		
		System.out.println("in addlike");
		like.setDateliked(datecreated);
		likeService.addLike(like);
		
	}
	@RequestMapping(method=RequestMethod.PUT, value="idea/{ideaId}/likes/{id}")
	public void updateLike(@RequestBody likes like, @PathVariable int ideaId,@PathVariable int id){
		java.util.Date date = new Date();
		Timestamp datecreated=new java.sql.Timestamp(date.getTime());
		like.setIdea(new Idea(ideaId,"","","","","",datecreated));
		likeService.updateLike(like);
		
	}
	@RequestMapping(method=RequestMethod.DELETE,value="idea/{ideaId}/likes/{id}")
	public void deleteLike(@PathVariable int id){
		likeService.deleteLike(id);
		
	}
	
}
