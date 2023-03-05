package com.cristobalcifuentes.api.consumer.implement.rickandmorty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cristobalcifuentes.api.consumer.interfaces.ICharacterApiConsumer;
import com.cristobalcifuentes.models.clients.CharacterClient;

@Service
public class CharacterApiConsumerRickAndMorty implements ICharacterApiConsumer{
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${url.api.rick-and-morty}")
	private String urlApi;
	
	 private static final String CHARACTER_ENDPOINT = "/character/";

	@Override
	public CharacterClient getCharacterById(Integer idCharacter) throws Exception {
		String requestUrl = urlApi + CHARACTER_ENDPOINT + idCharacter;
		ResponseEntity<CharacterClient> response;
			response = restTemplate.getForEntity(requestUrl, CharacterClient.class);
			if (response.getStatusCode() == HttpStatus.OK) {
				return response.getBody();
			} else {
				throw new Exception("error api rick and morty");
			}
	}
}
