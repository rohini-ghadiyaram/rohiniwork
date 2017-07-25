package com.spboot.rest.likes;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.spboot.rest.ideas.Idea;



@Entity
public class likes {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int likeid;
@ManyToOne
@JoinColumn(name = "ideaid")
private Idea idea;

private String likedby;
private Timestamp dateliked;

public likes() {
	super();
}

public likes(int likeId, String likedBy,int ideaId) {
	super();
	//String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	
	
	this.likeid = likeId;

	this.likedby = likedBy;
	java.util.Date date = new Date();
	Timestamp datecreated=new java.sql.Timestamp(date.getTime());
	this.idea=new Idea(ideaId,"","","","","",datecreated);
}




public String getDateliked() {
	return dateliked.toString();
	//return "null";
}

public void setDateliked(Timestamp dateliked) {
	this.dateliked = dateliked;
}
public void setDateliked(String dateliked) {
	 Timestamp ts = Timestamp.valueOf(dateliked);
	this.dateliked = ts;
}
public int getLikeid() {
	return likeid;
}

public void setLikeid(int likeid) {
	this.likeid = likeid;
}

public String getLikedby() {
	return likedby;
}

public void setLikedby(String likedby) {
	this.likedby = likedby;
}

public Idea getIdea() {
	return idea;
}
public void setIdea(Idea idea) {
	this.idea = idea;
}






}