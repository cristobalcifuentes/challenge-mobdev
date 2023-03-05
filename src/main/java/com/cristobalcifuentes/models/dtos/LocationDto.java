package com.cristobalcifuentes.models.dtos;

import java.util.Set;

public class LocationDto {

	private String name;
	private String url;
	private String dimension;
	private Set<String> residents;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
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
	
	

	public static LocationDto.LocationBuilder builder() {
		return new LocationDto.LocationBuilder();
	}

	
	public static final class LocationBuilder {

		private String name;
		private String url;
		private String dimension;
		private Set<String> residents;

		private LocationBuilder() {
		}

		public LocationDto.LocationBuilder withName(String name) {
			this.name = name;
			return this;
		}

		public LocationDto.LocationBuilder withUrl(String url) {
			this.url = url;
			return this;
		}

		public LocationDto.LocationBuilder withDimension(String dimension) {
			this.dimension = dimension;
			return this;
		}

		public LocationDto.LocationBuilder withResidents(Set<String> residents) {
			this.residents = residents;
			return this;
		}

		public LocationDto build() {
			LocationDto location = new LocationDto();
			location.setName(this.name);
			location.setUrl(this.url);
			location.setDimension(this.dimension);
			location.setResidents(this.residents);
			return location;
		}

	}

}
