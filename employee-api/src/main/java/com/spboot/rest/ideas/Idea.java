package com.spboot.rest.ideas;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Idea {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;

private String ideaname;
private String ideadescription;
private String createdby;
//private Date createdDate;
private String appcategory;
private String appdescription;
private Timestamp datecreated;

public Idea() {
	super();
}
public Idea(int id, String ideaName, String ideaDescription, String createdBy,
		String appCategory, String appDescription, Timestamp datecreated) {
	super();
	this.id = id;
	this.ideaname = ideaName;
	this.ideadescription = ideaDescription;
	this.createdby = createdBy;
	
	this.appcategory = appCategory;
	this.appdescription = appDescription;
	java.util.Date date = new Date();
	datecreated=new java.sql.Timestamp(date.getTime());
}
public String getDatecreated() {
	return datecreated.toString();
}
public void setDatecreated(Timestamp datecreated) {
	this.datecreated = datecreated;
}
public void setDatecreated(String datecreated) {
	 Timestamp ts = Timestamp.valueOf(datecreated);
	this.datecreated = ts;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getIdeaname() {
	return ideaname;
}
public void setIdeaname(String ideaname) {
	this.ideaname = ideaname;
}
public String getIdeadescription() {
	return ideadescription;
}
public void setIdeadescription(String ideadescription) {
	this.ideadescription = ideadescription;
}
public String getCreatedby() {
	return createdby;
}
public void setCreatedby(String createdby) {
	this.createdby = createdby;
}
public String getAppcategory() {
	return appcategory;
}
public void setAppcategory(String appcategory) {
	this.appcategory = appcategory;
}
public String getAppdescription() {
	return appdescription;
}
public void setAppdescription(String appdescription) {
	this.appdescription = appdescription;
}


}