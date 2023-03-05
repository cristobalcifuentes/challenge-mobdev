package com.cristobalcifuentes.models.dtos;

public class CharacterDto {

	private Integer id;
	private String name;
	private String status;
	private String species;
	private String type;
	private Integer episodeCount;
	private LocationDto origin;

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

	public Integer getEpisodeCount() {
		return episodeCount;
	}

	public void setEpisodeCount(Integer episodeCount) {
		this.episodeCount = episodeCount;
	}

	public LocationDto getOrigin() {
		return origin;
	}

	public void setOrigin(LocationDto origin) {
		this.origin = origin;
	}

	public static CharacterDto.CharacterBuilder builder() {
		return new CharacterDto.CharacterBuilder();
	}

	public static final class CharacterBuilder {

		private Integer id;
		private String name;
		private String status;
		private String species;
		private String type;
		private Integer episodeCount;
		private LocationDto origin;

		private CharacterBuilder() {
		}

		public CharacterDto.CharacterBuilder withId(Integer id) {
			this.id = id;
			return this;
		}

		public CharacterDto.CharacterBuilder withName(String name) {
			this.name = name;
			return this;
		}

		public CharacterDto.CharacterBuilder withStatus(String status) {
			this.status = status;
			return this;
		}

		public CharacterDto.CharacterBuilder withSpecies(String species) {
			this.species = species;
			return this;
		}

		public CharacterDto.CharacterBuilder withType(String type) {
			this.type = type;
			return this;
		}

		public CharacterDto.CharacterBuilder withEpisodeCount(Integer episodeCount) {
			this.episodeCount = episodeCount;
			return this;
		}

		public CharacterDto.CharacterBuilder withOrigin(LocationDto origin) {
			this.origin = origin;
			return this;
		}

		public CharacterDto build() {
			CharacterDto characterDto = new CharacterDto();
			characterDto.setId(this.id);
			characterDto.setName(this.name);
			characterDto.setStatus(this.status);
			characterDto.setSpecies(this.species);
			characterDto.setType(this.type);
			characterDto.setEpisodeCount(this.episodeCount);
			characterDto.setOrigin(this.origin);
			return characterDto;
		}

	}

}
