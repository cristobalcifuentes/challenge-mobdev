package com.cristobalcifuentes.models.clients;

import java.util.Set;

public class LocationClient {
	
	private Integer id;
	private String name;
	private String type;
	private String dimension;
	private Set<String> residents;
	private String url;
	private String created;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public Set<String> getResidents() {
		return residents;
	}

	public void setResidents(Set<String> residents) {
		this.residents = residents;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

}
