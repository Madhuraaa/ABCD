package com.demo.mdel;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document("players")
public class Players {
	@Id
	String name;
	String team;
	String type;
	
	
	
	public Players() {
		super();
		
	}
	public Players(String name, String team, String type) {
		super();
		this.name = name;
		this.team = team;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}
