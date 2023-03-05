package com.cristobalcifuentes.models.clients;

import java.util.Set;

public class CharacterClient {

	private Integer id;
	private String name;
	private String status;
	private String species;
	private String type;
	private String gender;
	private OriginLocationClient origin;
	private OriginLocationClient location;
	private Set<String> episode;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public OriginLocationClient getOrigin() {
		return origin;
	}

	public void setOrigin(OriginLocationClient origin) {
		this.origin = origin;
	}

	public OriginLocationClient getLocation() {
		return location;
	}

	public void setLocation(OriginLocationClient location) {
		this.location = location;
	}

	public Set<String> getEpisode() {
		return episode;
	}

	public void setEpisode(Set<String> episode) {
		this.episode = episode;
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
