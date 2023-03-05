package com.cristobalcifuentes.api.consumer.implement.rickandmorty;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cristobalcifuentes.api.consumer.interfaces.ICharacterApiConsumer;
import com.cristobalcifuentes.models.clients.CharacterClient;

@Service
public class CharacterApiConsumerRickAndMorty extends ApiConsumerRickAndMorty implements ICharacterApiConsumer{
	
	@Override
	public CharacterClient getCharacterById(Integer idCharacter) throws Exception {
		String requestUrl = urlApi + CHARACTER_ENDPOINT + idCharacter;
		ResponseEntity<CharacterClient> response;
			response = restTemplate.getForEntity(requestUrl, CharacterClient.class);
			if (response.getStatusCode() == HttpStatus.OK) {
				return response.getBody();
			} else {
				throw new Exception(ERROR_API);
			}
	}
}
