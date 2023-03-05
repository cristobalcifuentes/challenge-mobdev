package com.cristobalcifuentes.mapper;

import org.springframework.stereotype.Component;

import com.cristobalcifuentes.models.clients.CharacterClient;
import com.cristobalcifuentes.models.dtos.CharacterDto;
import com.cristobalcifuentes.models.dtos.LocationDto;

@Component
public class CharacterClienttoClientDtoMapper {

	public CharacterDto mappingTo(CharacterClient characterClient) {
		return CharacterDto.builder()
				.withId(characterClient.getId())
				.withName(characterClient.getName())
				.withStatus(characterClient.getStatus())
				.withSpecies(characterClient.getSpecies())
				.withType(characterClient.getType())
				.withEpisodeCount(characterClient.getEpisode().size())
				.withOrigin(LocationDto.builder().withUrl(characterClient.getOrigin().getUrl()).build())
				.build();
	}
}
