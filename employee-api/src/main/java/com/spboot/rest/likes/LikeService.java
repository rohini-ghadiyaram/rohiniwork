package com.spboot.rest.likes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikeService {
	@Autowired
private LikeRepo likeRepo;
	
	public List<likes> getAllLikes(int id){
		List<likes> likes=new ArrayList<>();
		likeRepo.findByIdeaId(id).forEach(likes::add);	
	
		return likes;
	}
	public likes getLike(int id){
	return likeRepo.findOne(id);
		//return (Employee) employees.stream().filter(t->t.getId.equals(id).findFirst.get());
	}
	
	public void addLike(likes like){
		System.out.println("saving like obj");
		likeRepo.save(like);
	}
	public void updateLike(likes like){
		likeRepo.save(like);
	}
	public void deleteLike(int id){
		likeRepo.delete(id);
	}
	}
	

